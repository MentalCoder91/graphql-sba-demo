package com.graphql.graphql.exceptions.handler;

import com.graphql.graphql.exceptions.ProblemzAuthenticationException;
import com.netflix.graphql.dgs.exceptions.DefaultDataFetcherExceptionHandler;
import com.netflix.graphql.types.errors.ErrorType;
import com.netflix.graphql.types.errors.TypedGraphQLError;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class ProblemzGraphqlExceptionHandler implements DataFetcherExceptionHandler {

    private final DefaultDataFetcherExceptionHandler defaultDataFetcherExceptionHandler
                = new DefaultDataFetcherExceptionHandler();
    @Override
    public CompletableFuture<DataFetcherExceptionHandlerResult> handleException(DataFetcherExceptionHandlerParameters handlerParameters) {

        var exception = handlerParameters.getException();

        if(exception instanceof ProblemzAuthenticationException){

            var graphQlError = TypedGraphQLError.newBuilder()
                    .message(exception.getMessage())
                    .path(handlerParameters.getPath())
                    //.errorType(ErrorType.UNAUTHENTICATED)
                    .errorDetail(new ProblemzErrorDetail())
                    .build();

            var result = DataFetcherExceptionHandlerResult.newResult().error(graphQlError).build();
            return CompletableFuture.completedFuture(result);
        }

        return defaultDataFetcherExceptionHandler.handleException(handlerParameters);
    }
}
