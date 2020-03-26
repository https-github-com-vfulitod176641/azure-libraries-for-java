// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SyncDatabaseIdProperties model.
 */
@Immutable
public final class SyncDatabaseIdPropertiesInner {
    /*
     * ARM resource id of sync database.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: ARM resource id of sync database.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }
}
