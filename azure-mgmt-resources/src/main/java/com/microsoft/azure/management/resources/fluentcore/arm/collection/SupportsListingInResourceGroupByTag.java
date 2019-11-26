/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.collection;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.management.PagedList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Provides access to listing Azure resources of a specific type based on their tag.
 * <p>
 * (Note: this interface is not intended to be implemented by user code)
 *
 * @param <T> the fluent type of the resource
 */
public interface SupportsListingInResourceGroupByTag<T> {
    /**
     * Lists all the resources with the specified tag.
     *
     * @param resourceGroupName the name of the resource group
     * @param tagName tag's name as the key
     * @param tagValue tag's value
     * @return list of resources
     */
    PagedList<T> listByTag(String resourceGroupName, String tagName, String tagValue);

    /**
     * Lists all the resources with the specified tag.
     *
     * @param resourceGroupName the name of the resource group
     * @param tagName tag's name as the key
     * @param tagValue tag's value
     * @return a representation of the deferred computation of this call, returning the requested resources
     */
    PagedFlux<T> listByTagAsync(String resourceGroupName, String tagName, String tagValue);
}
