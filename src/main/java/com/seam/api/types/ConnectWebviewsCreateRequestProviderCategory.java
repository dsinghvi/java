/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectWebviewsCreateRequestProviderCategory {
    STABLE("stable"),

    CONSUMER_SMARTLOCKS("consumer_smartlocks"),

    INTERNAL_BETA("internal_beta");

    private final String value;

    ConnectWebviewsCreateRequestProviderCategory(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
