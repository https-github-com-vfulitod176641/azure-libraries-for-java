/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the basic gallery artifact publishing profile.
 */
public class GalleryArtifactPublishingProfileBase {
    /**
     * The target regions where the Image Version is going to be replicated to.
     * This property is updatable.
     */
    @JsonProperty(value = "targetRegions")
    private List<TargetRegion> targetRegions;

    /**
     * The source property.
     */
    @JsonProperty(value = "source", required = true)
    private GalleryArtifactSource source;

    /**
     * Get the target regions where the Image Version is going to be replicated to. This property is updatable.
     *
     * @return the targetRegions value
     */
    public List<TargetRegion> targetRegions() {
        return this.targetRegions;
    }

    /**
     * Set the target regions where the Image Version is going to be replicated to. This property is updatable.
     *
     * @param targetRegions the targetRegions value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withTargetRegions(List<TargetRegion> targetRegions) {
        this.targetRegions = targetRegions;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public GalleryArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryArtifactPublishingProfileBase object itself.
     */
    public GalleryArtifactPublishingProfileBase withSource(GalleryArtifactSource source) {
        this.source = source;
        return this;
    }

}
