package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = DeviceWarningsItem.Builder.class)
public final class DeviceWarningsItem {
    private final String warningCode;

    private final String message;

    private DeviceWarningsItem(String warningCode, String message) {
        this.warningCode = warningCode;
        this.message = message;
    }

    @JsonProperty("warning_code")
    public String getWarningCode() {
        return warningCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceWarningsItem && equalTo((DeviceWarningsItem) other);
    }

    private boolean equalTo(DeviceWarningsItem other) {
        return warningCode.equals(other.warningCode) && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.warningCode, this.message);
    }

    @Override
    public String toString() {
        return "DeviceWarningsItem{" + "warningCode: " + warningCode + ", message: " + message + "}";
    }

    public static WarningCodeStage builder() {
        return new Builder();
    }

    public interface WarningCodeStage {
        MessageStage warningCode(String warningCode);

        Builder from(DeviceWarningsItem other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        DeviceWarningsItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WarningCodeStage, MessageStage, _FinalStage {
        private String warningCode;

        private String message;

        private Builder() {}

        @Override
        public Builder from(DeviceWarningsItem other) {
            warningCode(other.getWarningCode());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("warning_code")
        public MessageStage warningCode(String warningCode) {
            this.warningCode = warningCode;
            return this;
        }

        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public DeviceWarningsItem build() {
            return new DeviceWarningsItem(warningCode, message);
        }
    }
}
