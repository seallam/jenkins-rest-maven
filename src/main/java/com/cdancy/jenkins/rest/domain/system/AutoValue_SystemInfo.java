package com.cdancy.jenkins.rest.domain.system;

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
final class AutoValue_SystemInfo extends SystemInfo {

    private final List<Error> errors;

    private final String hudsonVersion;

    private final String jenkinsVersion;

    private final String jenkinsSession;

    private final String instanceIdentity;

    private final String sshEndpoint;

    private final String server;

    AutoValue_SystemInfo(
            List<Error> errors,
            String hudsonVersion,
            String jenkinsVersion,
            String jenkinsSession,
            String instanceIdentity,
            @Nullable String sshEndpoint,
            String server) {
        if (errors == null) {
            throw new NullPointerException("Null errors");
        }
        this.errors = errors;
        if (hudsonVersion == null) {
            throw new NullPointerException("Null hudsonVersion");
        }
        this.hudsonVersion = hudsonVersion;
        if (jenkinsVersion == null) {
            throw new NullPointerException("Null jenkinsVersion");
        }
        this.jenkinsVersion = jenkinsVersion;
        if (jenkinsSession == null) {
            throw new NullPointerException("Null jenkinsSession");
        }
        this.jenkinsSession = jenkinsSession;
        if (instanceIdentity == null) {
            throw new NullPointerException("Null instanceIdentity");
        }
        this.instanceIdentity = instanceIdentity;
        this.sshEndpoint = sshEndpoint;
        if (server == null) {
            throw new NullPointerException("Null server");
        }
        this.server = server;
    }

    @Override
    public List<Error> errors() {
        return errors;
    }

    @Override
    public String hudsonVersion() {
        return hudsonVersion;
    }

    @Override
    public String jenkinsVersion() {
        return jenkinsVersion;
    }

    @Override
    public String jenkinsSession() {
        return jenkinsSession;
    }

    @Override
    public String instanceIdentity() {
        return instanceIdentity;
    }

    @Nullable
    @Override
    public String sshEndpoint() {
        return sshEndpoint;
    }

    @Override
    public String server() {
        return server;
    }

    @Override
    public String toString() {
        return "SystemInfo{"
                + "errors=" + errors + ", "
                + "hudsonVersion=" + hudsonVersion + ", "
                + "jenkinsVersion=" + jenkinsVersion + ", "
                + "jenkinsSession=" + jenkinsSession + ", "
                + "instanceIdentity=" + instanceIdentity + ", "
                + "sshEndpoint=" + sshEndpoint + ", "
                + "server=" + server
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof SystemInfo) {
            SystemInfo that = (SystemInfo) o;
            return (this.errors.equals(that.errors()))
                    && (this.hudsonVersion.equals(that.hudsonVersion()))
                    && (this.jenkinsVersion.equals(that.jenkinsVersion()))
                    && (this.jenkinsSession.equals(that.jenkinsSession()))
                    && (this.instanceIdentity.equals(that.instanceIdentity()))
                    && ((this.sshEndpoint == null) ? (that.sshEndpoint() == null) : this.sshEndpoint.equals(that.sshEndpoint()))
                    && (this.server.equals(that.server()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= errors.hashCode();
        h$ *= 1000003;
        h$ ^= hudsonVersion.hashCode();
        h$ *= 1000003;
        h$ ^= jenkinsVersion.hashCode();
        h$ *= 1000003;
        h$ ^= jenkinsSession.hashCode();
        h$ *= 1000003;
        h$ ^= instanceIdentity.hashCode();
        h$ *= 1000003;
        h$ ^= (sshEndpoint == null) ? 0 : sshEndpoint.hashCode();
        h$ *= 1000003;
        h$ ^= server.hashCode();
        return h$;
    }

}

