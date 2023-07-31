package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = UnmanagedDevicePropertiesModel.Builder.class)
public final class UnmanagedDevicePropertiesModel {
    private final String displayName;

    private UnmanagedDevicePropertiesModel(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDevicePropertiesModel && equalTo((UnmanagedDevicePropertiesModel) other);
    }

    private boolean equalTo(UnmanagedDevicePropertiesModel other) {
        return displayName.equals(other.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.displayName);
    }

    @Override
    public String toString() {
        return "UnmanagedDevicePropertiesModel{" + "displayName: " + displayName + "}";
    }

    public static DisplayNameStage builder() {
        return new Builder();
    }

    public interface DisplayNameStage {
        _FinalStage displayName(String displayName);

        Builder from(UnmanagedDevicePropertiesModel other);
    }

    public interface _FinalStage {
        UnmanagedDevicePropertiesModel build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DisplayNameStage, _FinalStage {
        private String displayName;

        private Builder() {}

        @Override
        public Builder from(UnmanagedDevicePropertiesModel other) {
            displayName(other.getDisplayName());
            return this;
        }

        @Override
        @JsonSetter("display_name")
        public _FinalStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        public UnmanagedDevicePropertiesModel build() {
            return new UnmanagedDevicePropertiesModel(displayName);
        }
    }
}