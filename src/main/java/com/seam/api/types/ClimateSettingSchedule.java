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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClimateSettingSchedule.Builder.class)
public final class ClimateSettingSchedule {
    private final String climateSettingScheduleId;

    private final String deviceId;

    private final Optional<String> name;

    private final String scheduleStartsAt;

    private final String scheduleEndsAt;

    private final OffsetDateTime createdAt;

    private final Optional<Boolean> automaticHeatingEnabled;

    private final Optional<Boolean> automaticCoolingEnabled;

    private final Optional<ClimateSettingScheduleHvacModeSetting> hvacModeSetting;

    private final Optional<Double> coolingSetPointCelsius;

    private final Optional<Double> heatingSetPointCelsius;

    private final Optional<Double> coolingSetPointFahrenheit;

    private final Optional<Double> heatingSetPointFahrenheit;

    private final Optional<Boolean> manualOverrideAllowed;

    private ClimateSettingSchedule(
            String climateSettingScheduleId,
            String deviceId,
            Optional<String> name,
            String scheduleStartsAt,
            String scheduleEndsAt,
            OffsetDateTime createdAt,
            Optional<Boolean> automaticHeatingEnabled,
            Optional<Boolean> automaticCoolingEnabled,
            Optional<ClimateSettingScheduleHvacModeSetting> hvacModeSetting,
            Optional<Double> coolingSetPointCelsius,
            Optional<Double> heatingSetPointCelsius,
            Optional<Double> coolingSetPointFahrenheit,
            Optional<Double> heatingSetPointFahrenheit,
            Optional<Boolean> manualOverrideAllowed) {
        this.climateSettingScheduleId = climateSettingScheduleId;
        this.deviceId = deviceId;
        this.name = name;
        this.scheduleStartsAt = scheduleStartsAt;
        this.scheduleEndsAt = scheduleEndsAt;
        this.createdAt = createdAt;
        this.automaticHeatingEnabled = automaticHeatingEnabled;
        this.automaticCoolingEnabled = automaticCoolingEnabled;
        this.hvacModeSetting = hvacModeSetting;
        this.coolingSetPointCelsius = coolingSetPointCelsius;
        this.heatingSetPointCelsius = heatingSetPointCelsius;
        this.coolingSetPointFahrenheit = coolingSetPointFahrenheit;
        this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
        this.manualOverrideAllowed = manualOverrideAllowed;
    }

    @JsonProperty("climate_setting_schedule_id")
    public String getClimateSettingScheduleId() {
        return climateSettingScheduleId;
    }

