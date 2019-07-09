/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiskCreateOption.
 */
public final class DiskCreateOption extends ExpandableStringEnum<DiskCreateOption> {
    /** Static value Empty for DiskCreateOption. */
    public static final DiskCreateOption EMPTY = fromString("Empty");

    /** Static value Attach for DiskCreateOption. */
    public static final DiskCreateOption ATTACH = fromString("Attach");

    /** Static value FromImage for DiskCreateOption. */
    public static final DiskCreateOption FROM_IMAGE = fromString("FromImage");

    /** Static value Import for DiskCreateOption. */
    public static final DiskCreateOption IMPORT = fromString("Import");

    /** Static value Copy for DiskCreateOption. */
    public static final DiskCreateOption COPY = fromString("Copy");

    /** Static value Restore for DiskCreateOption. */
    public static final DiskCreateOption RESTORE = fromString("Restore");

    /** Static value Upload for DiskCreateOption. */
    public static final DiskCreateOption UPLOAD = fromString("Upload");

    /**
     * Creates or finds a DiskCreateOption from its string representation.
     * @param name a name to look for
     * @return the corresponding DiskCreateOption
     */
    @JsonCreator
    public static DiskCreateOption fromString(String name) {
        return fromString(name, DiskCreateOption.class);
    }

    /**
     * @return known DiskCreateOption values
     */
    public static Collection<DiskCreateOption> values() {
        return values(DiskCreateOption.class);
    }
}
