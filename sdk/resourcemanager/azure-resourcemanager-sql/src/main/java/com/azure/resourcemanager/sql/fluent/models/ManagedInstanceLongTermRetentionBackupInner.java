// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A long term retention backup for a managed database. */
@Fluent
public final class ManagedInstanceLongTermRetentionBackupInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ManagedInstanceLongTermRetentionBackupProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ManagedInstanceLongTermRetentionBackupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the managedInstanceName property: The managed instance that the backup database belongs to.
     *
     * @return the managedInstanceName value.
     */
    public String managedInstanceName() {
        return this.innerProperties() == null ? null : this.innerProperties().managedInstanceName();
    }

    /**
     * Get the managedInstanceCreateTime property: The create time of the instance.
     *
     * @return the managedInstanceCreateTime value.
     */
    public OffsetDateTime managedInstanceCreateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().managedInstanceCreateTime();
    }

    /**
     * Get the databaseName property: The name of the database the backup belong to.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the databaseDeletionTime property: The delete time of the database.
     *
     * @return the databaseDeletionTime value.
     */
    public OffsetDateTime databaseDeletionTime() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseDeletionTime();
    }

    /**
     * Get the backupTime property: The time the backup was taken.
     *
     * @return the backupTime value.
     */
    public OffsetDateTime backupTime() {
        return this.innerProperties() == null ? null : this.innerProperties().backupTime();
    }

    /**
     * Get the backupExpirationTime property: The time the long term retention backup will expire.
     *
     * @return the backupExpirationTime value.
     */
    public OffsetDateTime backupExpirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().backupExpirationTime();
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
