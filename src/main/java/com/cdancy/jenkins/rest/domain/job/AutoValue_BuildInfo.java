package com.cdancy.jenkins.rest.domain.job;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.List;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:52
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BuildInfo extends BuildInfo {

    private final List<Artifact> artifacts;

    private final List<Action> actions;

    private final boolean building;

    private final String description;

    private final String displayName;

    private final long duration;

    private final long estimatedDuration;

    private final String fullDisplayName;

    private final String id;

    private final boolean keepLog;

    private final int number;

    private final int queueId;

    private final String result;

    private final long timestamp;

    private final String url;

    private final String builtOn;

    private final List<Culprit> culprits;

    AutoValue_BuildInfo(
            List<Artifact> artifacts,
            List<Action> actions,
            boolean building,
            @Nullable String description,
            @Nullable String displayName,
            long duration,
            long estimatedDuration,
            @Nullable String fullDisplayName,
            @Nullable String id,
            boolean keepLog,
            int number,
            int queueId,
            @Nullable String result,
            long timestamp,
            @Nullable String url,
            @Nullable String builtOn,
            List<Culprit> culprits) {
        if (artifacts == null) {
            throw new NullPointerException("Null artifacts");
        }
        this.artifacts = artifacts;
        if (actions == null) {
            throw new NullPointerException("Null actions");
        }
        this.actions = actions;
        this.building = building;
        this.description = description;
        this.displayName = displayName;
        this.duration = duration;
        this.estimatedDuration = estimatedDuration;
        this.fullDisplayName = fullDisplayName;
        this.id = id;
        this.keepLog = keepLog;
        this.number = number;
        this.queueId = queueId;
        this.result = result;
        this.timestamp = timestamp;
        this.url = url;
        this.builtOn = builtOn;
        if (culprits == null) {
            throw new NullPointerException("Null culprits");
        }
        this.culprits = culprits;
    }

    @Override
    public List<Artifact> artifacts() {
        return artifacts;
    }

    @Override
    public List<Action> actions() {
        return actions;
    }

    @Override
    public boolean building() {
        return building;
    }

    @Nullable
    @Override
    public String description() {
        return description;
    }

    @Nullable
    @Override
    public String displayName() {
        return displayName;
    }

    @Override
    public long duration() {
        return duration;
    }

    @Override
    public long estimatedDuration() {
        return estimatedDuration;
    }

    @Nullable
    @Override
    public String fullDisplayName() {
        return fullDisplayName;
    }

    @Nullable
    @Override
    public String id() {
        return id;
    }

    @Override
    public boolean keepLog() {
        return keepLog;
    }

    @Override
    public int number() {
        return number;
    }

    @Override
    public int queueId() {
        return queueId;
    }

    @Nullable
    @Override
    public String result() {
        return result;
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

    @Nullable
    @Override
    public String url() {
        return url;
    }

    @Nullable
    @Override
    public String builtOn() {
        return builtOn;
    }

    @Override
    public List<Culprit> culprits() {
        return culprits;
    }

    @Override
    public String toString() {
        return "BuildInfo{"
                + "artifacts=" + artifacts + ", "
                + "actions=" + actions + ", "
                + "building=" + building + ", "
                + "description=" + description + ", "
                + "displayName=" + displayName + ", "
                + "duration=" + duration + ", "
                + "estimatedDuration=" + estimatedDuration + ", "
                + "fullDisplayName=" + fullDisplayName + ", "
                + "id=" + id + ", "
                + "keepLog=" + keepLog + ", "
                + "number=" + number + ", "
                + "queueId=" + queueId + ", "
                + "result=" + result + ", "
                + "timestamp=" + timestamp + ", "
                + "url=" + url + ", "
                + "builtOn=" + builtOn + ", "
                + "culprits=" + culprits
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof BuildInfo) {
            BuildInfo that = (BuildInfo) o;
            return (this.artifacts.equals(that.artifacts()))
                    && (this.actions.equals(that.actions()))
                    && (this.building == that.building())
                    && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()))
                    && ((this.displayName == null) ? (that.displayName() == null) : this.displayName.equals(that.displayName()))
                    && (this.duration == that.duration())
                    && (this.estimatedDuration == that.estimatedDuration())
                    && ((this.fullDisplayName == null) ? (that.fullDisplayName() == null) : this.fullDisplayName.equals(that.fullDisplayName()))
                    && ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
                    && (this.keepLog == that.keepLog())
                    && (this.number == that.number())
                    && (this.queueId == that.queueId())
                    && ((this.result == null) ? (that.result() == null) : this.result.equals(that.result()))
                    && (this.timestamp == that.timestamp())
                    && ((this.url == null) ? (that.url() == null) : this.url.equals(that.url()))
                    && ((this.builtOn == null) ? (that.builtOn() == null) : this.builtOn.equals(that.builtOn()))
                    && (this.culprits.equals(that.culprits()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= artifacts.hashCode();
        h$ *= 1000003;
        h$ ^= actions.hashCode();
        h$ *= 1000003;
        h$ ^= building ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= (description == null) ? 0 : description.hashCode();
        h$ *= 1000003;
        h$ ^= (displayName == null) ? 0 : displayName.hashCode();
        h$ *= 1000003;
        h$ ^= (int) ((duration >>> 32) ^ duration);
        h$ *= 1000003;
        h$ ^= (int) ((estimatedDuration >>> 32) ^ estimatedDuration);
        h$ *= 1000003;
        h$ ^= (fullDisplayName == null) ? 0 : fullDisplayName.hashCode();
        h$ *= 1000003;
        h$ ^= (id == null) ? 0 : id.hashCode();
        h$ *= 1000003;
        h$ ^= keepLog ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= number;
        h$ *= 1000003;
        h$ ^= queueId;
        h$ *= 1000003;
        h$ ^= (result == null) ? 0 : result.hashCode();
        h$ *= 1000003;
        h$ ^= (int) ((timestamp >>> 32) ^ timestamp);
        h$ *= 1000003;
        h$ ^= (url == null) ? 0 : url.hashCode();
        h$ *= 1000003;
        h$ ^= (builtOn == null) ? 0 : builtOn.hashCode();
        h$ *= 1000003;
        h$ ^= culprits.hashCode();
        return h$;
    }

}
