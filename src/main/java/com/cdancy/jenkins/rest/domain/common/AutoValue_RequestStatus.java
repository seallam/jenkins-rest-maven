package com.cdancy.jenkins.rest.domain.common;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.List;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:10
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RequestStatus extends RequestStatus {

    private final Boolean value;

    private final List<Error> errors;

    AutoValue_RequestStatus(
            @Nullable Boolean value,
            List<Error> errors) {
        this.value = value;
        if (errors == null) {
            throw new NullPointerException("Null errors");
        }
        this.errors = errors;
    }

    @Nullable
    @Override
    public Boolean value() {
        return value;
    }

    @Override
    public List<Error> errors() {
        return errors;
    }

    @Override
    public String toString() {
        return "RequestStatus{"
                + "value=" + value + ", "
                + "errors=" + errors
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof RequestStatus) {
            RequestStatus that = (RequestStatus) o;
            return ((this.value == null) ? (that.value() == null) : this.value.equals(that.value()))
                    && (this.errors.equals(that.errors()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (value == null) ? 0 : value.hashCode();
        h$ *= 1000003;
        h$ ^= errors.hashCode();
        return h$;
    }

}

