// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The resource from which the rule collects its data. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "odata.type",
    defaultImpl = RuleDataSource.class)
@JsonTypeName("RuleDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource",
        value = RuleMetricDataSource.class),
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource",
        value = RuleManagementEventDataSource.class)
})
@Fluent
public class RuleDataSource {
    /*
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an
     * existing rule.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /*
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for
     * an existing rule.
     */
    @JsonProperty(value = "legacyResourceId")
    private String legacyResourceId;

    /*
     * the location of the resource.
     */
    @JsonProperty(value = "resourceLocation")
    private String resourceLocation;

    /*
     * the namespace of the metric.
     */
    @JsonProperty(value = "metricNamespace")
    private String metricNamespace;

    /**
     * Get the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the legacyResourceId property: the legacy resource identifier of the resource the rule monitors. **NOTE**:
     * this property cannot be updated for an existing rule.
     *
     * @return the legacyResourceId value.
     */
    public String legacyResourceId() {
        return this.legacyResourceId;
    }

    /**
     * Set the legacyResourceId property: the legacy resource identifier of the resource the rule monitors. **NOTE**:
     * this property cannot be updated for an existing rule.
     *
     * @param legacyResourceId the legacyResourceId value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withLegacyResourceId(String legacyResourceId) {
        this.legacyResourceId = legacyResourceId;
        return this;
    }

    /**
     * Get the resourceLocation property: the location of the resource.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: the location of the resource.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the metricNamespace property: the namespace of the metric.
     *
     * @return the metricNamespace value.
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set the metricNamespace property: the namespace of the metric.
     *
     * @param metricNamespace the metricNamespace value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
