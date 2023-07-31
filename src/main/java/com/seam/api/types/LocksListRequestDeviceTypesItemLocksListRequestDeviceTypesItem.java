package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocksListRequestDeviceTypesItemLocksListRequestDeviceTypesItem {
    ECOBEE_THERMOSTAT("ecobee_thermostat"),

    NEST_THERMOSTAT("nest_thermostat");

    private final String value;

    LocksListRequestDeviceTypesItemLocksListRequestDeviceTypesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}