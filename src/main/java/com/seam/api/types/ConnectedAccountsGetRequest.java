package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seam.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = ConnectedAccountsGetRequest.Deserializer.class)
public final class ConnectedAccountsGetRequest {
    private final Object value;

    private final int type;

    private ConnectedAccountsGetRequest(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((ConnectedAccountsGetRequestConnectedAccountId) this.value);
        } else if (this.type == 1) {
            return visitor.visit((ConnectedAccountsGetRequestEmail) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetRequest && equalTo((ConnectedAccountsGetRequest) other);
    }

    private boolean equalTo(ConnectedAccountsGetRequest other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static ConnectedAccountsGetRequest of(ConnectedAccountsGetRequestConnectedAccountId value) {
        return new ConnectedAccountsGetRequest(value, 0);
    }

    public static ConnectedAccountsGetRequest of(ConnectedAccountsGetRequestEmail value) {
        return new ConnectedAccountsGetRequest(value, 1);
    }

    public interface Visitor<T> {
        T visit(ConnectedAccountsGetRequestConnectedAccountId value);

        T visit(ConnectedAccountsGetRequestEmail value);
    }

    static final class Deserializer extends StdDeserializer<ConnectedAccountsGetRequest> {
        Deserializer() {
            super(ConnectedAccountsGetRequest.class);
        }

        @Override
        public ConnectedAccountsGetRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, ConnectedAccountsGetRequestConnectedAccountId.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ConnectedAccountsGetRequestEmail.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
