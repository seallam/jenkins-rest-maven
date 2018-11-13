package com.cdancy.jenkins.rest;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:40
 */
import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.jclouds.View;
import org.jclouds.apis.ApiMetadata;
import org.jclouds.apis.Apis;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;

@Test(groups = "unit")
public abstract class BaseApiMetadataTest {

    protected final ApiMetadata toTest;
    protected final Set<TypeToken<? extends View>> views;

    public BaseApiMetadataTest(ApiMetadata toTest, Set<TypeToken<? extends View>> views) {
        this.toTest = toTest;
        this.views = views;
    }

    @Test
    public void testWithId() {
        ApiMetadata apiMetadata = Apis.withId(toTest.getId());

        assertEquals(toTest, apiMetadata);
    }

    // it is ok to have multiple services in the same classpath (ex. ec2 vs elb)
    @Test
    public void testTransformableToContains() {
        for (TypeToken<? extends View> view : views) {
            ImmutableSet<ApiMetadata> ofType = ImmutableSet.copyOf(Apis.viewableAs(view));
            assert ofType.contains(toTest) : String.format("%s not found in %s for %s", toTest, ofType,
                    view);
        }
    }

    @Test
    public void testAllContains() {
        ImmutableSet<ApiMetadata> all = ImmutableSet.copyOf(Apis.all());
        assert all.contains(toTest) : String.format("%s not found in %s", toTest, all);
    }

}
