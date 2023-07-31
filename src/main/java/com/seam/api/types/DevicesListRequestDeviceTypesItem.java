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

@JsonDeserialize(using = DevicesListRequestDeviceTypesItem.Deserializer.class)
public final class DevicesListRequestDeviceTypesItem {
    private final Object value;

    private final int type;

    private DevicesListRequestDeviceTypesItem(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem) this.value);
        } else if (this.type == 1) {
            return visitor.visit((DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem) this.value);
        } else if (this.type == 2) {
            return visitor.visit((DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListRequestDeviceTypesItem && equalTo((DevicesListRequestDeviceTypesItem) other);
    }

    private boolean equalTo(DevicesListRequestDeviceTypesItem other) {
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

    public static DevicesListRequestDeviceTypesItem of(
            DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value) {
        return new DevicesListRequestDeviceTypesItem(value, 0);
    }

    public static DevicesListRequestDeviceTypesItem of(
            DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value) {
        return new DevicesListRequestDeviceTypesItem(value, 1);
    }

    public static DevicesListRequestDeviceTypesItem of(
            DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value) {
        return new DevicesListRequestDeviceTypesItem(value, 2);
    }

    public interface Visitor<T> {
        T visit(DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value);

        T visit(DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value);

        T visit(DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem value);
    }

    static final class Deserializer extends StdDeserializer<DevicesListRequestDeviceTypesItem> {
        Deserializer() {
            super(DevicesListRequestDeviceTypesItem.class);
        }

        @Override
        public DevicesListRequestDeviceTypesItem deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicesListRequestDeviceTypesItemDevicesListRequestDeviceTypesItem.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
