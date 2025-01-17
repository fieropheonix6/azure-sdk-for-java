// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The sku name. */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Premium_LRS for SkuName. */
    public static final SkuName PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value Premium_ZRS for SkuName. */
    public static final SkuName PREMIUM_ZRS = fromString("Premium_ZRS");

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     *
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
