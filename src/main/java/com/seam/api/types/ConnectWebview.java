package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ConnectWebview.Builder.class)
public final class ConnectWebview {
    private final String connectWebviewId;

    private final Optional<String> connectedAccountId;

    private final String url;

    private final String workspaceId;

    private final ConnectWebviewDeviceSelectionMode deviceSelectionMode;

    private final List<String> acceptedProviders;

    private final List<String> acceptedDevices;

    private final boolean anyProviderAllowed;

    private final boolean anyDeviceAllowed;

    private final String createdAt;

    private final boolean loginSuccessful;

    private final ConnectWebviewStatus status;

    private ConnectWebview(
            String connectWebviewId,
            Optional<String> connectedAccountId,
            String url,
            String workspaceId,
            ConnectWebviewDeviceSelectionMode deviceSelectionMode,
            List<String> acceptedProviders,
            List<String> acceptedDevices,
            boolean anyProviderAllowed,
            boolean anyDeviceAllowed,
            String createdAt,
            boolean loginSuccessful,
            ConnectWebviewStatus status) {
        this.connectWebviewId = connectWebviewId;
        this.connectedAccountId = connectedAccountId;
        this.url = url;
        this.workspaceId = workspaceId;
        this.deviceSelectionMode = deviceSelectionMode;
        this.acceptedProviders = acceptedProviders;
        this.acceptedDevices = acceptedDevices;
        this.anyProviderAllowed = anyProviderAllowed;
        this.anyDeviceAllowed = anyDeviceAllowed;
        this.createdAt = createdAt;
        this.loginSuccessful = loginSuccessful;
        this.status = status;
    }

    @JsonProperty("connect_webview_id")
    public String getConnectWebviewId() {
        return connectWebviewId;
    }

