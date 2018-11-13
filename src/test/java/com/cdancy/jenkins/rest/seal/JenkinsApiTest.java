package com.cdancy.jenkins.rest.seal;

import com.alibaba.fastjson.JSONObject;
import com.cdancy.jenkins.rest.BaseJenkinsApiLiveTest;
import com.cdancy.jenkins.rest.JenkinsClient;
import com.cdancy.jenkins.rest.domain.common.IntegerResponse;
import com.cdancy.jenkins.rest.domain.common.RequestStatus;
import com.cdancy.jenkins.rest.domain.job.JobInfo;
import com.cdancy.jenkins.rest.domain.system.SystemInfo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author: seal
 * @Description:
 * @company: xingfeiinc
 * @e-mail: linxiao@xingfeiinc.com
 * @date: 2018-10-29 16:56
 */
public class JenkinsApiTest extends BaseJenkinsApiLiveTest {

    private JenkinsClient client;

    @Test
    public void test() {
        System.out.println(123);
    }

    @BeforeClass
    public void init() {
        client = JenkinsClient.builder()
                .endPoint("http://127.0.0.1:8090") // Optional. Defaults to http://127.0.0.1:8080
                .credentials("linxiao:123456") // Optional.
                .build();
    }

    @Test
    public void basicTest() {
        JenkinsClient client = JenkinsClient.builder()
                .endPoint("http://127.0.0.1:8090") // Optional. Defaults to http://127.0.0.1:8080
                .credentials("linxiao:123456") // Optional.
                .build();

        SystemInfo systemInfo = client.api().systemApi().systemInfo();
        System.out.println(JSONObject.toJSONString(systemInfo));
    }

    @Test
    public void createJobTest() {
        String config = payloadFromResource("/freestyle-project-no-params.xml");
        RequestStatus success = client.api().jobsApi().create(null, "DevTest", config);
        System.out.println(JSONObject.toJSONString(success));
    }

    @Test
    public void getJobTest() {
        JobInfo jobInfo = client.api().jobsApi().jobInfo(null, "DevTest");
        System.out.println(jobInfo);
    }

    @Test
    public void executeTest() {
        IntegerResponse response = client.api().jobsApi().build(null, "job1");
        System.out.println(JSONObject.toJSONString(response));
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.api().jobsApi().stop(null, "job1", 5);
    }
}
