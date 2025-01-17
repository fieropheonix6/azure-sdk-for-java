// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Uses Java regexes to emit multiple tokens - one for each capture group in one or more patterns. This token filter is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.PatternCaptureTokenFilter")
@Fluent
public final class PatternCaptureTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.PatternCaptureTokenFilter";

    /*
     * A list of patterns to match against each token.
     */
    @JsonProperty(value = "patterns", required = true)
    private List<String> patterns;

    /*
     * A value indicating whether to return the original token even if one of the patterns matches. Default is true.
     */
    @JsonProperty(value = "preserveOriginal")
    private Boolean preserveOriginal;

    /**
     * Creates an instance of PatternCaptureTokenFilter class.
     *
     * @param name the name value to set.
     * @param patterns the patterns value to set.
     */
    @JsonCreator
    public PatternCaptureTokenFilter(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "patterns", required = true) List<String> patterns) {
        super(name);
        this.patterns = patterns;
    }

    /**
     * Get the odataType property: Identifies the concrete type of the token filter.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Get the patterns property: A list of patterns to match against each token.
     *
     * @return the patterns value.
     */
    public List<String> getPatterns() {
        return this.patterns;
    }

    /**
     * Get the preserveOriginal property: A value indicating whether to return the original token even if one of the
     * patterns matches. Default is true.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether to return the original token even if one of the
     * patterns matches. Default is true.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the PatternCaptureTokenFilter object itself.
     */
    public PatternCaptureTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }
}
