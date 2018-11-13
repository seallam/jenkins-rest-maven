package com.cdancy.jenkins.rest.domain.plugins;

import org.jclouds.javax.annotation.Nullable;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:12
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Plugin extends Plugin {

    private final Boolean active;

    private final String backupVersion;

    private final Boolean bundled;

    private final Boolean deleted;

    private final Boolean downgradable;

    private final Boolean enabled;

    private final Boolean hasUpdate;

    private final String longName;

    private final Boolean pinned;

    private final String requiredCoreVersion;

    private final String shortName;

    private final String supportsDynamicLoad;

    private final String url;

    private final String version;

    AutoValue_Plugin(
            @Nullable Boolean active,
            @Nullable String backupVersion,
            @Nullable Boolean bundled,
            @Nullable Boolean deleted,
            @Nullable Boolean downgradable,
            @Nullable Boolean enabled,
            @Nullable Boolean hasUpdate,
            @Nullable String longName,
            @Nullable Boolean pinned,
            @Nullable String requiredCoreVersion,
            @Nullable String shortName,
            @Nullable String supportsDynamicLoad,
            @Nullable String url,
            @Nullable String version) {
        this.active = active;
        this.backupVersion = backupVersion;
        this.bundled = bundled;
        this.deleted = deleted;
        this.downgradable = downgradable;
        this.enabled = enabled;
        this.hasUpdate = hasUpdate;
        this.longName = longName;
        this.pinned = pinned;
        this.requiredCoreVersion = requiredCoreVersion;
        this.shortName = shortName;
        this.supportsDynamicLoad = supportsDynamicLoad;
        this.url = url;
        this.version = version;
    }

    @Nullable
    @Override
    public Boolean active() {
        return active;
    }

    @Nullable
    @Override
    public String backupVersion() {
        return backupVersion;
    }

    @Nullable
    @Override
    public Boolean bundled() {
        return bundled;
    }

    @Nullable
    @Override
    public Boolean deleted() {
        return deleted;
    }

    @Nullable
    @Override
    public Boolean downgradable() {
        return downgradable;
    }

    @Nullable
    @Override
    public Boolean enabled() {
        return enabled;
    }

    @Nullable
    @Override
    public Boolean hasUpdate() {
        return hasUpdate;
    }

    @Nullable
    @Override
    public String longName() {
        return longName;
    }

    @Nullable
    @Override
    public Boolean pinned() {
        return pinned;
    }

    @Nullable
    @Override
    public String requiredCoreVersion() {
        return requiredCoreVersion;
    }

    @Nullable
    @Override
    public String shortName() {
        return shortName;
    }

    @Nullable
    @Override
    public String supportsDynamicLoad() {
        return supportsDynamicLoad;
    }

    @Nullable
    @Override
    public String url() {
        return url;
    }

    @Nullable
    @Override
    public String version() {
        return version;
    }

    @Override
    public String toString() {
        return "Plugin{"
                + "active=" + active + ", "
                + "backupVersion=" + backupVersion + ", "
                + "bundled=" + bundled + ", "
                + "deleted=" + deleted + ", "
                + "downgradable=" + downgradable + ", "
                + "enabled=" + enabled + ", "
                + "hasUpdate=" + hasUpdate + ", "
                + "longName=" + longName + ", "
                + "pinned=" + pinned + ", "
                + "requiredCoreVersion=" + requiredCoreVersion + ", "
                + "shortName=" + shortName + ", "
                + "supportsDynamicLoad=" + supportsDynamicLoad + ", "
                + "url=" + url + ", "
                + "version=" + version
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Plugin) {
            Plugin that = (Plugin) o;
            return ((this.active == null) ? (that.active() == null) : this.active.equals(that.active()))
                    && ((this.backupVersion == null) ? (that.backupVersion() == null) : this.backupVersion.equals(that.backupVersion()))
                    && ((this.bundled == null) ? (that.bundled() == null) : this.bundled.equals(that.bundled()))
                    && ((this.deleted == null) ? (that.deleted() == null) : this.deleted.equals(that.deleted()))
                    && ((this.downgradable == null) ? (that.downgradable() == null) : this.downgradable.equals(that.downgradable()))
                    && ((this.enabled == null) ? (that.enabled() == null) : this.enabled.equals(that.enabled()))
                    && ((this.hasUpdate == null) ? (that.hasUpdate() == null) : this.hasUpdate.equals(that.hasUpdate()))
                    && ((this.longName == null) ? (that.longName() == null) : this.longName.equals(that.longName()))
                    && ((this.pinned == null) ? (that.pinned() == null) : this.pinned.equals(that.pinned()))
                    && ((this.requiredCoreVersion == null) ? (that.requiredCoreVersion() == null) : this.requiredCoreVersion.equals(that.requiredCoreVersion()))
                    && ((this.shortName == null) ? (that.shortName() == null) : this.shortName.equals(that.shortName()))
                    && ((this.supportsDynamicLoad == null) ? (that.supportsDynamicLoad() == null) : this.supportsDynamicLoad.equals(that.supportsDynamicLoad()))
                    && ((this.url == null) ? (that.url() == null) : this.url.equals(that.url()))
                    && ((this.version == null) ? (that.version() == null) : this.version.equals(that.version()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (active == null) ? 0 : active.hashCode();
        h$ *= 1000003;
        h$ ^= (backupVersion == null) ? 0 : backupVersion.hashCode();
        h$ *= 1000003;
        h$ ^= (bundled == null) ? 0 : bundled.hashCode();
        h$ *= 1000003;
        h$ ^= (deleted == null) ? 0 : deleted.hashCode();
        h$ *= 1000003;
        h$ ^= (downgradable == null) ? 0 : downgradable.hashCode();
        h$ *= 1000003;
        h$ ^= (enabled == null) ? 0 : enabled.hashCode();
        h$ *= 1000003;
        h$ ^= (hasUpdate == null) ? 0 : hasUpdate.hashCode();
        h$ *= 1000003;
        h$ ^= (longName == null) ? 0 : longName.hashCode();
        h$ *= 1000003;
        h$ ^= (pinned == null) ? 0 : pinned.hashCode();
        h$ *= 1000003;
        h$ ^= (requiredCoreVersion == null) ? 0 : requiredCoreVersion.hashCode();
        h$ *= 1000003;
        h$ ^= (shortName == null) ? 0 : shortName.hashCode();
        h$ *= 1000003;
        h$ ^= (supportsDynamicLoad == null) ? 0 : supportsDynamicLoad.hashCode();
        h$ *= 1000003;
        h$ ^= (url == null) ? 0 : url.hashCode();
        h$ *= 1000003;
        h$ ^= (version == null) ? 0 : version.hashCode();
        return h$;
    }

}

