/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.collection;

import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.CreatedResources;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Providing access to creating a batch of Azure top level resources of same type.
 * <p>
 * (Note: this interface is not intended to be implemented by user code)
 * @param <ResourceT> the top level Azure resource type
 */
public interface SupportsBatchCreation<ResourceT extends Indexable> {
    /**
     * Executes the create requests on a collection (batch) of resources.
     *
     * @param creatables the creatables in the batch
     * @return the batch operation result from which created resources in this batch can be accessed.
     */
    CreatedResources<ResourceT> create(Creatable<ResourceT>... creatables);

    /**
     * Executes the create requests on a collection (batch) of resources.
     *
     * @param creatables the list of creatables in the batch
     * @return the batch operation result from which created resources in this batch can be accessed.
     */
    CreatedResources<ResourceT> create(List<Creatable<ResourceT>> creatables);

    /**
     * Puts the requests to create a batch of resources into the queue and allow the HTTP client to execute it when
     * system resources are available.
     *
     * @param creatables the creatables in the batch
     * @return an observable for the resources
     */
    Mono<Indexable> createAsync(Creatable<ResourceT>... creatables);

    /**
     * Puts the requests to create a batch of resources into the queue and allow the HTTP client to execute it when
     * system resources are available.
     *
     * @param creatables the list of creatables in the batch
     * @return an observable for the resources
     */
    Mono<Indexable> createAsync(List<Creatable<ResourceT>> creatables);
}