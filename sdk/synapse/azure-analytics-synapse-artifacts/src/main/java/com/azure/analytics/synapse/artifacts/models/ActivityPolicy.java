// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Execution policy for an activity. */
@Fluent
public final class ActivityPolicy {
    /*
     * Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "timeout")
    private Object timeout;

    /*
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum:
     * 0.
     */
    @JsonProperty(value = "retry")
    private Object retry;

    /*
     * Interval between each retry attempt (in seconds). The default is 30 sec.
     */
    @JsonProperty(value = "retryIntervalInSeconds")
    private Integer retryIntervalInSeconds;

    /*
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     */
    @JsonProperty(value = "secureInput")
    private Boolean secureInput;

    /*
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     */
    @JsonProperty(value = "secureOutput")
    private Boolean secureOutput;

    /*
     * Execution policy for an activity.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the timeout property: Specifies the timeout for the activity to run. The default timeout is 7 days. Type:
     * string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value.
     */
    public Object getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Specifies the timeout for the activity to run. The default timeout is 7 days. Type:
     * string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setTimeout(Object timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the retry property: Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @return the retry value.
     */
    public Object getRetry() {
        return this.retry;
    }

    /**
     * Set the retry property: Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @param retry the retry value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setRetry(Object retry) {
        this.retry = retry;
        return this;
    }

    /**
     * Get the retryIntervalInSeconds property: Interval between each retry attempt (in seconds). The default is 30 sec.
     *
     * @return the retryIntervalInSeconds value.
     */
    public Integer getRetryIntervalInSeconds() {
        return this.retryIntervalInSeconds;
    }

    /**
     * Set the retryIntervalInSeconds property: Interval between each retry attempt (in seconds). The default is 30 sec.
     *
     * @param retryIntervalInSeconds the retryIntervalInSeconds value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setRetryIntervalInSeconds(Integer retryIntervalInSeconds) {
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        return this;
    }

    /**
     * Get the secureInput property: When set to true, Input from activity is considered as secure and will not be
     * logged to monitoring.
     *
     * @return the secureInput value.
     */
    public Boolean isSecureInput() {
        return this.secureInput;
    }

    /**
     * Set the secureInput property: When set to true, Input from activity is considered as secure and will not be
     * logged to monitoring.
     *
     * @param secureInput the secureInput value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setSecureInput(Boolean secureInput) {
        this.secureInput = secureInput;
        return this;
    }

    /**
     * Get the secureOutput property: When set to true, Output from activity is considered as secure and will not be
     * logged to monitoring.
     *
     * @return the secureOutput value.
     */
    public Boolean isSecureOutput() {
        return this.secureOutput;
    }

    /**
     * Set the secureOutput property: When set to true, Output from activity is considered as secure and will not be
     * logged to monitoring.
     *
     * @param secureOutput the secureOutput value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setSecureOutput(Boolean secureOutput) {
        this.secureOutput = secureOutput;
        return this;
    }

    /**
     * Get the additionalProperties property: Execution policy for an activity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Execution policy for an activity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ActivityPolicy object itself.
     */
    public ActivityPolicy setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
