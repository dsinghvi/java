package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = ThermostatsGetResponse.Builder.class)
public final class ThermostatsGetResponse {
    private final Device thermostat;

    private final boolean ok;

    private ThermostatsGetResponse(Device thermostat, boolean ok) {
        this.thermostat = thermostat;
        this.ok = ok;
    }

    @JsonProperty("thermostat")
    public Device getThermostat() {
        return thermostat;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsGetResponse && equalTo((ThermostatsGetResponse) other);
    }

    private boolean equalTo(ThermostatsGetResponse other) {
        return thermostat.equals(other.thermostat) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.thermostat, this.ok);
    }

    @Override
    public String toString() {
        return "ThermostatsGetResponse{" + "thermostat: " + thermostat + ", ok: " + ok + "}";
    }

    public static ThermostatStage builder() {
        return new Builder();
    }

    public interface ThermostatStage {
        OkStage thermostat(Device thermostat);

        Builder from(ThermostatsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ThermostatsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ThermostatStage, OkStage, _FinalStage {
        private Device thermostat;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ThermostatsGetResponse other) {
            thermostat(other.getThermostat());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("thermostat")
        public OkStage thermostat(Device thermostat) {
            this.thermostat = thermostat;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ThermostatsGetResponse build() {
            return new ThermostatsGetResponse(thermostat, ok);
        }
    }
}