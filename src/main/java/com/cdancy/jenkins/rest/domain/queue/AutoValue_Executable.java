package com.cdancy.jenkins.rest.domain.queue;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:59
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Executable extends Executable {

    private final Integer number;

    private final String url;

    AutoValue_Executable(
            Integer number,
            String url) {
        if (number == null) {
            throw new NullPointerException("Null number");
        }
        this.number = number;
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        this.url = url;
    }

    @Override
    public Integer number() {
        return number;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public String toString() {
        return "Executable{"
                + "number=" + number + ", "
                + "url=" + url
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Executable) {
            Executable that = (Executable) o;
            return (this.number.equals(that.number()))
                    && (this.url.equals(that.url()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= number.hashCode();
        h$ *= 1000003;
        h$ ^= url.hashCode();
        return h$;
    }

}
