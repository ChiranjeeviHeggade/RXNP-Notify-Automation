package com.automation.mobile;

import com.automation.mobile.entities.CommandArgument;
import com.automation.mobile.helpers.TestRailHelper;
import com.automation.mobile.manager.ConfigFileManager;
import com.automation.mobile.services.testrail.APIException;
import com.automation.mobile.util.GlobalVar;
import io.cucumber.testng.CucumberOptions;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.*;

/*
@Author-Subhankar Das
@Usage-This class helps to initiate API Test execution
 */
public class APIRunner {

    @Test
    public void executeRunner() throws Exception {
        String testType = System.getProperty("testType", "parallel");
        System.out.println(testType);

        Map<String, List<String>> parsedArgument = parseCommandArgument();
        GlobalVar.DEVICE_LIST = generateAPIThreadList(parsedArgument);

        System.out.println(GlobalVar.DEVICE_LIST);

        int threadCount = GlobalVar.DEVICE_LIST.size();

        APITestNGGenerator testng = new APITestNGGenerator(testType, threadCount);
        try {
            testng.runTest();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private Map<String, List<String>> parseCommandArgument() {

        Map<String, List<String>> testParameters = new HashMap<String, List<String>>();
        if (null != System.getProperty(CommandArgument.BANNERS) && !System.getProperty(CommandArgument.BANNERS).isEmpty()) {
            if (System.getProperty(CommandArgument.BANNERS).contains(",")) {
                testParameters.put(CommandArgument.BANNERS,
                        Arrays.asList(System.getProperty(CommandArgument.BANNERS).split(",")));

            } else {
                testParameters.put(CommandArgument.BANNERS,
                        Arrays.asList(System.getProperty(CommandArgument.BANNERS)));
            }
            testParameters.put("environment", Arrays.asList(System.getProperty(CommandArgument.MOBILE_ENVIRONMENT)));
        } else {
            if (System.getenv(CommandArgument.BANNERS).contains(",")) {
                testParameters.put(CommandArgument.BANNERS,
                        Arrays.asList(System.getenv(CommandArgument.BANNER).split(",")));
            } else {
                testParameters.put(CommandArgument.BANNERS,
                        Arrays.asList(System.getenv(CommandArgument.BANNER)));
            }

            testParameters.put("environment", Arrays.asList(System.getenv(CommandArgument.ENVIRONMENT)));
        }

        System.out.println(testParameters);
        return testParameters;
    }

    public Map<String, Map<String, String>> generateAPIThreadList(Map<String, List<String>> inputParameters) throws IOException {
        Map<String, Map<String, String>> totalParameters = new HashMap<String, Map<String, String>>();
        List<String> banners = inputParameters.get("banner");
        String env = inputParameters.get("environment").get(0);
        for (int i = 0; i < banners.size(); i++)
        {
            String banner = banners.get(i);
            Map<String, String> deviceParam = new HashMap<>();
            deviceParam.putAll(new ConfigFileManager().getBannerPropertyMap(banner, env));
            deviceParam.put("banner", banner);
            deviceParam.put("env", env);
            deviceParam.put("STATE", "AVAILABLE");
            deviceParam.put("REGISTERUSER", "");
            totalParameters.put(banner, deviceParam);
        }
        return totalParameters;
    }

}

