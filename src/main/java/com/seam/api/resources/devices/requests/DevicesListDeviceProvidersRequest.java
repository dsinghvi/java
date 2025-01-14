/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.devices.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.DevicesListDeviceProvidersRequestProviderCategory;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicesListDeviceProvidersRequest.Builder.class)
public final class DevicesListDeviceProvidersRequest {
    private final Optional<DevicesListDeviceProvidersRequestProviderCategory> providerCategory;

    private DevicesListDeviceProvidersRequest(
            Optional<DevicesListDeviceProvidersRequestProviderCategory> providerCategory) {
        this.providerCategory = providerCategory;
    }

    @JsonProperty("provider_category")
    public Optional<DevicesListDeviceProvidersRequestProviderCategory> getProviderCategory() {
        return providerCategory;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListDeviceProvidersRequest && equalTo((DevicesListDeviceProvidersRequest) other);
    }

    private boolean equalTo(DevicesListDeviceProvidersRequest other) {
        return providerCategory.equals(other.providerCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.providerCategory);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<DevicesListDeviceProvidersRequestProviderCategory> providerCategory = Optional.empty();

        private Builder() {}

        public Builder from(DevicesListDeviceProvidersRequest other) {
            providerCategory(other.getProviderCategory());
            return this;
        }

        @JsonSetter(value = "provider_category", nulls = Nulls.SKIP)
        public Builder providerCategory(Optional<DevicesListDeviceProvidersRequestProviderCategory> providerCategory) {
            this.providerCategory = providerCategory;
            return this;
        }

        public Builder providerCategory(DevicesListDeviceProvidersRequestProviderCategory providerCategory) {
            this.providerCategory = Optional.of(providerCategory);
            return this;
        }

        public DevicesListDeviceProvidersRequest build() {
            return new DevicesListDeviceProvidersRequest(providerCategory);
        }
    }
}
