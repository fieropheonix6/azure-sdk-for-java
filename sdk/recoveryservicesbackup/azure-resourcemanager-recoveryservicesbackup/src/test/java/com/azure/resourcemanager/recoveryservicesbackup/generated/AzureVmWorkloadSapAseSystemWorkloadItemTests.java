// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSapAseSystemWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureVmWorkloadSapAseSystemWorkloadItemTests {
    @Test
    public void testDeserialize() {
        AzureVmWorkloadSapAseSystemWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"SAPAseSystem\",\"parentName\":\"brfkspz\",\"serverName\":\"mtksjcitdigsx\",\"isAutoProtectable\":true,\"subinquireditemcount\":1354192290,\"subWorkloadItemCount\":1536003331,\"backupManagementType\":\"euachtomfl\",\"workloadType\":\"tswfpfmdgycxnms\",\"friendlyName\":\"hqjjys\",\"protectionState\":\"NotProtected\"}")
                .toObject(AzureVmWorkloadSapAseSystemWorkloadItem.class);
        Assertions.assertEquals("euachtomfl", model.backupManagementType());
        Assertions.assertEquals("tswfpfmdgycxnms", model.workloadType());
        Assertions.assertEquals("hqjjys", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("brfkspz", model.parentName());
        Assertions.assertEquals("mtksjcitdigsx", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1354192290, model.subinquireditemcount());
        Assertions.assertEquals(1536003331, model.subWorkloadItemCount());
    }

    @Test
    public void testSerialize() {
        AzureVmWorkloadSapAseSystemWorkloadItem model =
            new AzureVmWorkloadSapAseSystemWorkloadItem()
                .withBackupManagementType("euachtomfl")
                .withWorkloadType("tswfpfmdgycxnms")
                .withFriendlyName("hqjjys")
                .withProtectionState(ProtectionStatus.NOT_PROTECTED)
                .withParentName("brfkspz")
                .withServerName("mtksjcitdigsx")
                .withIsAutoProtectable(true)
                .withSubinquireditemcount(1354192290)
                .withSubWorkloadItemCount(1536003331);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSapAseSystemWorkloadItem.class);
        Assertions.assertEquals("euachtomfl", model.backupManagementType());
        Assertions.assertEquals("tswfpfmdgycxnms", model.workloadType());
        Assertions.assertEquals("hqjjys", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("brfkspz", model.parentName());
        Assertions.assertEquals("mtksjcitdigsx", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1354192290, model.subinquireditemcount());
        Assertions.assertEquals(1536003331, model.subWorkloadItemCount());
    }
}
