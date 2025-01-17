// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkServiceConnectionStateTests {
    @Test
    public void testDeserialize() {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString("{\"status\":\"Disconnected\",\"description\":\"mnyyazt\",\"actionsRequired\":\"twwrqp\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("mnyyazt", model.description());
        Assertions.assertEquals("twwrqp", model.actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                .withDescription("mnyyazt")
                .withActionsRequired("twwrqp");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("mnyyazt", model.description());
        Assertions.assertEquals("twwrqp", model.actionsRequired());
    }
}
