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

@JsonDeserialize(using = LocksListRequestDeviceType.Deserializer.class)
public final class LocksListRequestDeviceType {
    private final Object value;

    private final int type;

    private LocksListRequestDeviceType(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((LocksListRequestDeviceTypeLocksListRequestDeviceType) this.value);
        } else if (this.type == 1) {
            return visitor.visit((LocksListRequestDeviceTypeLocksListRequestDeviceType) this.value);
        } else if (this.type == 2) {
            return visitor.visit((LocksListRequestDeviceTypeLocksListRequestDeviceType) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LocksListRequestDeviceType && equalTo((LocksListRequestDeviceType) other);
    }

    private boolean equalTo(LocksListRequestDeviceType other) {
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

    public static LocksListRequestDeviceType of(LocksListRequestDeviceTypeLocksListRequestDeviceType value) {
        return new LocksListRequestDeviceType(value, 0);
    }

    public static LocksListRequestDeviceType of(LocksListRequestDeviceTypeLocksListRequestDeviceType value) {
        return new LocksListRequestDeviceType(value, 1);
    }

    public static LocksListRequestDeviceType of(LocksListRequestDeviceTypeLocksListRequestDeviceType value) {
        return new LocksListRequestDeviceType(value, 2);
    }

    public interface Visitor<T> {
        T visit(LocksListRequestDeviceTypeLocksListRequestDeviceType value);

        T visit(LocksListRequestDeviceTypeLocksListRequestDeviceType value);

        T visit(LocksListRequestDeviceTypeLocksListRequestDeviceType value);
    }

    static final class Deserializer extends StdDeserializer<LocksListRequestDeviceType> {
        Deserializer() {
            super(LocksListRequestDeviceType.class);
        }

        @Override
        public LocksListRequestDeviceType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, LocksListRequestDeviceTypeLocksListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, LocksListRequestDeviceTypeLocksListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, LocksListRequestDeviceTypeLocksListRequestDeviceType.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
