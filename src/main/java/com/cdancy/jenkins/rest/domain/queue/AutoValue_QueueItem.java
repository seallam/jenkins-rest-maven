package com.cdancy.jenkins.rest.domain.queue;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.Map;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:00
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_QueueItem extends QueueItem {

    private final boolean blocked;

    private final boolean buildable;

    private final int id;

    private final long inQueueSince;

    private final Map<String, String> params;

    private final boolean stuck;

    private final Task task;

    private final String url;

    private final String why;

    private final long buildableStartMilliseconds;

    private final boolean cancelled;

    private final Executable executable;

    AutoValue_QueueItem(
            boolean blocked,
            boolean buildable,
            int id,
            long inQueueSince,
            Map<String, String> params,
            boolean stuck,
            Task task,
            String url,
            @Nullable String why,
            long buildableStartMilliseconds,
            boolean cancelled,
            @Nullable Executable executable) {
        this.blocked = blocked;
        this.buildable = buildable;
        this.id = id;
        this.inQueueSince = inQueueSince;
        if (params == null) {
            throw new NullPointerException("Null params");
        }
        this.params = params;
        this.stuck = stuck;
        if (task == null) {
            throw new NullPointerException("Null task");
        }
        this.task = task;
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        this.url = url;
        this.why = why;
        this.buildableStartMilliseconds = buildableStartMilliseconds;
        this.cancelled = cancelled;
        this.executable = executable;
    }

    @Override
    public boolean blocked() {
        return blocked;
    }

    @Override
    public boolean buildable() {
        return buildable;
    }

    @Override
    public int id() {
        return id;
    }

    @Override
    public long inQueueSince() {
        return inQueueSince;
    }

    @Override
    public Map<String, String> params() {
        return params;
    }

    @Override
    public boolean stuck() {
        return stuck;
    }

    @Override
    public Task task() {
        return task;
    }

    @Override
    public String url() {
        return url;
    }

    @Nullable
    @Override
    public String why() {
        return why;
    }

    @Override
    public long buildableStartMilliseconds() {
        return buildableStartMilliseconds;
    }

    @Override
    public boolean cancelled() {
        return cancelled;
    }

    @Nullable
    @Override
    public Executable executable() {
        return executable;
    }

    @Override
    public String toString() {
        return "QueueItem{"
                + "blocked=" + blocked + ", "
                + "buildable=" + buildable + ", "
                + "id=" + id + ", "
                + "inQueueSince=" + inQueueSince + ", "
                + "params=" + params + ", "
                + "stuck=" + stuck + ", "
                + "task=" + task + ", "
                + "url=" + url + ", "
                + "why=" + why + ", "
                + "buildableStartMilliseconds=" + buildableStartMilliseconds + ", "
                + "cancelled=" + cancelled + ", "
                + "executable=" + executable
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof QueueItem) {
            QueueItem that = (QueueItem) o;
            return (this.blocked == that.blocked())
                    && (this.buildable == that.buildable())
                    && (this.id == that.id())
                    && (this.inQueueSince == that.inQueueSince())
                    && (this.params.equals(that.params()))
                    && (this.stuck == that.stuck())
                    && (this.task.equals(that.task()))
                    && (this.url.equals(that.url()))
                    && ((this.why == null) ? (that.why() == null) : this.why.equals(that.why()))
                    && (this.buildableStartMilliseconds == that.buildableStartMilliseconds())
                    && (this.cancelled == that.cancelled())
                    && ((this.executable == null) ? (that.executable() == null) : this.executable.equals(that.executable()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= blocked ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= buildable ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= id;
        h$ *= 1000003;
        h$ ^= (int) ((inQueueSince >>> 32) ^ inQueueSince);
        h$ *= 1000003;
        h$ ^= params.hashCode();
        h$ *= 1000003;
        h$ ^= stuck ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= task.hashCode();
        h$ *= 1000003;
        h$ ^= url.hashCode();
        h$ *= 1000003;
        h$ ^= (why == null) ? 0 : why.hashCode();
        h$ *= 1000003;
        h$ ^= (int) ((buildableStartMilliseconds >>> 32) ^ buildableStartMilliseconds);
        h$ *= 1000003;
        h$ ^= cancelled ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= (executable == null) ? 0 : executable.hashCode();
        return h$;
    }

}

