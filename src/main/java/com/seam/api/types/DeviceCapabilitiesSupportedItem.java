package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeviceCapabilitiesSupportedItem {
    ACCESS_CODE("access_code"),

    LOCK("lock"),

    NOISE_DETECTION("noise_detection"),

    THERMOSTAT("thermostat"),

    BATTERY("battery");

    private final String value;

    DeviceCapabilitiesSupportedItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
