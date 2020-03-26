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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DatabaseThreatDetectionPolicies.
 */
public final class DatabaseThreatDetectionPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private DatabaseThreatDetectionPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseThreatDetectionPoliciesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseThreatDetectionPoliciesInner(SqlManagementClientImpl client) {
        this.service = RestProxy.create(DatabaseThreatDetectionPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * SqlManagementClientDatabaseThreatDetectionPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientDatabaseThreatDetectionPolicies")
    private interface DatabaseThreatDetectionPoliciesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DatabaseSecurityAlertPolicyInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<DatabaseSecurityAlertPolicyInner>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("securityAlertPolicyName") String securityAlertPolicyName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") DatabaseSecurityAlertPolicyInner parameters);
    }

    /**
     * Gets a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DatabaseSecurityAlertPolicyInner>> getWithResponseAsync(String resourceGroupName, String serverName, String databaseName) {
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, securityAlertPolicyName, apiVersion);
    }

    /**
     * Gets a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> getAsync(String resourceGroupName, String serverName, String databaseName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMap((SimpleResponse<DatabaseSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner get(String resourceGroupName, String serverName, String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).block();
    }

    /**
     * Creates or updates a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<DatabaseSecurityAlertPolicyInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        final String securityAlertPolicyName = "default";
        final String apiVersion = "2014-04-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, serverName, databaseName, securityAlertPolicyName, apiVersion, parameters);
    }

    /**
     * Creates or updates a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMap((SimpleResponse<DatabaseSecurityAlertPolicyInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a database's threat detection policy.
     * 
     * @param resourceGroupName 
     * @param serverName 
     * @param databaseName 
     * @param parameters Contains information about a database Threat Detection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String serverName, String databaseName, DatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).block();
    }
}
