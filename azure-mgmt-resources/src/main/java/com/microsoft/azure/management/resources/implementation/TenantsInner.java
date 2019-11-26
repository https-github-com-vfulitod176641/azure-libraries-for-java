/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * <p>
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import com.azure.core.annotation.*;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Page;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.PagedList;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined
 * in Tenants.
 */
public class TenantsInner {
    private final ClientLogger logger = new ClientLogger(TenantsInner.class);

    /**
     * The Retrofit service to perform REST calls.
     */
    private TenantsService service;
    /**
     * The service client containing this operation class.
     */
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of TenantsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client   the instance of the service client containing this operation class.
     */
    public TenantsInner(HttpPipeline retrofit, SubscriptionClientImpl client) {
        this.service = RestProxy.create(TenantsService.class, retrofit);
        this.client = client;
    }


    public PagedList<TenantIdDescriptionInner> list() {
        PagedResponse<TenantIdDescriptionInner> response = listTenantsFirstPage().block();
        return new PagedList<TenantIdDescriptionInner>(response) {
            @Override
            public Page<TenantIdDescriptionInner> nextPage(String nextPageLink) {
                return listTenantsNextPage(nextPageLink).block();
            }
        };
    }

    public PagedFlux<TenantIdDescriptionInner> listAsync() {
        return new PagedFlux<>(
                () -> listTenantsFirstPage(),
                continuationToken -> listTenantsNextPage(continuationToken));
    }

    /*
     * Calls the service and retrieve first page result. It makes one call and retrieve {@code
     * DEFAULT_MAX_PAGE_RESULTS} values.
     */
    private Mono<PagedResponse<TenantIdDescriptionInner>> listTenantsFirstPage() {
        try {
            return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
                    .doOnRequest(ignored -> logger.info("Listing deployments"))
                    .doOnSuccess(response -> logger.info("Listed deployments"))
                    .doOnError(error -> logger.warning("Failed to list deployments", error));
        } catch (RuntimeException ex) {
            return Mono.error(logger.logExceptionAsError(Exceptions.propagate(ex)));
        }
    }

    /*
     * Gets attributes of all the secrets given by the {@code nextPageLink} that was retrieved from a call to
     * {@link SecretAsyncClient#listSecrets()}.
     *
     * @param continuationToken The {@link PagedResponse#nextLink()} from a previous, successful call to one of the
     * list operations.
     * @return A {@link Mono} of {@link PagedResponse<SecretProperties>} from the next page of results.
     */
    private Mono<PagedResponse<TenantIdDescriptionInner>> listTenantsNextPage(String continuationToken) {
        try {
            return service.listNext(continuationToken, this.client.acceptLanguage(), this.client.userAgent())
                    .doOnRequest(ignoredValue -> logger.info("Retrieving the next secrets page - Page {}", continuationToken))
                    .doOnSuccess(response -> logger.info("Retrieved the next secrets page - Page {}", continuationToken))
                    .doOnError(error -> logger.warning("Failed to retrieve the next secrets page - Page {}",
                            continuationToken, error));
        } catch (RuntimeException ex) {
            return Mono.error(logger.logExceptionAsError(Exceptions.propagate(ex)));
        }
    }

    /**
     * The interface defining all the services for Tenants to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantsService {
        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Tenants list"})
        @Get("tenants")
        Mono<PagedResponse<TenantIdDescriptionInner>> list(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Tenants listNext"})
        @Get("{nextUrl}")
        Mono<PagedResponse<TenantIdDescriptionInner>> listNext(@PathParam("nextUrl") String nextUrl, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);
    }
}
