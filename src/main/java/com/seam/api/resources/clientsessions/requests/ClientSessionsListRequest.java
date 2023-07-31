package com.seam.api.resources.clientsessions.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ClientSessionsListRequest.Builder.class)
public final class ClientSessionsListRequest {
    private final Optional<String> clientSessionId;

    private final Optional<String> userIdentifierKey;

    private final Optional<Boolean> withoutUserIdentifierKey;

    private ClientSessionsListRequest(
            Optional<String> clientSessionId,
            Optional<String> userIdentifierKey,
            Optional<Boolean> withoutUserIdentifierKey) {
        this.clientSessionId = clientSessionId;
        this.userIdentifierKey = userIdentifierKey;
        this.withoutUserIdentifierKey = withoutUserIdentifierKey;
    }

    @JsonProperty("client_session_id")
    public Optional<String> getClientSessionId() {
        return clientSessionId;
    }

    @JsonProperty("user_identifier_key")
    public Optional<String> getUserIdentifierKey() {
        return userIdentifierKey;
    }

    @JsonProperty("without_user_identifier_key")
    public Optional<Boolean> getWithoutUserIdentifierKey() {
        return withoutUserIdentifierKey;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsListRequest && equalTo((ClientSessionsListRequest) other);
    }

    private boolean equalTo(ClientSessionsListRequest other) {
        return clientSessionId.equals(other.clientSessionId)
                && userIdentifierKey.equals(other.userIdentifierKey)
                && withoutUserIdentifierKey.equals(other.withoutUserIdentifierKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSessionId, this.userIdentifierKey, this.withoutUserIdentifierKey);
    }

    @Override
    public String toString() {
        return "ClientSessionsListRequest{" + "clientSessionId: " + clientSessionId + ", userIdentifierKey: "
                + userIdentifierKey + ", withoutUserIdentifierKey: " + withoutUserIdentifierKey + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> clientSessionId = Optional.empty();

        private Optional<String> userIdentifierKey = Optional.empty();

        private Optional<Boolean> withoutUserIdentifierKey = Optional.empty();

        private Builder() {}

        public Builder from(ClientSessionsListRequest other) {
            clientSessionId(other.getClientSessionId());
            userIdentifierKey(other.getUserIdentifierKey());
            withoutUserIdentifierKey(other.getWithoutUserIdentifierKey());
            return this;
        }

        @JsonSetter(value = "client_session_id", nulls = Nulls.SKIP)
        public Builder clientSessionId(Optional<String> clientSessionId) {
            this.clientSessionId = clientSessionId;
            return this;
        }

        public Builder clientSessionId(String clientSessionId) {
            this.clientSessionId = Optional.of(clientSessionId);
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

        @JsonSetter(value = "without_user_identifier_key", nulls = Nulls.SKIP)
        public Builder withoutUserIdentifierKey(Optional<Boolean> withoutUserIdentifierKey) {
            this.withoutUserIdentifierKey = withoutUserIdentifierKey;
            return this;
        }

        public Builder withoutUserIdentifierKey(Boolean withoutUserIdentifierKey) {
            this.withoutUserIdentifierKey = Optional.of(withoutUserIdentifierKey);
            return this;
        }

        public ClientSessionsListRequest build() {
            return new ClientSessionsListRequest(clientSessionId, userIdentifierKey, withoutUserIdentifierKey);
        }
    }
}
