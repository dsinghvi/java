package com.seam.api.resources.devices.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.DevicesUnmanagedListRequestDeviceType;
import com.seam.api.types.DevicesUnmanagedListRequestDeviceTypesItem;
import com.seam.api.types.DevicesUnmanagedListRequestManufacturer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = DevicesUnmanagedListRequest.Builder.class)
public final class DevicesUnmanagedListRequest {
    private final Optional<String> connectedAccountId;

    private final Optional<List<String>> connectedAccountIds;

    private final Optional<String> connectWebviewId;

    private final Optional<DevicesUnmanagedListRequestDeviceType> deviceType;

    private final Optional<List<DevicesUnmanagedListRequestDeviceTypesItem>> deviceTypes;

    private final Optional<DevicesUnmanagedListRequestManufacturer> manufacturer;

    private final Optional<List<String>> deviceIds;

    private final Optional<Double> limit;

    private final Optional<String> createdBefore;

    private DevicesUnmanagedListRequest(
            Optional<String> connectedAccountId,
            Optional<List<String>> connectedAccountIds,
            Optional<String> connectWebviewId,
            Optional<DevicesUnmanagedListRequestDeviceType> deviceType,
            Optional<List<DevicesUnmanagedListRequestDeviceTypesItem>> deviceTypes,
            Optional<DevicesUnmanagedListRequestManufacturer> manufacturer,
            Optional<List<String>> deviceIds,
            Optional<Double> limit,
            Optional<String> createdBefore) {
        this.connectedAccountId = connectedAccountId;
        this.connectedAccountIds = connectedAccountIds;
        this.connectWebviewId = connectWebviewId;
        this.deviceType = deviceType;
        this.deviceTypes = deviceTypes;
        this.manufacturer = manufacturer;
        this.deviceIds = deviceIds;
        this.limit = limit;
        this.createdBefore = createdBefore;
    }

    @JsonProperty("connected_account_id")
    public Optional<String> getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("connected_account_ids")
    public Optional<List<String>> getConnectedAccountIds() {
        return connectedAccountIds;
    }

    @JsonProperty("connect_webview_id")
    public Optional<String> getConnectWebviewId() {
        return connectWebviewId;
    }

    @JsonProperty("device_type")
    public Optional<DevicesUnmanagedListRequestDeviceType> getDeviceType() {
        return deviceType;
    }

    @JsonProperty("device_types")
    public Optional<List<DevicesUnmanagedListRequestDeviceTypesItem>> getDeviceTypes() {
        return deviceTypes;
    }

    @JsonProperty("manufacturer")
    public Optional<DevicesUnmanagedListRequestManufacturer> getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("device_ids")
    public Optional<List<String>> getDeviceIds() {
        return deviceIds;
    }

    @JsonProperty("limit")
    public Optional<Double> getLimit() {
        return limit;
    }

    @JsonProperty("created_before")
    public Optional<String> getCreatedBefore() {
        return createdBefore;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUnmanagedListRequest && equalTo((DevicesUnmanagedListRequest) other);
    }

    private boolean equalTo(DevicesUnmanagedListRequest other) {
        return connectedAccountId.equals(other.connectedAccountId)
                && connectedAccountIds.equals(other.connectedAccountIds)
                && connectWebviewId.equals(other.connectWebviewId)
                && deviceType.equals(other.deviceType)
                && deviceTypes.equals(other.deviceTypes)
                && manufacturer.equals(other.manufacturer)
                && deviceIds.equals(other.deviceIds)
                && limit.equals(other.limit)
                && createdBefore.equals(other.createdBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.connectedAccountId,
                this.connectedAccountIds,
                this.connectWebviewId,
                this.deviceType,
                this.deviceTypes,
                this.manufacturer,
                this.deviceIds,
                this.limit,
                this.createdBefore);
    }

