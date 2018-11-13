package com.cdancy.jenkins.rest.domain.job;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:53
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Parameter extends Parameter {

    private final String clazz;

    private final String name;

    private final String value;

    AutoValue_Parameter(
            @Nullable String clazz,
            String name,
            @Nullable String value) {
        this.clazz = clazz;
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        this.name = name;
        this.value = value;
    }

    @Nullable
    @Override
    public String clazz() {
        return clazz;
    }

    @Override
    public String name() {
        return name;
    }

    @Nullable
    @Override
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Parameter{"
                + "clazz=" + clazz + ", "
                + "name=" + name + ", "
                + "value=" + value
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Parameter) {
            Parameter that = (Parameter) o;
            return ((this.clazz == null) ? (that.clazz() == null) : this.clazz.equals(that.clazz()))
                    && (this.name.equals(that.name()))
                    && ((this.value == null) ? (that.value() == null) : this.value.equals(that.value()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (clazz == null) ? 0 : clazz.hashCode();
        h$ *= 1000003;
        h$ ^= name.hashCode();
        h$ *= 1000003;
        h$ ^= (value == null) ? 0 : value.hashCode();
        return h$;
    }

}
