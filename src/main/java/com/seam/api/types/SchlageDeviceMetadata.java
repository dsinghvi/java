/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = SchlageDeviceMetadata.Builder.class)
public final class SchlageDeviceMetadata {
    private final String deviceId;

    private final String deviceName;

    private final int accessCodeLength;

    private final Optional<String> model;

    private final Optional<String> locationId;

    private SchlageDeviceMetadata(
            String deviceId,
            String deviceName,
            int accessCodeLength,
            Optional<String> model,
            Optional<String> locationId) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.accessCodeLength = accessCodeLength;
        this.model = model;
        this.locationId = locationId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @JsonProperty("access_code_length")
    public int getAccessCodeLength() {
        return accessCodeLength;
    }

    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    @JsonProperty("location_id")
    public Optional<String> getLocationId() {
        return locationId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SchlageDeviceMetadata && equalTo((SchlageDeviceMetadata) other);
    }

    private boolean equalTo(SchlageDeviceMetadata other) {
        return deviceId.equals(other.deviceId)
                && deviceName.equals(other.deviceName)
                && accessCodeLength == other.accessCodeLength
                && model.equals(other.model)
                && locationId.equals(other.locationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.deviceName, this.accessCodeLength, this.model, this.locationId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DeviceNameStage deviceId(String deviceId);

        Builder from(SchlageDeviceMetadata other);
    }

    public interface DeviceNameStage {
        AccessCodeLengthStage deviceName(String deviceName);
    }

    public interface AccessCodeLengthStage {
        _FinalStage accessCodeLength(int accessCodeLength);
    }

    public interface _FinalStage {
        SchlageDeviceMetadata build();

        _FinalStage model(Optional<String> model);

        _FinalStage model(String model);

        _FinalStage locationId(Optional<String> locationId);

        _FinalStage locationId(String locationId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, DeviceNameStage, AccessCodeLengthStage, _FinalStage {
        private String deviceId;

        private String deviceName;

        private int accessCodeLength;

        private Optional<String> locationId = Optional.empty();

        private Optional<String> model = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(SchlageDeviceMetadata other) {
            deviceId(other.getDeviceId());
            deviceName(other.getDeviceName());
            accessCodeLength(other.getAccessCodeLength());
            model(other.getModel());
            locationId(other.getLocationId());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public DeviceNameStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("device_name")
        public AccessCodeLengthStage deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        @Override
        @JsonSetter("access_code_length")
        public _FinalStage accessCodeLength(int accessCodeLength) {
            this.accessCodeLength = accessCodeLength;
            return this;
        }

        @Override
        public _FinalStage locationId(String locationId) {
            this.locationId = Optional.of(locationId);
            return this;
        }

        @Override
        @JsonSetter(value = "location_id", nulls = Nulls.SKIP)
        public _FinalStage locationId(Optional<String> locationId) {
            this.locationId = locationId;
            return this;
        }

        @Override
        public _FinalStage model(String model) {
            this.model = Optional.of(model);
            return this;
        }

        @Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<String> model) {
            this.model = model;
            return this;
        }

        @Override
        public SchlageDeviceMetadata build() {
            return new SchlageDeviceMetadata(deviceId, deviceName, accessCodeLength, model, locationId);
        }
    }
}