    @Override
    public String toString() {
        return "DevicesUnmanagedListRequest{" + "connectedAccountId: " + connectedAccountId + ", connectedAccountIds: "
                + connectedAccountIds + ", connectWebviewId: " + connectWebviewId + ", deviceType: " + deviceType
                + ", deviceTypes: " + deviceTypes + ", manufacturer: " + manufacturer + ", deviceIds: " + deviceIds
                + ", limit: " + limit + ", createdBefore: " + createdBefore + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> connectedAccountId = Optional.empty();

        private Optional<List<String>> connectedAccountIds = Optional.empty();

        private Optional<String> connectWebviewId = Optional.empty();

        private Optional<DevicesUnmanagedListRequestDeviceType> deviceType = Optional.empty();

        private Optional<List<DevicesUnmanagedListRequestDeviceTypesItem>> deviceTypes = Optional.empty();

        private Optional<DevicesUnmanagedListRequestManufacturer> manufacturer = Optional.empty();

        private Optional<List<String>> deviceIds = Optional.empty();

        private Optional<Double> limit = Optional.empty();

        private Optional<String> createdBefore = Optional.empty();

        private Builder() {}

        public Builder from(DevicesUnmanagedListRequest other) {
            connectedAccountId(other.getConnectedAccountId());
            connectedAccountIds(other.getConnectedAccountIds());
            connectWebviewId(other.getConnectWebviewId());
            deviceType(other.getDeviceType());
            deviceTypes(other.getDeviceTypes());
            manufacturer(other.getManufacturer());
            deviceIds(other.getDeviceIds());
            limit(other.getLimit());
            createdBefore(other.getCreatedBefore());
            return this;
        }

        @JsonSetter(value = "connected_account_id", nulls = Nulls.SKIP)
        public Builder connectedAccountId(Optional<String> connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        public Builder connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = Optional.of(connectedAccountId);
            return this;
        }

        @JsonSetter(value = "connected_account_ids", nulls = Nulls.SKIP)
        public Builder connectedAccountIds(Optional<List<String>> connectedAccountIds) {
            this.connectedAccountIds = connectedAccountIds;
            return this;
        }

        public Builder connectedAccountIds(List<String> connectedAccountIds) {
            this.connectedAccountIds = Optional.of(connectedAccountIds);
            return this;
        }

        @JsonSetter(value = "connect_webview_id", nulls = Nulls.SKIP)
        public Builder connectWebviewId(Optional<String> connectWebviewId) {
            this.connectWebviewId = connectWebviewId;
            return this;
        }

        public Builder connectWebviewId(String connectWebviewId) {
            this.connectWebviewId = Optional.of(connectWebviewId);
            return this;
        }

        @JsonSetter(value = "device_type", nulls = Nulls.SKIP)
        public Builder deviceType(Optional<DevicesUnmanagedListRequestDeviceType> deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public Builder deviceType(DevicesUnmanagedListRequestDeviceType deviceType) {
            this.deviceType = Optional.of(deviceType);
            return this;
        }

        @JsonSetter(value = "device_types", nulls = Nulls.SKIP)
        public Builder deviceTypes(Optional<List<DevicesUnmanagedListRequestDeviceTypesItem>> deviceTypes) {
            this.deviceTypes = deviceTypes;
            return this;
        }

        public Builder deviceTypes(List<DevicesUnmanagedListRequestDeviceTypesItem> deviceTypes) {
            this.deviceTypes = Optional.of(deviceTypes);
            return this;
        }

        @JsonSetter(value = "manufacturer", nulls = Nulls.SKIP)
        public Builder manufacturer(Optional<DevicesUnmanagedListRequestManufacturer> manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder manufacturer(DevicesUnmanagedListRequestManufacturer manufacturer) {
            this.manufacturer = Optional.of(manufacturer);
            return this;
        }

        @JsonSetter(value = "device_ids", nulls = Nulls.SKIP)
        public Builder deviceIds(Optional<List<String>> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds = Optional.of(deviceIds);
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Double> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Double limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @JsonSetter(value = "created_before", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<String> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(String createdBefore) {
            this.createdBefore = Optional.of(createdBefore);
            return this;
        }

        public DevicesUnmanagedListRequest build() {
            return new DevicesUnmanagedListRequest(
                    connectedAccountId,
                    connectedAccountIds,
                    connectWebviewId,
                    deviceType,
                    deviceTypes,
                    manufacturer,
                    deviceIds,
                    limit,
                    createdBefore);
        }
    }
}