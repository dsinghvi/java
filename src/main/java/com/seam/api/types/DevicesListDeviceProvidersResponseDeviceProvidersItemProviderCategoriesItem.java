package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem {
    STABLE("stable"),

    CONSUMER_SMARTLOCKS("consumer_smartlocks");

    private final String value;

    DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
