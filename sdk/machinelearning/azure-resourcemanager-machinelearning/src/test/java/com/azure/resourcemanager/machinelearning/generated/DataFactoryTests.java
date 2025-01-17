// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DataFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFactoryTests {
    @Test
    public void testDeserialize() {
        DataFactory model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"DataFactory\",\"computeLocation\":\"anurnnqb\",\"provisioningState\":\"Unknown\",\"description\":\"izxqltgrd\",\"createdOn\":\"2021-08-08T02:29:28Z\",\"modifiedOn\":\"2021-03-28T12:05:51Z\",\"resourceId\":\"x\",\"provisioningErrors\":[],\"isAttachedCompute\":true,\"disableLocalAuth\":false}")
                .toObject(DataFactory.class);
        Assertions.assertEquals("anurnnqb", model.computeLocation());
        Assertions.assertEquals("izxqltgrd", model.description());
        Assertions.assertEquals("x", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
    }

    @Test
    public void testSerialize() {
        DataFactory model =
            new DataFactory()
                .withComputeLocation("anurnnqb")
                .withDescription("izxqltgrd")
                .withResourceId("x")
                .withDisableLocalAuth(false);
        model = BinaryData.fromObject(model).toObject(DataFactory.class);
        Assertions.assertEquals("anurnnqb", model.computeLocation());
        Assertions.assertEquals("izxqltgrd", model.description());
        Assertions.assertEquals("x", model.resourceId());
        Assertions.assertEquals(false, model.disableLocalAuth());
    }
}
