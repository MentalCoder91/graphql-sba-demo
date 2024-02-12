package com.graphql.graphql.util;

import com.graphql.graphql.datasource.problemz.entity.Problemz;
import com.graphql.graphql.datasource.problemz.entity.Solutionz;
import com.graphql.graphql.datasource.problemz.entity.Userz;
import com.graphql.graphql.datasource.problemz.entity.UserzToken;
import com.graphql.graphql.model.problemiz.*;
import org.apache.commons.lang3.StringUtils;
import org.ocpsoft.prettytime.PrettyTime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class GraphqlBeanMapper {


    private static final PrettyTime PRETTY_TIME = new PrettyTime();

    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHours(6);


    public static User mapToGraphql(Userz original){
        var result = new User();
        var createDateTime = original.getCreationTimestamp().atOffset(ZONE_OFFSET);

        result.setAvatar(original.getAvatar());
        result.setCreateDateTime(createDateTime);
        result.setDisplayName(original.getDisplayName());
        result.setEmail(original.getEmail());
        result.setId(original.getId().toString());
        result.setUsername(original.getUsername());

        return result;
    }

    public static Problem mapToGraphql(Problemz original){

        var result = new Problem();
        var createDateTime = original.getCreationTimestamp().atOffset(ZONE_OFFSET);
        var author = mapToGraphql(original.getCreatedBy());
        var convertedSolutions = original.getSolutions().stream()
                    .sorted(Comparator.comparing(Solutionz::getCreationTimestamp).reversed())
                .map(GraphqlBeanMapper::mapToGraphql)
                .collect(Collectors.toList());
        var tagList = List.of(original.getTags().split(","));

        result.setAuthor(author);
        result.setContent(original.getContent());
        result.setCreateDateTime(createDateTime);
        result.setId(original.getId().toString());
        result.setSolutions(convertedSolutions);
        result.setTags(tagList);
        result.setTitle(original.getTitle());
        result.setSolutionCount(convertedSolutions.size());
        result.setPrettyCreateDateTime(PRETTY_TIME.format(createDateTime));

        return result;
    }

    public static Solution mapToGraphql(Solutionz original){

        var result = new Solution();
        var createDateTime = original.getCreationTimestamp().atOffset(ZONE_OFFSET);
        var author = mapToGraphql(original.getCreatedBy());
        var category = StringUtils.equalsIgnoreCase(
                original.getCategory(), SolutionCategory.EXPLANATION.toString()) ?
                SolutionCategory.EXPLANATION : SolutionCategory.REFERENCE;

        result.setAuthor(author);
        result.setCategory(category);
        result.setContent(original.getContent());
        result.setCreateDateTime(createDateTime);
        result.setId(original.getId().toString());
        result.setVoteAsBadCount(original.getVoteBadCount());
        result.setVoteAsGoodCount(original.getVoteGoodCount());
        result.setPrettyCreateDateTime(PRETTY_TIME.format(createDateTime));

        return result;
    }

    public static UserAuthToken mapToGraphql(UserzToken original) {
        var result = new UserAuthToken();
        var expiryDateTime = original.getExpiryTimestamp().atOffset(ZONE_OFFSET);

        result.setAuthToken(original.getAuthToken());
        result.setExpiryTime(expiryDateTime);

        return result;
    }


    public static Problemz mapToEntity(ProblemCreateInput original,Userz author) {

        var result = new Problemz();

        result.setTags(original.getTags().stream().collect(Collectors.joining(",")));
        result.setTitle(original.getTitle());
        result.setContent(original.getContent());
        result.setCreatedBy(author);
        result.setCreationTimestamp(LocalDateTime.now());
        result.setId(UUID.randomUUID());
        result.setSolutions(List.of());
        return result;
    }



    public static Solutionz mapToEntity(SolutionCreateInput original, Userz author,Problemz problemz){

        var result= new Solutionz();

        result.setContent(original.getContent());
        result.setCreatedBy(author);
        result.setVoteBadCount(0);
        result.setVoteGoodCount(0);
        result.setCreationTimestamp(LocalDateTime.now());
        result.setProblemzId(problemz);
        result.setCategory(original.getCategory().toString());
        result.setId(UUID.randomUUID());
        return result;

    }

    public static Userz mapToEntity(UserCreateInput original){

        var result = new Userz();

        result.setId(UUID.randomUUID());
        result.setActive(true);
        result.setEmail(original.getEmail());
        result.setHashedPassword(HashUtil.hashBcrypt(original.getPassword()));
        result.setUsername(original.getUsername());
        result.setDisplayName(original.getDisplayName());
        result.setAvatar(original.getAvatar());

        return result;
    }


}
