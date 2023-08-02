package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeviceDeviceType {
    AKUVOX_LOCK("akuvox_lock"),

    AUGUST_LOCK("august_lock"),

    BRIVO_ACCESS_POINT("brivo_access_point"),

    BUTTERFLYMX_PANEL("butterflymx_panel"),

    DOORKING_LOCK("doorking_lock"),

    GENIE_DOOR("genie_door"),

    IGLOO_LOCK("igloo_lock"),

    LINEAR_LOCK("linear_lock"),

    LOCKLY_LOCK("lockly_lock"),

    KWIKSET_LOCK("kwikset_lock"),

    NUKI_LOCK("nuki_lock"),

    SALTO_LOCK("salto_lock"),

    SCHLAGE_LOCK("schlage_lock"),

    SEAM_RELAY("seam_relay"),

    SMARTTHINGS_LOCK("smartthings_lock"),

    YALE_LOCK("yale_lock"),

    TWO_N_INTERCOM("two_n_intercom"),

    CONTROLBYWEB_DEVICE("controlbyweb_device"),

    TTLOCK_LOCK("ttlock_lock"),

    IGLOOHOME_LOCK("igloohome_lock"),

    HUBITAT_LOCK("hubitat_lock"),

    NOISEAWARE_ACTIVITY_ZONE("noiseaware_activity_zone"),

    MINUT_SENSOR("minut_sensor"),

    ECOBEE_THERMOSTAT("ecobee_thermostat"),

    NEST_THERMOSTAT("nest_thermostat");

    private final String value;

    DeviceDeviceType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
