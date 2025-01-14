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
@JsonDeserialize(builder = AugustDeviceMetadata.Builder.class)
public final class AugustDeviceMetadata {
    private final String lockId;

    private final String lockName;

    private final String houseName;

    private final Optional<String> houseId;

    private final boolean hasKeypad;

    private final Optional<String> model;

    private final Optional<String> keypadBatteryLevel;

    private AugustDeviceMetadata(
            String lockId,
            String lockName,
            String houseName,
            Optional<String> houseId,
            boolean hasKeypad,
            Optional<String> model,
            Optional<String> keypadBatteryLevel) {
        this.lockId = lockId;
        this.lockName = lockName;
        this.houseName = houseName;
        this.houseId = houseId;
        this.hasKeypad = hasKeypad;
        this.model = model;
        this.keypadBatteryLevel = keypadBatteryLevel;
    }

    @JsonProperty("lock_id")
    public String getLockId() {
        return lockId;
    }

    @JsonProperty("lock_name")
    public String getLockName() {
        return lockName;
    }

    @JsonProperty("house_name")
    public String getHouseName() {
        return houseName;
    }

    @JsonProperty("house_id")
    public Optional<String> getHouseId() {
        return houseId;
    }

    @JsonProperty("has_keypad")
    public boolean getHasKeypad() {
        return hasKeypad;
    }

    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    @JsonProperty("keypad_battery_level")
    public Optional<String> getKeypadBatteryLevel() {
        return keypadBatteryLevel;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AugustDeviceMetadata && equalTo((AugustDeviceMetadata) other);
    }

    private boolean equalTo(AugustDeviceMetadata other) {
        return lockId.equals(other.lockId)
                && lockName.equals(other.lockName)
                && houseName.equals(other.houseName)
                && houseId.equals(other.houseId)
                && hasKeypad == other.hasKeypad
                && model.equals(other.model)
                && keypadBatteryLevel.equals(other.keypadBatteryLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.lockId,
                this.lockName,
                this.houseName,
                this.houseId,
                this.hasKeypad,
                this.model,
                this.keypadBatteryLevel);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LockIdStage builder() {
        return new Builder();
    }

    public interface LockIdStage {
        LockNameStage lockId(String lockId);

        Builder from(AugustDeviceMetadata other);
    }

    public interface LockNameStage {
        HouseNameStage lockName(String lockName);
    }

    public interface HouseNameStage {
        HasKeypadStage houseName(String houseName);
    }

    public interface HasKeypadStage {
        _FinalStage hasKeypad(boolean hasKeypad);
    }

    public interface _FinalStage {
        AugustDeviceMetadata build();

        _FinalStage houseId(Optional<String> houseId);

        _FinalStage houseId(String houseId);

        _FinalStage model(Optional<String> model);

        _FinalStage model(String model);

        _FinalStage keypadBatteryLevel(Optional<String> keypadBatteryLevel);

        _FinalStage keypadBatteryLevel(String keypadBatteryLevel);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements LockIdStage, LockNameStage, HouseNameStage, HasKeypadStage, _FinalStage {
        private String lockId;

        private String lockName;

        private String houseName;

        private boolean hasKeypad;

        private Optional<String> keypadBatteryLevel = Optional.empty();

        private Optional<String> model = Optional.empty();

        private Optional<String> houseId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AugustDeviceMetadata other) {
            lockId(other.getLockId());
            lockName(other.getLockName());
            houseName(other.getHouseName());
            houseId(other.getHouseId());
            hasKeypad(other.getHasKeypad());
            model(other.getModel());
            keypadBatteryLevel(other.getKeypadBatteryLevel());
            return this;
        }

        @Override
        @JsonSetter("lock_id")
        public LockNameStage lockId(String lockId) {
            this.lockId = lockId;
            return this;
        }

        @Override
        @JsonSetter("lock_name")
        public HouseNameStage lockName(String lockName) {
            this.lockName = lockName;
            return this;
        }

        @Override
        @JsonSetter("house_name")
        public HasKeypadStage houseName(String houseName) {
            this.houseName = houseName;
            return this;
        }

        @Override
        @JsonSetter("has_keypad")
        public _FinalStage hasKeypad(boolean hasKeypad) {
            this.hasKeypad = hasKeypad;
            return this;
        }

        @Override
        public _FinalStage keypadBatteryLevel(String keypadBatteryLevel) {
            this.keypadBatteryLevel = Optional.of(keypadBatteryLevel);
            return this;
        }

        @Override
        @JsonSetter(value = "keypad_battery_level", nulls = Nulls.SKIP)
        public _FinalStage keypadBatteryLevel(Optional<String> keypadBatteryLevel) {
            this.keypadBatteryLevel = keypadBatteryLevel;
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
        public _FinalStage houseId(String houseId) {
            this.houseId = Optional.of(houseId);
            return this;
        }

        @Override
        @JsonSetter(value = "house_id", nulls = Nulls.SKIP)
        public _FinalStage houseId(Optional<String> houseId) {
            this.houseId = houseId;
            return this;
        }

        @Override
        public AugustDeviceMetadata build() {
            return new AugustDeviceMetadata(lockId, lockName, houseName, houseId, hasKeypad, model, keypadBatteryLevel);
        }
    }
}
