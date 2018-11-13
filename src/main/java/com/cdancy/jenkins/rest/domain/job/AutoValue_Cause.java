package com.cdancy.jenkins.rest.domain.job;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:50
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Cause extends Cause {

    private final String clazz;

    private final String shortDescription;

    private final String userId;

    private final String userName;

    AutoValue_Cause(
            @Nullable String clazz,
            String shortDescription,
            @Nullable String userId,
            @Nullable String userName) {
        this.clazz = clazz;
        if (shortDescription == null) {
            throw new NullPointerException("Null shortDescription");
        }
        this.shortDescription = shortDescription;
        this.userId = userId;
        this.userName = userName;
    }

    @Nullable
    @Override
    public String clazz() {
        return clazz;
    }

    @Override
    public String shortDescription() {
        return shortDescription;
    }

    @Nullable
    @Override
    public String userId() {
        return userId;
    }

    @Nullable
    @Override
    public String userName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Cause{"
                + "clazz=" + clazz + ", "
                + "shortDescription=" + shortDescription + ", "
                + "userId=" + userId + ", "
                + "userName=" + userName
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Cause) {
            Cause that = (Cause) o;
            return ((this.clazz == null) ? (that.clazz() == null) : this.clazz.equals(that.clazz()))
                    && (this.shortDescription.equals(that.shortDescription()))
                    && ((this.userId == null) ? (that.userId() == null) : this.userId.equals(that.userId()))
                    && ((this.userName == null) ? (that.userName() == null) : this.userName.equals(that.userName()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (clazz == null) ? 0 : clazz.hashCode();
        h$ *= 1000003;
        h$ ^= shortDescription.hashCode();
        h$ *= 1000003;
        h$ ^= (userId == null) ? 0 : userId.hashCode();
        h$ *= 1000003;
        h$ ^= (userName == null) ? 0 : userName.hashCode();
        return h$;
    }

}
