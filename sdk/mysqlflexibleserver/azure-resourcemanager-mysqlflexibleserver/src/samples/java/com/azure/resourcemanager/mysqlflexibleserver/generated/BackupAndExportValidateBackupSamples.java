// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/** Samples for BackupAndExport ValidateBackup. */
public final class BackupAndExportValidateBackupSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/Backups/preview/2022-09-30-preview/examples/ValidateBackup.json
     */
    /**
     * Sample code: Validate Backup.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void validateBackup(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .backupAndExports()
            .validateBackupWithResponse("TestGroup", "mysqltestserver", com.azure.core.util.Context.NONE);
    }
}