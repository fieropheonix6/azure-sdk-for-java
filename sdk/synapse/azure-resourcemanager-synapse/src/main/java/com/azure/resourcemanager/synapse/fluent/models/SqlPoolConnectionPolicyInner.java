// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Sql pool connection policy. */
@Fluent
public final class SqlPoolConnectionPolicyInner extends ProxyResource {
    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SqlPoolConnectionPolicyProperties innerProperties;

    /**
     * Get the kind property: Resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SqlPoolConnectionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the securityEnabledAccess property: The state of security access.
     *
     * @return the securityEnabledAccess value.
     */
    public String securityEnabledAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().securityEnabledAccess();
    }

    /**
     * Set the securityEnabledAccess property: The state of security access.
     *
     * @param securityEnabledAccess the securityEnabledAccess value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withSecurityEnabledAccess(String securityEnabledAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withSecurityEnabledAccess(securityEnabledAccess);
        return this;
    }

    /**
     * Get the proxyDnsName property: The fully qualified host name of the auditing proxy.
     *
     * @return the proxyDnsName value.
     */
    public String proxyDnsName() {
        return this.innerProperties() == null ? null : this.innerProperties().proxyDnsName();
    }

    /**
     * Set the proxyDnsName property: The fully qualified host name of the auditing proxy.
     *
     * @param proxyDnsName the proxyDnsName value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withProxyDnsName(String proxyDnsName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withProxyDnsName(proxyDnsName);
        return this;
    }

    /**
     * Get the proxyPort property: The port number of the auditing proxy.
     *
     * @return the proxyPort value.
     */
    public String proxyPort() {
        return this.innerProperties() == null ? null : this.innerProperties().proxyPort();
    }

    /**
     * Set the proxyPort property: The port number of the auditing proxy.
     *
     * @param proxyPort the proxyPort value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withProxyPort(String proxyPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withProxyPort(proxyPort);
        return this;
    }

    /**
     * Get the visibility property: The visibility of the auditing proxy.
     *
     * @return the visibility value.
     */
    public String visibility() {
        return this.innerProperties() == null ? null : this.innerProperties().visibility();
    }

    /**
     * Set the visibility property: The visibility of the auditing proxy.
     *
     * @param visibility the visibility value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withVisibility(String visibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withVisibility(visibility);
        return this;
    }

    /**
     * Get the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @return the useServerDefault value.
     */
    public String useServerDefault() {
        return this.innerProperties() == null ? null : this.innerProperties().useServerDefault();
    }

    /**
     * Set the useServerDefault property: Whether server default is enabled or disabled.
     *
     * @param useServerDefault the useServerDefault value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withUseServerDefault(String useServerDefault) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withUseServerDefault(useServerDefault);
        return this;
    }

    /**
     * Get the redirectionState property: The state of proxy redirection.
     *
     * @return the redirectionState value.
     */
    public String redirectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().redirectionState();
    }

    /**
     * Set the redirectionState property: The state of proxy redirection.
     *
     * @param redirectionState the redirectionState value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withRedirectionState(String redirectionState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withRedirectionState(redirectionState);
        return this;
    }

    /**
     * Get the state property: The connection policy state.
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The connection policy state.
     *
     * @param state the state value to set.
     * @return the SqlPoolConnectionPolicyInner object itself.
     */
    public SqlPoolConnectionPolicyInner withState(String state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolConnectionPolicyProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
