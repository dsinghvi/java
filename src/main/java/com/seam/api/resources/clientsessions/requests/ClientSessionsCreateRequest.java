package com.seam.api.resources.clientsessions.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ClientSessionsCreateRequest.Builder.class)
public final class ClientSessionsCreateRequest {
    private final Optional<String> userIdentifierKey;

    private final Optional<List<String>> connectWebviewIds;

    private final Optional<List<String>> connectedAccountIds;

    private ClientSessionsCreateRequest(
            Optional<String> userIdentifierKey,
            Optional<List<String>> connectWebviewIds,
            Optional<List<String>> connectedAccountIds) {
        this.userIdentifierKey = userIdentifierKey;
        this.connectWebviewIds = connectWebviewIds;
        this.connectedAccountIds = connectedAccountIds;
    }

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>non-empty</code>&lt;/span&gt;
     */
    @JsonProperty("user_identifier_key")
    public Optional<String> getUserIdentifierKey() {
        return userIdentifierKey;
    }

    @JsonProperty("connect_webview_ids")
    public Optional<List<String>> getConnectWebviewIds() {
        return connectWebviewIds;
    }

    @JsonProperty("connected_account_ids")
    public Optional<List<String>> getConnectedAccountIds() {
        return connectedAccountIds;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsCreateRequest && equalTo((ClientSessionsCreateRequest) other);
    }

    private boolean equalTo(ClientSessionsCreateRequest other) {
        return userIdentifierKey.equals(other.userIdentifierKey)
                && connectWebviewIds.equals(other.connectWebviewIds)
                && connectedAccountIds.equals(other.connectedAccountIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userIdentifierKey, this.connectWebviewIds, this.connectedAccountIds);
    }

    @Override
    public String toString() {
        return "ClientSessionsCreateRequest{" + "userIdentifierKey: " + userIdentifierKey + ", connectWebviewIds: "
                + connectWebviewIds + ", connectedAccountIds: " + connectedAccountIds + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> userIdentifierKey = Optional.empty();

        private Optional<List<String>> connectWebviewIds = Optional.empty();

        private Optional<List<String>> connectedAccountIds = Optional.empty();

        private Builder() {}

        public Builder from(ClientSessionsCreateRequest other) {
            userIdentifierKey(other.getUserIdentifierKey());
            connectWebviewIds(other.getConnectWebviewIds());
            connectedAccountIds(other.getConnectedAccountIds());
            return this;
        }

        @JsonSetter(value = "user_identifier_key", nulls = Nulls.SKIP)
        public Builder userIdentifierKey(Optional<String> userIdentifierKey) {
            this.userIdentifierKey = userIdentifierKey;
            return this;
        }

        public Builder userIdentifierKey(String userIdentifierKey) {
            this.userIdentifierKey = Optional.of(userIdentifierKey);
            return this;
        }

        @JsonSetter(value = "connect_webview_ids", nulls = Nulls.SKIP)
        public Builder connectWebviewIds(Optional<List<String>> connectWebviewIds) {
            this.connectWebviewIds = connectWebviewIds;
            return this;
        }

        public Builder connectWebviewIds(List<String> connectWebviewIds) {
            this.connectWebviewIds = Optional.of(connectWebviewIds);
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

        public ClientSessionsCreateRequest build() {
            return new ClientSessionsCreateRequest(userIdentifierKey, connectWebviewIds, connectedAccountIds);
        }
    }
}
