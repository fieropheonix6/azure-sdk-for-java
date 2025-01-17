// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elastic.ElasticManager;
import com.azure.resourcemanager.elastic.models.ElasticMonitorResource;
import com.azure.resourcemanager.elastic.models.ManagedIdentityTypes;
import com.azure.resourcemanager.elastic.models.MonitoringStatus;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitorsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"ocohslkevleg\"},\"properties\":{\"provisioningState\":\"Succeeded\",\"monitoringStatus\":\"Disabled\",\"elasticProperties\":{},\"userInfo\":{\"firstName\":\"x\",\"lastName\":\"feiithlvmez\",\"companyName\":\"shxmzsbbzoggigrx\",\"emailAddress\":\"ur\"},\"version\":\"xjnspy\",\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":1581089013},\"identity\":{\"principalId\":\"kouknvudwtiu\",\"tenantId\":\"ldngkpoci\",\"type\":\"SystemAssigned\"},\"location\":\"xoegukgjnpiucgy\",\"tags\":{\"bpizcdrqjsdpydn\":\"qzntypm\",\"sjttgzfbish\":\"yhxdeoejzicwi\",\"jdeyeamdpha\":\"bkh\",\"wkgshwa\":\"alpbuxwgipwhon\"},\"id\":\"kix\",\"name\":\"bin\",\"type\":\"eputtmrywnuzoqf\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ElasticManager manager =
            ElasticManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ElasticMonitorResource> response = manager.monitors().listByResourceGroup("onpc", Context.NONE);

        Assertions.assertEquals("xoegukgjnpiucgy", response.iterator().next().location());
        Assertions.assertEquals("qzntypm", response.iterator().next().tags().get("bpizcdrqjsdpydn"));
        Assertions.assertEquals("ocohslkevleg", response.iterator().next().sku().name());
        Assertions
            .assertEquals(ProvisioningState.SUCCEEDED, response.iterator().next().properties().provisioningState());
        Assertions.assertEquals(MonitoringStatus.DISABLED, response.iterator().next().properties().monitoringStatus());
        Assertions.assertEquals("x", response.iterator().next().properties().userInfo().firstName());
        Assertions.assertEquals("feiithlvmez", response.iterator().next().properties().userInfo().lastName());
        Assertions.assertEquals("shxmzsbbzoggigrx", response.iterator().next().properties().userInfo().companyName());
        Assertions.assertEquals("ur", response.iterator().next().properties().userInfo().emailAddress());
        Assertions.assertEquals("xjnspy", response.iterator().next().properties().version());
        Assertions.assertEquals(ManagedIdentityTypes.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
    }
}
