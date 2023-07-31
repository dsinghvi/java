package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = NoiseThreshold.Builder.class)
public final class NoiseThreshold {
    private final String noiseThresholdId;

    private final String deviceId;

    private final String name;

    private final Optional<Double> noiseThresholdNrs;

    private final String startsDailyAt;

    private final String endsDailyAt;

    private final double noiseThresholdDecibels;

    private NoiseThreshold(
            String noiseThresholdId,
            String deviceId,
            String name,
            Optional<Double> noiseThresholdNrs,
            String startsDailyAt,
            String endsDailyAt,
            double noiseThresholdDecibels) {
        this.noiseThresholdId = noiseThresholdId;
        this.deviceId = deviceId;
        this.name = name;
        this.noiseThresholdNrs = noiseThresholdNrs;
        this.startsDailyAt = startsDailyAt;
        this.endsDailyAt = endsDailyAt;
        this.noiseThresholdDecibels = noiseThresholdDecibels;
    }

    @JsonProperty("noise_threshold_id")
    public String getNoiseThresholdId() {
        return noiseThresholdId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("noise_threshold_nrs")
    public Optional<Double> getNoiseThresholdNrs() {
        return noiseThresholdNrs;
    }

    @JsonProperty("starts_daily_at")
    public String getStartsDailyAt() {
        return startsDailyAt;
    }

    @JsonProperty("ends_daily_at")
    public String getEndsDailyAt() {
        return endsDailyAt;
    }

    @JsonProperty("noise_threshold_decibels")
    public double getNoiseThresholdDecibels() {
        return noiseThresholdDecibels;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseThreshold && equalTo((NoiseThreshold) other);
    }

    private boolean equalTo(NoiseThreshold other) {
        return noiseThresholdId.equals(other.noiseThresholdId)
                && deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && noiseThresholdNrs.equals(other.noiseThresholdNrs)
                && startsDailyAt.equals(other.startsDailyAt)
                && endsDailyAt.equals(other.endsDailyAt)
                && noiseThresholdDecibels == other.noiseThresholdDecibels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.noiseThresholdId,
                this.deviceId,
                this.name,
                this.noiseThresholdNrs,
                this.startsDailyAt,
                this.endsDailyAt,
                this.noiseThresholdDecibels);
    }

    @Override
    public String toString() {
        return "NoiseThreshold{" + "noiseThresholdId: " + noiseThresholdId + ", deviceId: " + deviceId + ", name: "
                + name + ", noiseThresholdNrs: " + noiseThresholdNrs + ", startsDailyAt: " + startsDailyAt
                + ", endsDailyAt: " + endsDailyAt + ", noiseThresholdDecibels: " + noiseThresholdDecibels + "}";
    }

    public static NoiseThresholdIdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdIdStage {
        DeviceIdStage noiseThresholdId(String noiseThresholdId);

        Builder from(NoiseThreshold other);
    }

    public interface DeviceIdStage {
        NameStage deviceId(String deviceId);
    }

    public interface NameStage {
        StartsDailyAtStage name(String name);
    }

    public interface StartsDailyAtStage {
        EndsDailyAtStage startsDailyAt(String startsDailyAt);
    }

    public interface EndsDailyAtStage {
        NoiseThresholdDecibelsStage endsDailyAt(String endsDailyAt);
    }

    public interface NoiseThresholdDecibelsStage {
        _FinalStage noiseThresholdDecibels(double noiseThresholdDecibels);
    }

    public interface _FinalStage {
        NoiseThreshold build();

        _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs);

        _FinalStage noiseThresholdNrs(Double noiseThresholdNrs);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements NoiseThresholdIdStage,
                    DeviceIdStage,
                    NameStage,
                    StartsDailyAtStage,
                    EndsDailyAtStage,
                    NoiseThresholdDecibelsStage,
                    _FinalStage {
        private String noiseThresholdId;

        private String deviceId;

        private String name;

        private String startsDailyAt;

        private String endsDailyAt;

        private double noiseThresholdDecibels;

        private Optional<Double> noiseThresholdNrs = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(NoiseThreshold other) {
            noiseThresholdId(other.getNoiseThresholdId());
            deviceId(other.getDeviceId());
            name(other.getName());
            noiseThresholdNrs(other.getNoiseThresholdNrs());
            startsDailyAt(other.getStartsDailyAt());
            endsDailyAt(other.getEndsDailyAt());
            noiseThresholdDecibels(other.getNoiseThresholdDecibels());
            return this;
        }

        @Override
        @JsonSetter("noise_threshold_id")
        public DeviceIdStage noiseThresholdId(String noiseThresholdId) {
            this.noiseThresholdId = noiseThresholdId;
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public NameStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("name")
        public StartsDailyAtStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("starts_daily_at")
        public EndsDailyAtStage startsDailyAt(String startsDailyAt) {
            this.startsDailyAt = startsDailyAt;
            return this;
        }

        @Override
        @JsonSetter("ends_daily_at")
        public NoiseThresholdDecibelsStage endsDailyAt(String endsDailyAt) {
            this.endsDailyAt = endsDailyAt;
            return this;
        }

        @Override
        @JsonSetter("noise_threshold_decibels")
        public _FinalStage noiseThresholdDecibels(double noiseThresholdDecibels) {
            this.noiseThresholdDecibels = noiseThresholdDecibels;
            return this;
        }

        @Override
        public _FinalStage noiseThresholdNrs(Double noiseThresholdNrs) {
            this.noiseThresholdNrs = Optional.of(noiseThresholdNrs);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_threshold_nrs", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs) {
            this.noiseThresholdNrs = noiseThresholdNrs;
            return this;
        }

        @Override
        public NoiseThreshold build() {
            return new NoiseThreshold(
                    noiseThresholdId,
                    deviceId,
                    name,
                    noiseThresholdNrs,
                    startsDailyAt,
                    endsDailyAt,
                    noiseThresholdDecibels);
        }
    }
}
