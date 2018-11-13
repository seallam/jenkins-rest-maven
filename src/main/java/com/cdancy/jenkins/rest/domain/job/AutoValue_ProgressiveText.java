package com.cdancy.jenkins.rest.domain.job;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:54
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ProgressiveText extends ProgressiveText {

    private final String text;

    private final int size;

    private final boolean hasMoreData;

    AutoValue_ProgressiveText(
            String text,
            int size,
            boolean hasMoreData) {
        if (text == null) {
            throw new NullPointerException("Null text");
        }
        this.text = text;
        this.size = size;
        this.hasMoreData = hasMoreData;
    }

    @Override
    public String text() {
        return text;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean hasMoreData() {
        return hasMoreData;
    }

    @Override
    public String toString() {
        return "ProgressiveText{"
                + "text=" + text + ", "
                + "size=" + size + ", "
                + "hasMoreData=" + hasMoreData
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ProgressiveText) {
            ProgressiveText that = (ProgressiveText) o;
            return (this.text.equals(that.text()))
                    && (this.size == that.size())
                    && (this.hasMoreData == that.hasMoreData());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= text.hashCode();
        h$ *= 1000003;
        h$ ^= size;
        h$ *= 1000003;
        h$ ^= hasMoreData ? 1231 : 1237;
        return h$;
    }

}


