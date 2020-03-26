// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ManagedBackupShortTermRetentionPolicy model.
 */
@JsonFlatten
@Fluent
public class ManagedBackupShortTermRetentionPolicyInner extends ProxyResource {
    /*
     * The backup retention period in days. This is how many days Point-in-Time
     * Restore will be supported.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Get the retentionDays property: The backup retention period in days.
     * This is how many days Point-in-Time Restore will be supported.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: The backup retention period in days.
     * This is how many days Point-in-Time Restore will be supported.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the ManagedBackupShortTermRetentionPolicyInner object itself.
     */
    public ManagedBackupShortTermRetentionPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
}
