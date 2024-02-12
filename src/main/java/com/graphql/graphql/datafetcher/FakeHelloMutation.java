package com.graphql.graphql.datafetcher;

import com.graphql.graphql.datasource.fake.FakeHelloDataSource;
import com.graphql.graphql.model.Hello;
import com.graphql.graphql.model.HelloInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@DgsComponent
public class FakeHelloMutation {


    @DgsData(parentType = "Mutation", field = "addHello")
    public Integer addHello(@InputArgument(name= "helloInput") HelloInput input) {

        if (ObjectUtils.isEmpty(input)) {
            return 0;
        }

        List<Hello> helloList = FakeHelloDataSource.HELLO_LIST;
        helloList.add(Hello.builder()
                .text(input.getText())
                .randomNumber(input.getNumber()).build());

        return  helloList.size();

    }

    @DgsData(parentType = "Mutation", field = "replaceHelloText")
    public List<Hello> replaceHelloText(@InputArgument(name= "helloInput") HelloInput input,@InputArgument(name= "textReplaced") String replaceText) {

        if (ObjectUtils.isEmpty(input)) {
            return List.of();
        }

        List<Hello> helloList = FakeHelloDataSource.HELLO_LIST;

       var helloOptional = helloList.stream().filter(x -> x.getText().equalsIgnoreCase(replaceText)).findFirst();
        Hello newHello = new Hello();
       if(helloOptional.isPresent()){
           BeanUtils.copyProperties(helloOptional.get(),newHello);
           helloOptional.ifPresent(helloList::remove);
       }


        helloList.add(Hello.builder()
                .text(input.getText())
                .randomNumber(newHello.getRandomNumber()).build());

        return  helloList;

    }

    @DgsData(parentType = "Mutation", field = "deleteHello")
    public Integer deleteHello(@InputArgument(name= "number") Integer input) {

        if (ObjectUtils.isEmpty(input)) {
            return 0;
        }

        List<Hello> helloList = FakeHelloDataSource.HELLO_LIST;

        var helloOptional = helloList.stream().filter(x -> Objects.equals(x.getRandomNumber(), input)).findFirst();

        helloOptional.ifPresent(helloList::remove);

        return  input;

    }



}
