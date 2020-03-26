// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedInstanceLongTermRetentionPolicies.
 */
public final class ManagedInstanceLongTermRetentionPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ManagedInstanceLongTermRetentionPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedInstanceLongTermRetentionPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ManagedInstanceLongTermRetentionPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(ManagedInstanceLongTermRetentionPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientManagedInstanceLongTermRetentionPolicies to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientManagedInstanceLongTermRetentionPolicies")
    private interface ManagedInstanceLongTermRetentionPoliciesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ManagedInstanceLongTermRetentionPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/backupLongTermRetentionPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyListResultInner>> listByDatabase(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/backupLongTermRetentionPolicies/{policyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("managedInstanceName") String managedInstanceName, @PathParam("databaseName") String databaseName, @PathParam("policyName") String policyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") ManagedInstanceLongTermRetentionPolicyInner parameters);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyListResultInner>> listByDatabaseNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner>> getWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String policyName = "default";
        final String apiVersion = "2018-06-01-preview";
        return service.get(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, policyName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Gets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceLongTermRetentionPolicyInner> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, databaseName)
            .flatMap((SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceLongTermRetentionPolicyInner get(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getAsync(resourceGroupName, managedInstanceName, databaseName).block();
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        final String policyName = "default";
        final String apiVersion = "2018-06-01-preview";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, policyName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceLongTermRetentionPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = createOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters);
        return this.client.<ManagedInstanceLongTermRetentionPolicyInner, ManagedInstanceLongTermRetentionPolicyInner>getLroResultAsync(mono, this.client.getHttpPipeline(), ManagedInstanceLongTermRetentionPolicyInner.class, ManagedInstanceLongTermRetentionPolicyInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceLongTermRetentionPolicyInner createOrUpdate(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, managedInstanceName, databaseName, parameters).block();
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceLongTermRetentionPolicyInner>> listByDatabaseSinglePageAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        final String apiVersion = "2018-06-01-preview";
        return service.listByDatabase(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, this.client.getSubscriptionId(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ManagedInstanceLongTermRetentionPolicyInner> listByDatabaseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ManagedInstanceLongTermRetentionPolicyInner> listByDatabase(String resourceGroupName, String managedInstanceName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName));
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        final String policyName = "default";
        final String apiVersion = "2018-06-01-preview";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, managedInstanceName, databaseName, policyName, this.client.getSubscriptionId(), apiVersion, parameters);
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagedInstanceLongTermRetentionPolicyInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters)
            .flatMap((SimpleResponse<ManagedInstanceLongTermRetentionPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Sets a managed database's long term retention policy.
     * 
     * @param resourceGroupName 
     * @param managedInstanceName 
     * @param databaseName 
     * @param parameters A long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagedInstanceLongTermRetentionPolicyInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, String databaseName, ManagedInstanceLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, managedInstanceName, databaseName, parameters).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ManagedInstanceLongTermRetentionPolicyInner>> listByDatabaseNextSinglePageAsync(String nextLink) {
        return service.listByDatabaseNext(nextLink)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null));
    }
}
