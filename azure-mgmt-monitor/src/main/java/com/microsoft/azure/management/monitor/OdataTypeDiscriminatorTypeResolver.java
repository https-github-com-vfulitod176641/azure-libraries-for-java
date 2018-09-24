/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;

import java.util.Collection;

/**
 * Custom type deserializer to resolve "odata.type" serialization/deserialization issue.
 */
class OdataTypeDiscriminatorTypeResolver extends StdTypeResolverBuilder {
    @Override
    public TypeSerializer buildTypeSerializer(SerializationConfig config, JavaType baseType, Collection<NamedType> subtypes) {
        //Copied this code from parent class, StdTypeResolverBuilder with same method name
        TypeIdResolver idRes = this.idResolver(config, baseType, subtypes, true, false);
        // have to escape "." in the middle of the "odata.type" otherwise it will be serialized to "odata": { "type":"Value"} JSON
        String escapedString = this._typeProperty.replace(".", "\\.");
        return new AsPropertyTypeSerializer(idRes, (BeanProperty) null, escapedString);
    }
}