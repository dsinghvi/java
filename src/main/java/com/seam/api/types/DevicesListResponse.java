package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = DevicesListResponse.Builder.class)
public final class DevicesListResponse {
    private final List<Device> devices;

    private final boolean ok;

    private DevicesListResponse(List<Device> devices, boolean ok) {
        this.devices = devices;
        this.ok = ok;
    }

    @JsonProperty("devices")
    public List<Device> getDevices() {
        return devices;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListResponse && equalTo((DevicesListResponse) other);
    }

    private boolean equalTo(DevicesListResponse other) {
        return devices.equals(other.devices) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.devices, this.ok);
    }

    @Override
    public String toString() {
        return "DevicesListResponse{" + "devices: " + devices + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(DevicesListResponse other);
    }

    public interface _FinalStage {
        DevicesListResponse build();

        _FinalStage devices(List<Device> devices);

        _FinalStage addDevices(Device devices);

        _FinalStage addAllDevices(List<Device> devices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<Device> devices = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(DevicesListResponse other) {
            devices(other.getDevices());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllDevices(List<Device> devices) {
            this.devices.addAll(devices);
            return this;
        }

        @Override
        public _FinalStage addDevices(Device devices) {
            this.devices.add(devices);
            return this;
        }

        @Override
        @JsonSetter(value = "devices", nulls = Nulls.SKIP)
        public _FinalStage devices(List<Device> devices) {
            this.devices.clear();
            this.devices.addAll(devices);
            return this;
        }

        @Override
        public DevicesListResponse build() {
            return new DevicesListResponse(devices, ok);
        }
    }
}
