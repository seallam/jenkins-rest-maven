package com.cdancy.jenkins.rest.domain.statistics;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.Map;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:13
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_OverallLoad extends OverallLoad {

    private final Map<String, String> availableExecutors;

    private final Map<String, String> busyExecutors;

    private final Map<String, String> connectingExecutors;

    private final Map<String, String> definedExecutors;

    private final Map<String, String> idleExecutors;

    private final Map<String, String> onlineExecutors;

    private final Map<String, String> queueLength;

    private final Map<String, String> totalExecutors;

    private final Map<String, String> totalQueueLength;

    AutoValue_OverallLoad(
            @Nullable Map<String, String> availableExecutors,
            @Nullable Map<String, String> busyExecutors,
            @Nullable Map<String, String> connectingExecutors,
            @Nullable Map<String, String> definedExecutors,
            @Nullable Map<String, String> idleExecutors,
            @Nullable Map<String, String> onlineExecutors,
            @Nullable Map<String, String> queueLength,
            @Nullable Map<String, String> totalExecutors,
            @Nullable Map<String, String> totalQueueLength) {
        this.availableExecutors = availableExecutors;
        this.busyExecutors = busyExecutors;
        this.connectingExecutors = connectingExecutors;
        this.definedExecutors = definedExecutors;
        this.idleExecutors = idleExecutors;
        this.onlineExecutors = onlineExecutors;
        this.queueLength = queueLength;
        this.totalExecutors = totalExecutors;
        this.totalQueueLength = totalQueueLength;
    }

    @Nullable
    @Override
    public Map<String, String> availableExecutors() {
        return availableExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> busyExecutors() {
        return busyExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> connectingExecutors() {
        return connectingExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> definedExecutors() {
        return definedExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> idleExecutors() {
        return idleExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> onlineExecutors() {
        return onlineExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> queueLength() {
        return queueLength;
    }

    @Nullable
    @Override
    public Map<String, String> totalExecutors() {
        return totalExecutors;
    }

    @Nullable
    @Override
    public Map<String, String> totalQueueLength() {
        return totalQueueLength;
    }

    @Override
    public String toString() {
        return "OverallLoad{"
                + "availableExecutors=" + availableExecutors + ", "
                + "busyExecutors=" + busyExecutors + ", "
                + "connectingExecutors=" + connectingExecutors + ", "
                + "definedExecutors=" + definedExecutors + ", "
                + "idleExecutors=" + idleExecutors + ", "
                + "onlineExecutors=" + onlineExecutors + ", "
                + "queueLength=" + queueLength + ", "
                + "totalExecutors=" + totalExecutors + ", "
                + "totalQueueLength=" + totalQueueLength
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof OverallLoad) {
            OverallLoad that = (OverallLoad) o;
            return ((this.availableExecutors == null) ? (that.availableExecutors() == null) : this.availableExecutors.equals(that.availableExecutors()))
                    && ((this.busyExecutors == null) ? (that.busyExecutors() == null) : this.busyExecutors.equals(that.busyExecutors()))
                    && ((this.connectingExecutors == null) ? (that.connectingExecutors() == null) : this.connectingExecutors.equals(that.connectingExecutors()))
                    && ((this.definedExecutors == null) ? (that.definedExecutors() == null) : this.definedExecutors.equals(that.definedExecutors()))
                    && ((this.idleExecutors == null) ? (that.idleExecutors() == null) : this.idleExecutors.equals(that.idleExecutors()))
                    && ((this.onlineExecutors == null) ? (that.onlineExecutors() == null) : this.onlineExecutors.equals(that.onlineExecutors()))
                    && ((this.queueLength == null) ? (that.queueLength() == null) : this.queueLength.equals(that.queueLength()))
                    && ((this.totalExecutors == null) ? (that.totalExecutors() == null) : this.totalExecutors.equals(that.totalExecutors()))
                    && ((this.totalQueueLength == null) ? (that.totalQueueLength() == null) : this.totalQueueLength.equals(that.totalQueueLength()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (availableExecutors == null) ? 0 : availableExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (busyExecutors == null) ? 0 : busyExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (connectingExecutors == null) ? 0 : connectingExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (definedExecutors == null) ? 0 : definedExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (idleExecutors == null) ? 0 : idleExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (onlineExecutors == null) ? 0 : onlineExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (queueLength == null) ? 0 : queueLength.hashCode();
        h$ *= 1000003;
        h$ ^= (totalExecutors == null) ? 0 : totalExecutors.hashCode();
        h$ *= 1000003;
        h$ ^= (totalQueueLength == null) ? 0 : totalQueueLength.hashCode();
        return h$;
    }

}

