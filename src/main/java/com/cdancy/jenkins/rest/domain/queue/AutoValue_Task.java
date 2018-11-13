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
final class AutoValue_Task extends Task {

    private final String name;

    private final String url;

    AutoValue_Task(
            String name,
            String url) {
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        this.name = name;
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        this.url = url;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public String toString() {
        return "Task{"
                + "name=" + name + ", "
                + "url=" + url
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Task) {
            Task that = (Task) o;
            return (this.name.equals(that.name()))
                    && (this.url.equals(that.url()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= name.hashCode();
        h$ *= 1000003;
        h$ ^= url.hashCode();
        return h$;
    }

}
