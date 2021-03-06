/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure API management (APIM) configuration linked to the app.
 */
public class ApiManagementConfig {
    /**
     * APIM-Api Identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get aPIM-Api Identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set aPIM-Api Identifier.
     *
     * @param id the id value to set
     * @return the ApiManagementConfig object itself.
     */
    public ApiManagementConfig withId(String id) {
        this.id = id;
        return this;
    }

}
