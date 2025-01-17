/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.accesscodes.unmanaged.requests;

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
@JsonDeserialize(builder = UnmanagedConvertToManagedRequest.Builder.class)
public final class UnmanagedConvertToManagedRequest {
    private final String accessCodeId;

    private final Optional<Boolean> force;

    private final Optional<Boolean> sync;

    private UnmanagedConvertToManagedRequest(String accessCodeId, Optional<Boolean> force, Optional<Boolean> sync) {
        this.accessCodeId = accessCodeId;
        this.force = force;
        this.sync = sync;
    }

    @JsonProperty("access_code_id")
    public String getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("force")
    public Optional<Boolean> getForce() {
        return force;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedConvertToManagedRequest && equalTo((UnmanagedConvertToManagedRequest) other);
    }

    private boolean equalTo(UnmanagedConvertToManagedRequest other) {
        return accessCodeId.equals(other.accessCodeId) && force.equals(other.force) && sync.equals(other.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodeId, this.force, this.sync);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccessCodeIdStage builder() {
        return new Builder();
    }

    public interface AccessCodeIdStage {
        _FinalStage accessCodeId(String accessCodeId);

        Builder from(UnmanagedConvertToManagedRequest other);
    }

    public interface _FinalStage {
        UnmanagedConvertToManagedRequest build();

        _FinalStage force(Optional<Boolean> force);

        _FinalStage force(Boolean force);

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeIdStage, _FinalStage {
        private String accessCodeId;

        private Optional<Boolean> sync = Optional.empty();

        private Optional<Boolean> force = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(UnmanagedConvertToManagedRequest other) {
            accessCodeId(other.getAccessCodeId());
            force(other.getForce());
            sync(other.getSync());
            return this;
        }

        @Override
        @JsonSetter("access_code_id")
        public _FinalStage accessCodeId(String accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        @Override
        public _FinalStage sync(Boolean sync) {
            this.sync = Optional.of(sync);
            return this;
        }

        @Override
        @JsonSetter(value = "sync", nulls = Nulls.SKIP)
        public _FinalStage sync(Optional<Boolean> sync) {
            this.sync = sync;
            return this;
        }

        @Override
        public _FinalStage force(Boolean force) {
            this.force = Optional.of(force);
            return this;
        }

        @Override
        @JsonSetter(value = "force", nulls = Nulls.SKIP)
        public _FinalStage force(Optional<Boolean> force) {
            this.force = force;
            return this;
        }

        @Override
        public UnmanagedConvertToManagedRequest build() {
            return new UnmanagedConvertToManagedRequest(accessCodeId, force, sync);
        }
    }
}
