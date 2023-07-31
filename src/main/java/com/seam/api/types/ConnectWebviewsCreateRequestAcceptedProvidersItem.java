package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectWebviewsCreateRequestAcceptedProvidersItem {
    AKUVOX("akuvox"),

    AUGUST("august"),

    AVIGILON_ALTA("avigilon_alta"),

    BRIVO("brivo"),

    BUTTERFLYMX("butterflymx"),

    SCHLAGE("schlage"),

    SMARTTHINGS("smartthings"),

    YALE("yale"),

    GENIE("genie"),

    DOORKING("doorking"),

    SALTO("salto"),

    LOCKLY("lockly"),

    TTLOCK("ttlock"),

    LINEAR("linear"),

    NOISEAWARE("noiseaware"),

    NUKI("nuki"),

    SEAM_RELAY_ADMIN("seam_relay_admin"),

    IGLOO("igloo"),

    KWIKSET("kwikset"),

    MINUT("minut"),

    MY_2_N("my_2n"),

    CONTROLBYWEB("controlbyweb"),

    NEST("nest"),

    IGLOOHOME("igloohome"),

    ECOBEE("ecobee"),

    HUBITAT("hubitat"),

    YALE_ACCESS("yale_access");

    private final String value;

    ConnectWebviewsCreateRequestAcceptedProvidersItem(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
