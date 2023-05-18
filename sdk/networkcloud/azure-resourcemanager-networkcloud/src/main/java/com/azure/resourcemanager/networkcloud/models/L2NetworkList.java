// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.L2NetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** L2NetworkList represents a list of L2 networks. */
@Fluent
public final class L2NetworkList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of L2 networks.
     */
    @JsonProperty(value = "value")
    private List<L2NetworkInner> value;

    /** Creates an instance of L2NetworkList class. */
    public L2NetworkList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the L2NetworkList object itself.
     */
    public L2NetworkList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of L2 networks.
     *
     * @return the value value.
     */
    public List<L2NetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of L2 networks.
     *
     * @param value the value value to set.
     * @return the L2NetworkList object itself.
     */
    public L2NetworkList withValue(List<L2NetworkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}