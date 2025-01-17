// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.OutboundEnvironmentEndpointInner;
import org.junit.jupiter.api.Test;

public final class OutboundEnvironmentEndpointInnerTests {
    @Test
    public void testDeserialize() {
        OutboundEnvironmentEndpointInner model =
            BinaryData
                .fromString(
                    "{\"category\":\"ofwq\",\"endpoints\":[{\"domainName\":\"lkrm\",\"description\":\"i\",\"endpointDetails\":[]}]}")
                .toObject(OutboundEnvironmentEndpointInner.class);
    }

    @Test
    public void testSerialize() {
        OutboundEnvironmentEndpointInner model = new OutboundEnvironmentEndpointInner();
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointInner.class);
    }
}
