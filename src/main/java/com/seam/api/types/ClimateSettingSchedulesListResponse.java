package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClimateSettingSchedulesListResponse.Builder.class)
public final class ClimateSettingSchedulesListResponse {
    private final List<ClimateSettingSchedule> climateSettingSchedules;

    private final boolean ok;

    private ClimateSettingSchedulesListResponse(List<ClimateSettingSchedule> climateSettingSchedules, boolean ok) {
        this.climateSettingSchedules = climateSettingSchedules;
        this.ok = ok;
    }

    @JsonProperty("climate_setting_schedules")
    public List<ClimateSettingSchedule> getClimateSettingSchedules() {
        return climateSettingSchedules;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClimateSettingSchedulesListResponse
                && equalTo((ClimateSettingSchedulesListResponse) other);
    }

    private boolean equalTo(ClimateSettingSchedulesListResponse other) {
        return climateSettingSchedules.equals(other.climateSettingSchedules) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingSchedules, this.ok);
    }

    @Override
    public String toString() {
        return "ClimateSettingSchedulesListResponse{" + "climateSettingSchedules: " + climateSettingSchedules + ", ok: "
                + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ClimateSettingSchedulesListResponse other);
    }

    public interface _FinalStage {
        ClimateSettingSchedulesListResponse build();

        _FinalStage climateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules);

        _FinalStage addClimateSettingSchedules(ClimateSettingSchedule climateSettingSchedules);

        _FinalStage addAllClimateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ClimateSettingSchedule> climateSettingSchedules = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ClimateSettingSchedulesListResponse other) {
            climateSettingSchedules(other.getClimateSettingSchedules());
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
        public _FinalStage addAllClimateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules) {
            this.climateSettingSchedules.addAll(climateSettingSchedules);
            return this;
        }

        @Override
        public _FinalStage addClimateSettingSchedules(ClimateSettingSchedule climateSettingSchedules) {
            this.climateSettingSchedules.add(climateSettingSchedules);
            return this;
        }

        @Override
        @JsonSetter(value = "climate_setting_schedules", nulls = Nulls.SKIP)
        public _FinalStage climateSettingSchedules(List<ClimateSettingSchedule> climateSettingSchedules) {
            this.climateSettingSchedules.clear();
            this.climateSettingSchedules.addAll(climateSettingSchedules);
            return this;
        }

        @Override
        public ClimateSettingSchedulesListResponse build() {
            return new ClimateSettingSchedulesListResponse(climateSettingSchedules, ok);
        }
    }
}