package com.cdancy.jenkins.rest.domain.common;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:11
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Error extends Error {

    private final String context;

    private final String message;

    private final String exceptionName;

    AutoValue_Error(
            @Nullable String context,
            String message,
            String exceptionName) {
        this.context = context;
        if (message == null) {
            throw new NullPointerException("Null message");
        }
        this.message = message;
        if (exceptionName == null) {
            throw new NullPointerException("Null exceptionName");
        }
        this.exceptionName = exceptionName;
    }

    @Nullable
    @Override
    public String context() {
        return context;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String exceptionName() {
        return exceptionName;
    }

    @Override
    public String toString() {
        return "Error{"
                + "context=" + context + ", "
                + "message=" + message + ", "
                + "exceptionName=" + exceptionName
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Error) {
            Error that = (Error) o;
            return ((this.context == null) ? (that.context() == null) : this.context.equals(that.context()))
                    && (this.message.equals(that.message()))
                    && (this.exceptionName.equals(that.exceptionName()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (context == null) ? 0 : context.hashCode();
        h$ *= 1000003;
        h$ ^= message.hashCode();
        h$ *= 1000003;
        h$ ^= exceptionName.hashCode();
        return h$;
    }

}