    @JsonProperty("schedule_type")
    public String getScheduleType() {
        return "time_bound";
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("schedule_starts_at")
    public String getScheduleStartsAt() {
        return scheduleStartsAt;
    }

    @JsonProperty("schedule_ends_at")
    public String getScheduleEndsAt() {
        return scheduleEndsAt;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("automatic_heating_enabled")
    public Optional<Boolean> getAutomaticHeatingEnabled() {
        return automaticHeatingEnabled;
    }

    @JsonProperty("automatic_cooling_enabled")
    public Optional<Boolean> getAutomaticCoolingEnabled() {
        return automaticCoolingEnabled;
    }

    @JsonProperty("hvac_mode_setting")
    public Optional<ClimateSettingScheduleHvacModeSetting> getHvacModeSetting() {
        return hvacModeSetting;
    }

    @JsonProperty("cooling_set_point_celsius")
    public Optional<Double> getCoolingSetPointCelsius() {
        return coolingSetPointCelsius;
    }

    @JsonProperty("heating_set_point_celsius")
    public Optional<Double> getHeatingSetPointCelsius() {
        return heatingSetPointCelsius;
    }

    @JsonProperty("cooling_set_point_fahrenheit")
    public Optional<Double> getCoolingSetPointFahrenheit() {
        return coolingSetPointFahrenheit;
    }

    @JsonProperty("heating_set_point_fahrenheit")
    public Optional<Double> getHeatingSetPointFahrenheit() {
        return heatingSetPointFahrenheit;
    }

    @JsonProperty("manual_override_allowed")
    public Optional<Boolean> getManualOverrideAllowed() {
        return manualOverrideAllowed;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClimateSettingSchedule && equalTo((ClimateSettingSchedule) other);
    }

    private boolean equalTo(ClimateSettingSchedule other) {
        return climateSettingScheduleId.equals(other.climateSettingScheduleId)
                && deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && scheduleStartsAt.equals(other.scheduleStartsAt)
                && scheduleEndsAt.equals(other.scheduleEndsAt)
                && createdAt.equals(other.createdAt)
                && automaticHeatingEnabled.equals(other.automaticHeatingEnabled)
                && automaticCoolingEnabled.equals(other.automaticCoolingEnabled)
                && hvacModeSetting.equals(other.hvacModeSetting)
                && coolingSetPointCelsius.equals(other.coolingSetPointCelsius)
                && heatingSetPointCelsius.equals(other.heatingSetPointCelsius)
                && coolingSetPointFahrenheit.equals(other.coolingSetPointFahrenheit)
                && heatingSetPointFahrenheit.equals(other.heatingSetPointFahrenheit)
                && manualOverrideAllowed.equals(other.manualOverrideAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.climateSettingScheduleId,
                this.deviceId,
                this.name,
                this.scheduleStartsAt,
                this.scheduleEndsAt,
                this.createdAt,
                this.automaticHeatingEnabled,
                this.automaticCoolingEnabled,
                this.hvacModeSetting,
                this.coolingSetPointCelsius,
                this.heatingSetPointCelsius,
                this.coolingSetPointFahrenheit,
                this.heatingSetPointFahrenheit,
                this.manualOverrideAllowed);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ClimateSettingScheduleIdStage builder() {
        return new Builder();
    }

    public interface ClimateSettingScheduleIdStage {
        DeviceIdStage climateSettingScheduleId(String climateSettingScheduleId);

        Builder from(ClimateSettingSchedule other);
    }

    public interface DeviceIdStage {
        ScheduleStartsAtStage deviceId(String deviceId);
    }

    public interface ScheduleStartsAtStage {
        ScheduleEndsAtStage scheduleStartsAt(String scheduleStartsAt);
    }

    public interface ScheduleEndsAtStage {
        CreatedAtStage scheduleEndsAt(String scheduleEndsAt);
    }

    public interface CreatedAtStage {
        _FinalStage createdAt(OffsetDateTime createdAt);
    }

    public interface _FinalStage {
        ClimateSettingSchedule build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage automaticHeatingEnabled(Optional<Boolean> automaticHeatingEnabled);

        _FinalStage automaticHeatingEnabled(Boolean automaticHeatingEnabled);

        _FinalStage automaticCoolingEnabled(Optional<Boolean> automaticCoolingEnabled);

        _FinalStage automaticCoolingEnabled(Boolean automaticCoolingEnabled);

        _FinalStage hvacModeSetting(Optional<ClimateSettingScheduleHvacModeSetting> hvacModeSetting);

        _FinalStage hvacModeSetting(ClimateSettingScheduleHvacModeSetting hvacModeSetting);

        _FinalStage coolingSetPointCelsius(Optional<Double> coolingSetPointCelsius);

        _FinalStage coolingSetPointCelsius(Double coolingSetPointCelsius);

        _FinalStage heatingSetPointCelsius(Optional<Double> heatingSetPointCelsius);

        _FinalStage heatingSetPointCelsius(Double heatingSetPointCelsius);

        _FinalStage coolingSetPointFahrenheit(Optional<Double> coolingSetPointFahrenheit);

        _FinalStage coolingSetPointFahrenheit(Double coolingSetPointFahrenheit);

        _FinalStage heatingSetPointFahrenheit(Optional<Double> heatingSetPointFahrenheit);

        _FinalStage heatingSetPointFahrenheit(Double heatingSetPointFahrenheit);

        _FinalStage manualOverrideAllowed(Optional<Boolean> manualOverrideAllowed);

        _FinalStage manualOverrideAllowed(Boolean manualOverrideAllowed);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ClimateSettingScheduleIdStage,
                    DeviceIdStage,
                    ScheduleStartsAtStage,
                    ScheduleEndsAtStage,
                    CreatedAtStage,
                    _FinalStage {
        private String climateSettingScheduleId;

        private String deviceId;

        private String scheduleStartsAt;

        private String scheduleEndsAt;

        private OffsetDateTime createdAt;

        private Optional<Boolean> manualOverrideAllowed = Optional.empty();

        private Optional<Double> heatingSetPointFahrenheit = Optional.empty();

        private Optional<Double> coolingSetPointFahrenheit = Optional.empty();

        private Optional<Double> heatingSetPointCelsius = Optional.empty();

        private Optional<Double> coolingSetPointCelsius = Optional.empty();

        private Optional<ClimateSettingScheduleHvacModeSetting> hvacModeSetting = Optional.empty();

        private Optional<Boolean> automaticCoolingEnabled = Optional.empty();

        private Optional<Boolean> automaticHeatingEnabled = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClimateSettingSchedule other) {
            climateSettingScheduleId(other.getClimateSettingScheduleId());
            deviceId(other.getDeviceId());
            name(other.getName());
            scheduleStartsAt(other.getScheduleStartsAt());
            scheduleEndsAt(other.getScheduleEndsAt());
            createdAt(other.getCreatedAt());
            automaticHeatingEnabled(other.getAutomaticHeatingEnabled());
            automaticCoolingEnabled(other.getAutomaticCoolingEnabled());
            hvacModeSetting(other.getHvacModeSetting());
            coolingSetPointCelsius(other.getCoolingSetPointCelsius());
            heatingSetPointCelsius(other.getHeatingSetPointCelsius());
            coolingSetPointFahrenheit(other.getCoolingSetPointFahrenheit());
            heatingSetPointFahrenheit(other.getHeatingSetPointFahrenheit());
            manualOverrideAllowed(other.getManualOverrideAllowed());
            return this;
        }

        @Override
        @JsonSetter("climate_setting_schedule_id")
        public DeviceIdStage climateSettingScheduleId(String climateSettingScheduleId) {
            this.climateSettingScheduleId = climateSettingScheduleId;
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public ScheduleStartsAtStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("schedule_starts_at")
        public ScheduleEndsAtStage scheduleStartsAt(String scheduleStartsAt) {
            this.scheduleStartsAt = scheduleStartsAt;
            return this;
        }

        @Override
        @JsonSetter("schedule_ends_at")
        public CreatedAtStage scheduleEndsAt(String scheduleEndsAt) {
            this.scheduleEndsAt = scheduleEndsAt;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public _FinalStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        public _FinalStage manualOverrideAllowed(Boolean manualOverrideAllowed) {
            this.manualOverrideAllowed = Optional.of(manualOverrideAllowed);
            return this;
        }

        @Override
        @JsonSetter(value = "manual_override_allowed", nulls = Nulls.SKIP)
        public _FinalStage manualOverrideAllowed(Optional<Boolean> manualOverrideAllowed) {
            this.manualOverrideAllowed = manualOverrideAllowed;
            return this;
        }

        @Override
        public _FinalStage heatingSetPointFahrenheit(Double heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = Optional.of(heatingSetPointFahrenheit);
            return this;
        }

        @Override
        @JsonSetter(value = "heating_set_point_fahrenheit", nulls = Nulls.SKIP)
        public _FinalStage heatingSetPointFahrenheit(Optional<Double> heatingSetPointFahrenheit) {
            this.heatingSetPointFahrenheit = heatingSetPointFahrenheit;
            return this;
        }

        @Override
        public _FinalStage coolingSetPointFahrenheit(Double coolingSetPointFahrenheit) {
            this.coolingSetPointFahrenheit = Optional.of(coolingSetPointFahrenheit);
            return this;
        }

        @Override
        @JsonSetter(value = "cooling_set_point_fahrenheit", nulls = Nulls.SKIP)
        public _FinalStage coolingSetPointFahrenheit(Optional<Double> coolingSetPointFahrenheit) {
            this.coolingSetPointFahrenheit = coolingSetPointFahrenheit;
            return this;
        }

        @Override
        public _FinalStage heatingSetPointCelsius(Double heatingSetPointCelsius) {
            this.heatingSetPointCelsius = Optional.of(heatingSetPointCelsius);
            return this;
        }

        @Override
        @JsonSetter(value = "heating_set_point_celsius", nulls = Nulls.SKIP)
        public _FinalStage heatingSetPointCelsius(Optional<Double> heatingSetPointCelsius) {
            this.heatingSetPointCelsius = heatingSetPointCelsius;
            return this;
        }

        @Override
        public _FinalStage coolingSetPointCelsius(Double coolingSetPointCelsius) {
            this.coolingSetPointCelsius = Optional.of(coolingSetPointCelsius);
            return this;
        }

        @Override
        @JsonSetter(value = "cooling_set_point_celsius", nulls = Nulls.SKIP)
        public _FinalStage coolingSetPointCelsius(Optional<Double> coolingSetPointCelsius) {
            this.coolingSetPointCelsius = coolingSetPointCelsius;
            return this;
        }

        @Override
        public _FinalStage hvacModeSetting(ClimateSettingScheduleHvacModeSetting hvacModeSetting) {
            this.hvacModeSetting = Optional.of(hvacModeSetting);
            return this;
        }

        @Override
        @JsonSetter(value = "hvac_mode_setting", nulls = Nulls.SKIP)
        public _FinalStage hvacModeSetting(Optional<ClimateSettingScheduleHvacModeSetting> hvacModeSetting) {
            this.hvacModeSetting = hvacModeSetting;
            return this;
        }

        @Override
        public _FinalStage automaticCoolingEnabled(Boolean automaticCoolingEnabled) {
            this.automaticCoolingEnabled = Optional.of(automaticCoolingEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "automatic_cooling_enabled", nulls = Nulls.SKIP)
        public _FinalStage automaticCoolingEnabled(Optional<Boolean> automaticCoolingEnabled) {
            this.automaticCoolingEnabled = automaticCoolingEnabled;
            return this;
        }

        @Override
        public _FinalStage automaticHeatingEnabled(Boolean automaticHeatingEnabled) {
            this.automaticHeatingEnabled = Optional.of(automaticHeatingEnabled);
            return this;
        }

        @Override
        @JsonSetter(value = "automatic_heating_enabled", nulls = Nulls.SKIP)
        public _FinalStage automaticHeatingEnabled(Optional<Boolean> automaticHeatingEnabled) {
            this.automaticHeatingEnabled = automaticHeatingEnabled;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public ClimateSettingSchedule build() {
            return new ClimateSettingSchedule(
                    climateSettingScheduleId,
                    deviceId,
                    name,
                    scheduleStartsAt,
                    scheduleEndsAt,
                    createdAt,
                    automaticHeatingEnabled,
                    automaticCoolingEnabled,
                    hvacModeSetting,
                    coolingSetPointCelsius,
                    heatingSetPointCelsius,
                    coolingSetPointFahrenheit,
                    heatingSetPointFahrenheit,
                    manualOverrideAllowed);
        }
    }
}
