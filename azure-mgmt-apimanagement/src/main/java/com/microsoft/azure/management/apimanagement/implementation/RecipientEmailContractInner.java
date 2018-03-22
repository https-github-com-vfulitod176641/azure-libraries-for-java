/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Recipient Email details.
 */
@JsonFlatten
public class RecipientEmailContractInner extends Resource {
    /**
     * User Email subscribed to notification.
     */
    @JsonProperty(value = "properties.email")
    private String email;

    /**
     * Get the email value.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email value.
     *
     * @param email the email value to set
     * @return the RecipientEmailContractInner object itself.
     */
    public RecipientEmailContractInner withEmail(String email) {
        this.email = email;
        return this;
    }

}