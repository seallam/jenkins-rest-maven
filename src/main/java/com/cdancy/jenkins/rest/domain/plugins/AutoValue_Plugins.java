package com.cdancy.jenkins.rest.domain.plugins;

import com.cdancy.jenkins.rest.domain.common.Error;
import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;
import java.util.List;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:13
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Plugins extends Plugins {

    private final List<Error> errors;

    private final String clazz;

    private final List<Plugin> plugins;

    AutoValue_Plugins(
            List<Error> errors,
            @Nullable String clazz,
            List<Plugin> plugins) {
        if (errors == null) {
            throw new NullPointerException("Null errors");
        }
        this.errors = errors;
        this.clazz = clazz;
        if (plugins == null) {
            throw new NullPointerException("Null plugins");
        }
        this.plugins = plugins;
    }

    @Override
    public List<Error> errors() {
        return errors;
    }

    @Nullable
    @Override
    public String clazz() {
        return clazz;
    }

    @Override
    public List<Plugin> plugins() {
        return plugins;
    }

    @Override
    public String toString() {
        return "Plugins{"
                + "errors=" + errors + ", "
                + "clazz=" + clazz + ", "
                + "plugins=" + plugins
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Plugins) {
            Plugins that = (Plugins) o;
            return (this.errors.equals(that.errors()))
                    && ((this.clazz == null) ? (that.clazz() == null) : this.clazz.equals(that.clazz()))
                    && (this.plugins.equals(that.plugins()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= errors.hashCode();
        h$ *= 1000003;
        h$ ^= (clazz == null) ? 0 : clazz.hashCode();
        h$ *= 1000003;
        h$ ^= plugins.hashCode();
        return h$;
    }

}
