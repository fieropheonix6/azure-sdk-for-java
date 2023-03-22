// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.SitePatchResourceInner;

/** Samples for WebApps Update. */
public final class WebAppsUpdateSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/UpdateWebApp.json
     */
    /**
     * Sample code: Update web app.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateWebApp(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .updateWithResponse(
                "testrg123",
                "sitef6141",
                new SitePatchResourceInner()
                    .withServerFarmId(
                        "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Web/serverfarms/DefaultAsp"),
                com.azure.core.util.Context.NONE);
    }
}