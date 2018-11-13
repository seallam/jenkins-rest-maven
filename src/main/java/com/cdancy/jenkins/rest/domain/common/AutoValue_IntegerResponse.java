package com.cdancy.jenkins.rest.domain.common;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.List;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:11
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_IntegerResponse extends IntegerResponse {

    private final Integer value;

    private final List<Error> errors;

    AutoValue_IntegerResponse(
            @Nullable Integer value,
            List<Error> errors) {
        this.value = value;
        if (errors == null) {
            throw new NullPointerException("Null errors");
        }
        this.errors = errors;
    }

    @Nullable
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public List<Error> errors() {
        return errors;
    }

    @Override
    public String toString() {
        return "IntegerResponse{"
                + "value=" + value + ", "
                + "errors=" + errors
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof IntegerResponse) {
            IntegerResponse that = (IntegerResponse) o;
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

