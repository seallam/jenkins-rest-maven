package com.cdancy.jenkins.rest.domain.job;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:52
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Culprit extends Culprit {

    private final String absoluteUrl;

    private final String fullName;

    AutoValue_Culprit(
            String absoluteUrl,
            String fullName) {
        if (absoluteUrl == null) {
            throw new NullPointerException("Null absoluteUrl");
        }
        this.absoluteUrl = absoluteUrl;
        if (fullName == null) {
            throw new NullPointerException("Null fullName");
        }
        this.fullName = fullName;
    }

    @Override
    public String absoluteUrl() {
        return absoluteUrl;
    }

    @Override
    public String fullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Culprit{"
                + "absoluteUrl=" + absoluteUrl + ", "
                + "fullName=" + fullName
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Culprit) {
            Culprit that = (Culprit) o;
            return (this.absoluteUrl.equals(that.absoluteUrl()))
                    && (this.fullName.equals(that.fullName()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= absoluteUrl.hashCode();
        h$ *= 1000003;
        h$ ^= fullName.hashCode();
        return h$;
    }

}
