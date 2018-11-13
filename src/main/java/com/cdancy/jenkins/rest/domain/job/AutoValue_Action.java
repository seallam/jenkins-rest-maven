package com.cdancy.jenkins.rest.domain.job;

import javax.annotation.Generated;
import java.util.List;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:47
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Action extends Action {

    private final List<Cause> causes;

    private final List<Parameter> parameters;

    AutoValue_Action(
            List<Cause> causes,
            List<Parameter> parameters) {
        if (causes == null) {
            throw new NullPointerException("Null causes");
        }
        this.causes = causes;
        if (parameters == null) {
            throw new NullPointerException("Null parameters");
        }
        this.parameters = parameters;
    }

    @Override
    public List<Cause> causes() {
        return causes;
    }

    @Override
    public List<Parameter> parameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Action{"
                + "causes=" + causes + ", "
                + "parameters=" + parameters
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Action) {
            Action that = (Action) o;
            return (this.causes.equals(that.causes()))
                    && (this.parameters.equals(that.parameters()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= causes.hashCode();
        h$ *= 1000003;
        h$ ^= parameters.hashCode();
        return h$;
    }

}