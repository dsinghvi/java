/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedGetResponse.Builder.class)
public final class UnmanagedGetResponse {
    private final UnmanagedGetResponseAccessCode accessCode;

    private final boolean ok;

    private UnmanagedGetResponse(UnmanagedGetResponseAccessCode accessCode, boolean ok) {
        this.accessCode = accessCode;
        this.ok = ok;
    }

    @JsonProperty("access_code")
    public UnmanagedGetResponseAccessCode getAccessCode() {
        return accessCode;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedGetResponse && equalTo((UnmanagedGetResponse) other);
    }

    private boolean equalTo(UnmanagedGetResponse other) {
        return accessCode.equals(other.accessCode) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCode, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AccessCodeStage builder() {
        return new Builder();
    }

    public interface AccessCodeStage {
        OkStage accessCode(UnmanagedGetResponseAccessCode accessCode);

        Builder from(UnmanagedGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        UnmanagedGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AccessCodeStage, OkStage, _FinalStage {
        private UnmanagedGetResponseAccessCode accessCode;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(UnmanagedGetResponse other) {
            accessCode(other.getAccessCode());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("access_code")
        public OkStage accessCode(UnmanagedGetResponseAccessCode accessCode) {
            this.accessCode = accessCode;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public UnmanagedGetResponse build() {
            return new UnmanagedGetResponse(accessCode, ok);
        }
    }
}
