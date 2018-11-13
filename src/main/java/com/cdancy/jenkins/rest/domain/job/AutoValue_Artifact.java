package com.cdancy.jenkins.rest.domain.job;

import javax.annotation.Generated;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 17:09
 */
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Artifact extends Artifact {

    private final String displayPath;

    private final String fileName;

    private final String relativePath;

    AutoValue_Artifact(
            String displayPath,
            String fileName,
            String relativePath) {
        if (displayPath == null) {
            throw new NullPointerException("Null displayPath");
        }
        this.displayPath = displayPath;
        if (fileName == null) {
            throw new NullPointerException("Null fileName");
        }
        this.fileName = fileName;
        if (relativePath == null) {
            throw new NullPointerException("Null relativePath");
        }
        this.relativePath = relativePath;
    }

    @Override
    public String displayPath() {
        return displayPath;
    }

    @Override
    public String fileName() {
        return fileName;
    }

    @Override
    public String relativePath() {
        return relativePath;
    }

    @Override
    public String toString() {
        return "Artifact{"
                + "displayPath=" + displayPath + ", "
                + "fileName=" + fileName + ", "
                + "relativePath=" + relativePath
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Artifact) {
            Artifact that = (Artifact) o;
            return (this.displayPath.equals(that.displayPath()))
                    && (this.fileName.equals(that.fileName()))
                    && (this.relativePath.equals(that.relativePath()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= displayPath.hashCode();
        h$ *= 1000003;
        h$ ^= fileName.hashCode();
        h$ *= 1000003;
        h$ ^= relativePath.hashCode();
        return h$;
    }

}

