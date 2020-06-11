/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CertificateFormat.
 */
public enum CertificateFormat {
    /** The certificate is a PFX (PKCS#12) formatted certificate or certificate chain. */
    PFX("Pfx"),

    /** The certificate is a base64-encoded X.509 certificate. */
    CER("Cer");

    /** The actual serialized value for a CertificateFormat instance. */
    private String value;

    CertificateFormat(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CertificateFormat instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CertificateFormat object, or null if unable to parse.
     */
    @JsonCreator
    public static CertificateFormat fromString(String value) {
        CertificateFormat[] items = CertificateFormat.values();
        for (CertificateFormat item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}