package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectWebviewStatus {
    PENDING("pending"),

    FAILED("failed"),

    AUTHORIZED("authorized");

    private final String value;

    ConnectWebviewStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
