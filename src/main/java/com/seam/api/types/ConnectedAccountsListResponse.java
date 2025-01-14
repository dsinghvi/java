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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsListResponse.Builder.class)
public final class ConnectedAccountsListResponse {
    private final List<ConnectedAccount> connectedAccounts;

    private final boolean ok;

    private ConnectedAccountsListResponse(List<ConnectedAccount> connectedAccounts, boolean ok) {
        this.connectedAccounts = connectedAccounts;
        this.ok = ok;
    }

    @JsonProperty("connected_accounts")
    public List<ConnectedAccount> getConnectedAccounts() {
        return connectedAccounts;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsListResponse && equalTo((ConnectedAccountsListResponse) other);
    }

    private boolean equalTo(ConnectedAccountsListResponse other) {
        return connectedAccounts.equals(other.connectedAccounts) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectedAccounts, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ConnectedAccountsListResponse other);
    }

    public interface _FinalStage {
        ConnectedAccountsListResponse build();

        _FinalStage connectedAccounts(List<ConnectedAccount> connectedAccounts);

        _FinalStage addConnectedAccounts(ConnectedAccount connectedAccounts);

        _FinalStage addAllConnectedAccounts(List<ConnectedAccount> connectedAccounts);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ConnectedAccount> connectedAccounts = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsListResponse other) {
            connectedAccounts(other.getConnectedAccounts());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllConnectedAccounts(List<ConnectedAccount> connectedAccounts) {
            this.connectedAccounts.addAll(connectedAccounts);
            return this;
        }

        @Override
        public _FinalStage addConnectedAccounts(ConnectedAccount connectedAccounts) {
            this.connectedAccounts.add(connectedAccounts);
            return this;
        }

        @Override
        @JsonSetter(value = "connected_accounts", nulls = Nulls.SKIP)
        public _FinalStage connectedAccounts(List<ConnectedAccount> connectedAccounts) {
            this.connectedAccounts.clear();
            this.connectedAccounts.addAll(connectedAccounts);
            return this;
        }

        @Override
        public ConnectedAccountsListResponse build() {
            return new ConnectedAccountsListResponse(connectedAccounts, ok);
        }
    }
}
