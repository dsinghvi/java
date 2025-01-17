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
@JsonDeserialize(builder = UnmanagedGetResponseAccessCode.Builder.class)
public final class UnmanagedGetResponseAccessCode {
    private final UnmanagedGetResponseAccessCodeType type;

    private final String accessCodeId;

    private final String deviceId;

    private final Optional<String> name;

    private final Optional<String> code;

    private final OffsetDateTime createdAt;

    private final Optional<Object> errors;

    private final Optional<Object> warnings;

    private final String isManaged;

    private final Optional<OffsetDateTime> startsAt;

    private final Optional<OffsetDateTime> endsAt;

    private UnmanagedGetResponseAccessCode(
            UnmanagedGetResponseAccessCodeType type,
            String accessCodeId,
            String deviceId,
            Optional<String> name,
            Optional<String> code,
            OffsetDateTime createdAt,
            Optional<Object> errors,
            Optional<Object> warnings,
            String isManaged,
            Optional<OffsetDateTime> startsAt,
            Optional<OffsetDateTime> endsAt) {
        this.type = type;
        this.accessCodeId = accessCodeId;
        this.deviceId = deviceId;
        this.name = name;
        this.code = code;
        this.createdAt = createdAt;
        this.errors = errors;
        this.warnings = warnings;
        this.isManaged = isManaged;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
    }

    @JsonProperty("type")
    public UnmanagedGetResponseAccessCodeType getType() {
        return type;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("errors")
    public Optional<Object> getErrors() {
        return errors;
    }

    @JsonProperty("warnings")
    public Optional<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("is_managed")
    public String getIsManaged() {
        return isManaged;
    }

    @JsonProperty("starts_at")
    public Optional<OffsetDateTime> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<OffsetDateTime> getEndsAt() {
        return endsAt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "set";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedGetResponseAccessCode && equalTo((UnmanagedGetResponseAccessCode) other);
    }

    private boolean equalTo(UnmanagedGetResponseAccessCode other) {
        return type.equals(other.type)
                && accessCodeId.equals(other.accessCodeId)
                && deviceId.equals(other.deviceId)
                && name.equals(other.name)
                && code.equals(other.code)
                && createdAt.equals(other.createdAt)
                && errors.equals(other.errors)
                && warnings.equals(other.warnings)
                && isManaged.equals(other.isManaged)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.type,
                this.accessCodeId,
                this.deviceId,
                this.name,
                this.code,
                this.createdAt,
                this.errors,
                this.warnings,
                this.isManaged,
                this.startsAt,
                this.endsAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        AccessCodeIdStage type(UnmanagedGetResponseAccessCodeType type);

        Builder from(UnmanagedGetResponseAccessCode other);
    }

    public interface AccessCodeIdStage {
        DeviceIdStage accessCodeId(String accessCodeId);
    }

    public interface DeviceIdStage {
        CreatedAtStage deviceId(String deviceId);
    }

    public interface CreatedAtStage {
        IsManagedStage createdAt(OffsetDateTime createdAt);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(String isManaged);
    }

    public interface _FinalStage {
        UnmanagedGetResponseAccessCode build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage code(Optional<String> code);

        _FinalStage code(String code);

        _FinalStage errors(Optional<Object> errors);

        _FinalStage errors(Object errors);

        _FinalStage warnings(Optional<Object> warnings);

        _FinalStage warnings(Object warnings);

        _FinalStage startsAt(Optional<OffsetDateTime> startsAt);

        _FinalStage startsAt(OffsetDateTime startsAt);

        _FinalStage endsAt(Optional<OffsetDateTime> endsAt);

        _FinalStage endsAt(OffsetDateTime endsAt);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage, AccessCodeIdStage, DeviceIdStage, CreatedAtStage, IsManagedStage, _FinalStage {
        private UnmanagedGetResponseAccessCodeType type;

        private String accessCodeId;

        private String deviceId;

        private OffsetDateTime createdAt;

        private String isManaged;

        private Optional<OffsetDateTime> endsAt = Optional.empty();

        private Optional<OffsetDateTime> startsAt = Optional.empty();

        private Optional<Object> warnings = Optional.empty();

        private Optional<Object> errors = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(UnmanagedGetResponseAccessCode other) {
            type(other.getType());
            accessCodeId(other.getAccessCodeId());
            deviceId(other.getDeviceId());
            name(other.getName());
            code(other.getCode());
            createdAt(other.getCreatedAt());
            errors(other.getErrors());
            warnings(other.getWarnings());
            isManaged(other.getIsManaged());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            return this;
        }

        @Override
        @JsonSetter("type")
        public AccessCodeIdStage type(UnmanagedGetResponseAccessCodeType type) {
            this.type = type;
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public DeviceIdStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public CreatedAtStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public IsManagedStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public _FinalStage endsAt(OffsetDateTime endsAt) {
            this.endsAt = Optional.of(endsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public _FinalStage endsAt(Optional<OffsetDateTime> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        @Override
        public _FinalStage startsAt(OffsetDateTime startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @Override
        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public _FinalStage startsAt(Optional<OffsetDateTime> startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        @Override
        public _FinalStage warnings(Object warnings) {
            this.warnings = Optional.of(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(Optional<Object> warnings) {
            this.warnings = warnings;
            return this;
        }

        @Override
        public _FinalStage errors(Object errors) {
            this.errors = Optional.of(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(Optional<Object> errors) {
            this.errors = errors;
            return this;
        }

        @Override
        public _FinalStage code(String code) {
            this.code = Optional.of(code);
            return this;
        }

        @Override
        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public _FinalStage code(Optional<String> code) {
            this.code = code;
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
        public UnmanagedGetResponseAccessCode build() {
            return new UnmanagedGetResponseAccessCode(
                    type, accessCodeId, deviceId, name, code, createdAt, errors, warnings, isManaged, startsAt, endsAt);
        }
    }
}