    @JsonProperty("connected_account_id")
    public Optional<String> getConnectedAccountId() {
        return connectedAccountId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("device_selection_mode")
    public ConnectWebviewDeviceSelectionMode getDeviceSelectionMode() {
        return deviceSelectionMode;
    }

    @JsonProperty("accepted_providers")
    public List<String> getAcceptedProviders() {
        return acceptedProviders;
    }

    @JsonProperty("accepted_devices")
    public List<String> getAcceptedDevices() {
        return acceptedDevices;
    }

    @JsonProperty("any_provider_allowed")
    public boolean getAnyProviderAllowed() {
        return anyProviderAllowed;
    }

    @JsonProperty("any_device_allowed")
    public boolean getAnyDeviceAllowed() {
        return anyDeviceAllowed;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("login_successful")
    public boolean getLoginSuccessful() {
        return loginSuccessful;
    }

    @JsonProperty("status")
    public ConnectWebviewStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebview && equalTo((ConnectWebview) other);
    }

    private boolean equalTo(ConnectWebview other) {
        return connectWebviewId.equals(other.connectWebviewId)
                && connectedAccountId.equals(other.connectedAccountId)
                && url.equals(other.url)
                && workspaceId.equals(other.workspaceId)
                && deviceSelectionMode.equals(other.deviceSelectionMode)
                && acceptedProviders.equals(other.acceptedProviders)
                && acceptedDevices.equals(other.acceptedDevices)
                && anyProviderAllowed == other.anyProviderAllowed
                && anyDeviceAllowed == other.anyDeviceAllowed
                && createdAt.equals(other.createdAt)
                && loginSuccessful == other.loginSuccessful
                && status.equals(other.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.connectWebviewId,
                this.connectedAccountId,
                this.url,
                this.workspaceId,
                this.deviceSelectionMode,
                this.acceptedProviders,
                this.acceptedDevices,
                this.anyProviderAllowed,
                this.anyDeviceAllowed,
                this.createdAt,
                this.loginSuccessful,
                this.status);
    }

    @Override
    public String toString() {
        return "ConnectWebview{" + "connectWebviewId: " + connectWebviewId + ", connectedAccountId: "
                + connectedAccountId + ", url: " + url + ", workspaceId: " + workspaceId + ", deviceSelectionMode: "
                + deviceSelectionMode + ", acceptedProviders: " + acceptedProviders + ", acceptedDevices: "
                + acceptedDevices + ", anyProviderAllowed: " + anyProviderAllowed + ", anyDeviceAllowed: "
                + anyDeviceAllowed + ", createdAt: " + createdAt + ", loginSuccessful: " + loginSuccessful
                + ", status: " + status + "}";
    }

    public static ConnectWebviewIdStage builder() {
        return new Builder();
    }

    public interface ConnectWebviewIdStage {
        UrlStage connectWebviewId(String connectWebviewId);

        Builder from(ConnectWebview other);
    }

    public interface UrlStage {
        WorkspaceIdStage url(String url);
    }

    public interface WorkspaceIdStage {
        DeviceSelectionModeStage workspaceId(String workspaceId);
    }

    public interface DeviceSelectionModeStage {
        AnyProviderAllowedStage deviceSelectionMode(ConnectWebviewDeviceSelectionMode deviceSelectionMode);
    }

    public interface AnyProviderAllowedStage {
        AnyDeviceAllowedStage anyProviderAllowed(boolean anyProviderAllowed);
    }

    public interface AnyDeviceAllowedStage {
        CreatedAtStage anyDeviceAllowed(boolean anyDeviceAllowed);
    }

    public interface CreatedAtStage {
        LoginSuccessfulStage createdAt(String createdAt);
    }

    public interface LoginSuccessfulStage {
        StatusStage loginSuccessful(boolean loginSuccessful);
    }

    public interface StatusStage {
        _FinalStage status(ConnectWebviewStatus status);
    }

    public interface _FinalStage {
        ConnectWebview build();

        _FinalStage connectedAccountId(Optional<String> connectedAccountId);

        _FinalStage connectedAccountId(String connectedAccountId);

        _FinalStage acceptedProviders(List<String> acceptedProviders);

        _FinalStage addAcceptedProviders(String acceptedProviders);

        _FinalStage addAllAcceptedProviders(List<String> acceptedProviders);

        _FinalStage acceptedDevices(List<String> acceptedDevices);

        _FinalStage addAcceptedDevices(String acceptedDevices);

        _FinalStage addAllAcceptedDevices(List<String> acceptedDevices);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ConnectWebviewIdStage,
                    UrlStage,
                    WorkspaceIdStage,
                    DeviceSelectionModeStage,
                    AnyProviderAllowedStage,
                    AnyDeviceAllowedStage,
                    CreatedAtStage,
                    LoginSuccessfulStage,
                    StatusStage,
                    _FinalStage {
        private String connectWebviewId;

        private String url;

        private String workspaceId;

        private ConnectWebviewDeviceSelectionMode deviceSelectionMode;

        private boolean anyProviderAllowed;

        private boolean anyDeviceAllowed;

        private String createdAt;

        private boolean loginSuccessful;

        private ConnectWebviewStatus status;

        private List<String> acceptedDevices = new ArrayList<>();

        private List<String> acceptedProviders = new ArrayList<>();

        private Optional<String> connectedAccountId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ConnectWebview other) {
            connectWebviewId(other.getConnectWebviewId());
            connectedAccountId(other.getConnectedAccountId());
            url(other.getUrl());
            workspaceId(other.getWorkspaceId());
            deviceSelectionMode(other.getDeviceSelectionMode());
            acceptedProviders(other.getAcceptedProviders());
            acceptedDevices(other.getAcceptedDevices());
            anyProviderAllowed(other.getAnyProviderAllowed());
            anyDeviceAllowed(other.getAnyDeviceAllowed());
            createdAt(other.getCreatedAt());
            loginSuccessful(other.getLoginSuccessful());
            status(other.getStatus());
            return this;
        }

        @Override
        @JsonSetter("connect_webview_id")
        public UrlStage connectWebviewId(String connectWebviewId) {
            this.connectWebviewId = connectWebviewId;
            return this;
        }

        @Override
        @JsonSetter("url")
        public WorkspaceIdStage url(String url) {
            this.url = url;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public DeviceSelectionModeStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("device_selection_mode")
        public AnyProviderAllowedStage deviceSelectionMode(ConnectWebviewDeviceSelectionMode deviceSelectionMode) {
            this.deviceSelectionMode = deviceSelectionMode;
            return this;
        }

        @Override
        @JsonSetter("any_provider_allowed")
        public AnyDeviceAllowedStage anyProviderAllowed(boolean anyProviderAllowed) {
            this.anyProviderAllowed = anyProviderAllowed;
            return this;
        }

        @Override
        @JsonSetter("any_device_allowed")
        public CreatedAtStage anyDeviceAllowed(boolean anyDeviceAllowed) {
            this.anyDeviceAllowed = anyDeviceAllowed;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public LoginSuccessfulStage createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("login_successful")
        public StatusStage loginSuccessful(boolean loginSuccessful) {
            this.loginSuccessful = loginSuccessful;
            return this;
        }

        @Override
        @JsonSetter("status")
        public _FinalStage status(ConnectWebviewStatus status) {
            this.status = status;
            return this;
        }

        @Override
        public _FinalStage addAllAcceptedDevices(List<String> acceptedDevices) {
            this.acceptedDevices.addAll(acceptedDevices);
            return this;
        }

        @Override
        public _FinalStage addAcceptedDevices(String acceptedDevices) {
            this.acceptedDevices.add(acceptedDevices);
            return this;
        }

        @Override
        @JsonSetter(value = "accepted_devices", nulls = Nulls.SKIP)
        public _FinalStage acceptedDevices(List<String> acceptedDevices) {
            this.acceptedDevices.clear();
            this.acceptedDevices.addAll(acceptedDevices);
            return this;
        }

        @Override
        public _FinalStage addAllAcceptedProviders(List<String> acceptedProviders) {
            this.acceptedProviders.addAll(acceptedProviders);
            return this;
        }

        @Override
        public _FinalStage addAcceptedProviders(String acceptedProviders) {
            this.acceptedProviders.add(acceptedProviders);
            return this;
        }

        @Override
        @JsonSetter(value = "accepted_providers", nulls = Nulls.SKIP)
        public _FinalStage acceptedProviders(List<String> acceptedProviders) {
            this.acceptedProviders.clear();
            this.acceptedProviders.addAll(acceptedProviders);
            return this;
        }

        @Override
        public _FinalStage connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = Optional.of(connectedAccountId);
            return this;
        }

        @Override
        @JsonSetter(value = "connected_account_id", nulls = Nulls.SKIP)
        public _FinalStage connectedAccountId(Optional<String> connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        @Override
        public ConnectWebview build() {
            return new ConnectWebview(
                    connectWebviewId,
                    connectedAccountId,
                    url,
                    workspaceId,
                    deviceSelectionMode,
                    acceptedProviders,
                    acceptedDevices,
                    anyProviderAllowed,
                    anyDeviceAllowed,
                    createdAt,
                    loginSuccessful,
                    status);
        }
    }
}
