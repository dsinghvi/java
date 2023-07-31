package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = WebhooksListResponse.Builder.class)
public final class WebhooksListResponse {
    private final List<Webhook> webhooks;

    private final boolean ok;

    private WebhooksListResponse(List<Webhook> webhooks, boolean ok) {
        this.webhooks = webhooks;
        this.ok = ok;
    }

    @JsonProperty("webhooks")
    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksListResponse && equalTo((WebhooksListResponse) other);
    }

    private boolean equalTo(WebhooksListResponse other) {
        return webhooks.equals(other.webhooks) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhooks, this.ok);
    }

    @Override
    public String toString() {
        return "WebhooksListResponse{" + "webhooks: " + webhooks + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(WebhooksListResponse other);
    }

    public interface _FinalStage {
        WebhooksListResponse build();

        _FinalStage webhooks(List<Webhook> webhooks);

        _FinalStage addWebhooks(Webhook webhooks);

        _FinalStage addAllWebhooks(List<Webhook> webhooks);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<Webhook> webhooks = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(WebhooksListResponse other) {
            webhooks(other.getWebhooks());
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
        public _FinalStage addAllWebhooks(List<Webhook> webhooks) {
            this.webhooks.addAll(webhooks);
            return this;
        }

        @Override
        public _FinalStage addWebhooks(Webhook webhooks) {
            this.webhooks.add(webhooks);
            return this;
        }

        @Override
        @JsonSetter(value = "webhooks", nulls = Nulls.SKIP)
        public _FinalStage webhooks(List<Webhook> webhooks) {
            this.webhooks.clear();
            this.webhooks.addAll(webhooks);
            return this;
        }

        @Override
        public WebhooksListResponse build() {
            return new WebhooksListResponse(webhooks, ok);
        }
    }
}
