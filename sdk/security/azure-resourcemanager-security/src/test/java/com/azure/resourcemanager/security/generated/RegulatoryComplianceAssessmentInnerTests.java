// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceAssessmentInner;
import com.azure.resourcemanager.security.models.State;
import org.junit.jupiter.api.Assertions;

public final class RegulatoryComplianceAssessmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegulatoryComplianceAssessmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"jsyingwfqatm\",\"assessmentType\":\"htmdvy\",\"assessmentDetailsLink\":\"ikdgszywkbir\",\"state\":\"Skipped\",\"passedResources\":1689730147,\"failedResources\":1361399231,\"skippedResources\":632633713,\"unsupportedResources\":1267831893},\"id\":\"rvqqaatj\",\"name\":\"nrvgoupmfiibfgg\",\"type\":\"ioolvrwxkvtkkgll\"}")
                .toObject(RegulatoryComplianceAssessmentInner.class);
        Assertions.assertEquals(State.SKIPPED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegulatoryComplianceAssessmentInner model = new RegulatoryComplianceAssessmentInner().withState(State.SKIPPED);
        model = BinaryData.fromObject(model).toObject(RegulatoryComplianceAssessmentInner.class);
        Assertions.assertEquals(State.SKIPPED, model.state());
    }
}