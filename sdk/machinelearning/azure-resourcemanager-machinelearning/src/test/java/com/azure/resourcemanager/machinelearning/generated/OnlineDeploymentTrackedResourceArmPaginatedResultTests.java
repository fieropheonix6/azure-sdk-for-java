// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineDeploymentInner;
import com.azure.resourcemanager.machinelearning.models.EgressPublicNetworkAccessType;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.OnlineDeploymentProperties;
import com.azure.resourcemanager.machinelearning.models.OnlineDeploymentTrackedResourceArmPaginatedResult;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OnlineDeploymentTrackedResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        OnlineDeploymentTrackedResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"rprsnm\",\"value\":[{\"identity\":{\"principalId\":\"5c628002-faa9-4a82-845e-974fc80206b7\",\"tenantId\":\"1f1e8042-478e-4886-8068-3204bc3be0dc\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"lbkpb\",\"properties\":{\"endpointComputeType\":\"OnlineDeploymentProperties\",\"appInsightsEnabled\":false,\"egressPublicNetworkAccess\":\"Enabled\",\"instanceType\":\"jh\",\"model\":\"vechndbnwiehole\",\"modelMountPath\":\"wiuub\",\"provisioningState\":\"Succeeded\",\"description\":\"aqtferr\",\"environmentId\":\"ex\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"xap\",\"tier\":\"Free\",\"size\":\"qqnobpudcd\",\"family\":\"tqwpwya\",\"capacity\":2036163978},\"location\":\"sqbuc\",\"tags\":{\"sdaultxij\":\"kyexaoguyaipi\",\"qwazlnqnmcjngzq\":\"um\",\"sf\":\"qxtbjwgnyf\"},\"id\":\"svtui\",\"name\":\"zh\",\"type\":\"jqg\"},{\"identity\":{\"principalId\":\"94169cee-6d66-40f5-b3a0-b5787a2dfbb1\",\"tenantId\":\"db36f12c-7496-4557-abe6-429e89ec539b\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"qryxyn\",\"properties\":{\"endpointComputeType\":\"OnlineDeploymentProperties\",\"appInsightsEnabled\":true,\"egressPublicNetworkAccess\":\"Disabled\",\"instanceType\":\"sovwxznptgoeiyb\",\"model\":\"pfhvfslk\",\"modelMountPath\":\"tjlrigjksky\",\"provisioningState\":\"Creating\",\"description\":\"sxwaabzm\",\"environmentId\":\"rygznmmaxriz\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"gopxlhslnelxie\",\"tier\":\"Basic\",\"size\":\"llxecwc\",\"family\":\"jphslhcaw\",\"capacity\":224494261},\"location\":\"fdwfmvigorqj\",\"tags\":{\"n\":\"zhraglkafh\"},\"id\":\"juj\",\"name\":\"ickpz\",\"type\":\"cpopmxel\"},{\"identity\":{\"principalId\":\"f535ddac-d337-4577-8823-dc42c3f44ef1\",\"tenantId\":\"27776f68-6cbd-4bed-a997-e9519be4bdcb\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"edexxmlfm\",\"properties\":{\"endpointComputeType\":\"OnlineDeploymentProperties\",\"appInsightsEnabled\":true,\"egressPublicNetworkAccess\":\"Enabled\",\"instanceType\":\"uawxtzx\",\"model\":\"mwabzxrvxc\",\"modelMountPath\":\"hsphaivmxyas\",\"provisioningState\":\"Deleting\",\"description\":\"ywakoihk\",\"environmentId\":\"mjblmljhlny\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"qyryuzcbmqqvxm\",\"tier\":\"Standard\",\"size\":\"tayx\",\"family\":\"supe\",\"capacity\":2074822274},\"location\":\"qnhcvsqltnzoibg\",\"tags\":{\"qoxwd\":\"nxfyqonm\"},\"id\":\"fdbxiqxeiiqbim\",\"name\":\"tmwwi\",\"type\":\"h\"},{\"identity\":{\"principalId\":\"fd5a699d-77d2-4e7f-a8b1-4c688ed81346\",\"tenantId\":\"1488bdb4-c5ce-4e55-8d5f-ef87b67ccaba\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"vwbcblembnkbwv\",\"properties\":{\"endpointComputeType\":\"OnlineDeploymentProperties\",\"appInsightsEnabled\":false,\"egressPublicNetworkAccess\":\"Enabled\",\"instanceType\":\"vqihebwtswbzuwf\",\"model\":\"ragegi\",\"modelMountPath\":\"cjfelisdjubgg\",\"provisioningState\":\"Failed\",\"description\":\"sazgakgacyrcmj\",\"environmentId\":\"spofapvuhry\",\"environmentVariables\":{},\"properties\":{}},\"sku\":{\"name\":\"frzgbzjed\",\"tier\":\"Premium\",\"size\":\"vnlvxbcuiiznktwf\",\"family\":\"snvpdibmi\",\"capacity\":1037622433},\"location\":\"bzbkiw\",\"tags\":{\"ophzfylsgcrp\":\"n\",\"fwyfwlwxjwet\":\"bcunezzceze\",\"zvaylptrsqqw\":\"psihcla\"},\"id\":\"tcmwqkchc\",\"name\":\"waxfewzjkj\",\"type\":\"xfdeqvhpsyl\"}]}")
                .toObject(OnlineDeploymentTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("rprsnm", model.nextLink());
        Assertions.assertEquals("sqbuc", model.value().get(0).location());
        Assertions.assertEquals("kyexaoguyaipi", model.value().get(0).tags().get("sdaultxij"));
        Assertions
            .assertEquals(
                ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("lbkpb", model.value().get(0).kind());
        Assertions.assertEquals("aqtferr", model.value().get(0).properties().description());
        Assertions.assertEquals("ex", model.value().get(0).properties().environmentId());
        Assertions.assertEquals(false, model.value().get(0).properties().appInsightsEnabled());
        Assertions
            .assertEquals(
                EgressPublicNetworkAccessType.ENABLED, model.value().get(0).properties().egressPublicNetworkAccess());
        Assertions.assertEquals("jh", model.value().get(0).properties().instanceType());
        Assertions.assertEquals("vechndbnwiehole", model.value().get(0).properties().model());
        Assertions.assertEquals("wiuub", model.value().get(0).properties().modelMountPath());
        Assertions.assertEquals("xap", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("qqnobpudcd", model.value().get(0).sku().size());
        Assertions.assertEquals("tqwpwya", model.value().get(0).sku().family());
        Assertions.assertEquals(2036163978, model.value().get(0).sku().capacity());
    }

    @Test
    public void testSerialize() {
        OnlineDeploymentTrackedResourceArmPaginatedResult model =
            new OnlineDeploymentTrackedResourceArmPaginatedResult()
                .withNextLink("rprsnm")
                .withValue(
                    Arrays
                        .asList(
                            new OnlineDeploymentInner()
                                .withLocation("sqbuc")
                                .withTags(
                                    mapOf("sdaultxij", "kyexaoguyaipi", "qwazlnqnmcjngzq", "um", "sf", "qxtbjwgnyf"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("lbkpb")
                                .withProperties(
                                    new OnlineDeploymentProperties()
                                        .withDescription("aqtferr")
                                        .withEnvironmentId("ex")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withAppInsightsEnabled(false)
                                        .withEgressPublicNetworkAccess(EgressPublicNetworkAccessType.ENABLED)
                                        .withInstanceType("jh")
                                        .withModel("vechndbnwiehole")
                                        .withModelMountPath("wiuub"))
                                .withSku(
                                    new Sku()
                                        .withName("xap")
                                        .withTier(SkuTier.FREE)
                                        .withSize("qqnobpudcd")
                                        .withFamily("tqwpwya")
                                        .withCapacity(2036163978)),
                            new OnlineDeploymentInner()
                                .withLocation("fdwfmvigorqj")
                                .withTags(mapOf("n", "zhraglkafh"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("qryxyn")
                                .withProperties(
                                    new OnlineDeploymentProperties()
                                        .withDescription("sxwaabzm")
                                        .withEnvironmentId("rygznmmaxriz")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withAppInsightsEnabled(true)
                                        .withEgressPublicNetworkAccess(EgressPublicNetworkAccessType.DISABLED)
                                        .withInstanceType("sovwxznptgoeiyb")
                                        .withModel("pfhvfslk")
                                        .withModelMountPath("tjlrigjksky"))
                                .withSku(
                                    new Sku()
                                        .withName("gopxlhslnelxie")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("llxecwc")
                                        .withFamily("jphslhcaw")
                                        .withCapacity(224494261)),
                            new OnlineDeploymentInner()
                                .withLocation("qnhcvsqltnzoibg")
                                .withTags(mapOf("qoxwd", "nxfyqonm"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("edexxmlfm")
                                .withProperties(
                                    new OnlineDeploymentProperties()
                                        .withDescription("ywakoihk")
                                        .withEnvironmentId("mjblmljhlny")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withAppInsightsEnabled(true)
                                        .withEgressPublicNetworkAccess(EgressPublicNetworkAccessType.ENABLED)
                                        .withInstanceType("uawxtzx")
                                        .withModel("mwabzxrvxc")
                                        .withModelMountPath("hsphaivmxyas"))
                                .withSku(
                                    new Sku()
                                        .withName("qyryuzcbmqqvxm")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("tayx")
                                        .withFamily("supe")
                                        .withCapacity(2074822274)),
                            new OnlineDeploymentInner()
                                .withLocation("bzbkiw")
                                .withTags(
                                    mapOf(
                                        "ophzfylsgcrp", "n", "fwyfwlwxjwet", "bcunezzceze", "zvaylptrsqqw", "psihcla"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("vwbcblembnkbwv")
                                .withProperties(
                                    new OnlineDeploymentProperties()
                                        .withDescription("sazgakgacyrcmj")
                                        .withEnvironmentId("spofapvuhry")
                                        .withEnvironmentVariables(mapOf())
                                        .withProperties(mapOf())
                                        .withAppInsightsEnabled(false)
                                        .withEgressPublicNetworkAccess(EgressPublicNetworkAccessType.ENABLED)
                                        .withInstanceType("vqihebwtswbzuwf")
                                        .withModel("ragegi")
                                        .withModelMountPath("cjfelisdjubgg"))
                                .withSku(
                                    new Sku()
                                        .withName("frzgbzjed")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("vnlvxbcuiiznktwf")
                                        .withFamily("snvpdibmi")
                                        .withCapacity(1037622433))));
        model = BinaryData.fromObject(model).toObject(OnlineDeploymentTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("rprsnm", model.nextLink());
        Assertions.assertEquals("sqbuc", model.value().get(0).location());
        Assertions.assertEquals("kyexaoguyaipi", model.value().get(0).tags().get("sdaultxij"));
        Assertions
            .assertEquals(
                ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("lbkpb", model.value().get(0).kind());
        Assertions.assertEquals("aqtferr", model.value().get(0).properties().description());
        Assertions.assertEquals("ex", model.value().get(0).properties().environmentId());
        Assertions.assertEquals(false, model.value().get(0).properties().appInsightsEnabled());
        Assertions
            .assertEquals(
                EgressPublicNetworkAccessType.ENABLED, model.value().get(0).properties().egressPublicNetworkAccess());
        Assertions.assertEquals("jh", model.value().get(0).properties().instanceType());
        Assertions.assertEquals("vechndbnwiehole", model.value().get(0).properties().model());
        Assertions.assertEquals("wiuub", model.value().get(0).properties().modelMountPath());
        Assertions.assertEquals("xap", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("qqnobpudcd", model.value().get(0).sku().size());
        Assertions.assertEquals("tqwpwya", model.value().get(0).sku().family());
        Assertions.assertEquals(2036163978, model.value().get(0).sku().capacity());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
