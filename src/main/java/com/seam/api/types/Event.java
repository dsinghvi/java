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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Event.Builder.class)
public final class Event {
    private final String eventId;

    private final Optional<String> deviceId;

    private final String eventType;

    private final String workspaceId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime occurredAt;

    private Event(
            String eventId,
            Optional<String> deviceId,
            String eventType,
            String workspaceId,
            OffsetDateTime createdAt,
            OffsetDateTime occurredAt) {
        this.eventId = eventId;
        this.deviceId = deviceId;
        this.eventType = eventType;
        this.workspaceId = workspaceId;
        this.createdAt = createdAt;
        this.occurredAt = occurredAt;
    }

    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("occurred_at")
    public OffsetDateTime getOccurredAt() {
        return occurredAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Event && equalTo((Event) other);
    }

    private boolean equalTo(Event other) {
        return eventId.equals(other.eventId)
                && deviceId.equals(other.deviceId)
                && eventType.equals(other.eventType)
                && workspaceId.equals(other.workspaceId)
                && createdAt.equals(other.createdAt)
                && occurredAt.equals(other.occurredAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.eventId, this.deviceId, this.eventType, this.workspaceId, this.createdAt, this.occurredAt);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventIdStage builder() {
        return new Builder();
    }

    public interface EventIdStage {
        EventTypeStage eventId(String eventId);

        Builder from(Event other);
    }

    public interface EventTypeStage {
        WorkspaceIdStage eventType(String eventType);
    }

    public interface WorkspaceIdStage {
        CreatedAtStage workspaceId(String workspaceId);
    }

    public interface CreatedAtStage {
        OccurredAtStage createdAt(OffsetDateTime createdAt);
    }

    public interface OccurredAtStage {
        _FinalStage occurredAt(OffsetDateTime occurredAt);
    }

    public interface _FinalStage {
        Event build();

        _FinalStage deviceId(Optional<String> deviceId);

        _FinalStage deviceId(String deviceId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EventIdStage, EventTypeStage, WorkspaceIdStage, CreatedAtStage, OccurredAtStage, _FinalStage {
        private String eventId;

        private String eventType;

        private String workspaceId;

        private OffsetDateTime createdAt;

        private OffsetDateTime occurredAt;

        private Optional<String> deviceId = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Event other) {
            eventId(other.getEventId());
            deviceId(other.getDeviceId());
            eventType(other.getEventType());
            workspaceId(other.getWorkspaceId());
            createdAt(other.getCreatedAt());
            occurredAt(other.getOccurredAt());
            return this;
        }

        @Override
        @JsonSetter("event_id")
        public EventTypeStage eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        @Override
        @JsonSetter("event_type")
        public WorkspaceIdStage eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public CreatedAtStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public OccurredAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("occurred_at")
        public _FinalStage occurredAt(OffsetDateTime occurredAt) {
            this.occurredAt = occurredAt;
            return this;
        }

        @Override
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @Override
        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public _FinalStage deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public Event build() {
            return new Event(eventId, deviceId, eventType, workspaceId, createdAt, occurredAt);
        }
    }
}
