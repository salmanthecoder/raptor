package com.raptor;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

import java.io.IOException;
import java.net.MalformedURLException;

@TestPropertySource(locations="classpath:application-test.properties")
@PropertySource(value = "classpath:application.properties",ignoreResourceNotFound = true)
public abstract class RaptorBase {
    public static void initiateReporting(String name) {
        TestExecution.initiateReporting(name);
    }

    public static void closeReporting() {
        TestExecution.closeReporting();
    }

    public WebDriver getBrowser(String testFileName) throws MalformedURLException {
        return TestExecution.createBrowser(testFileName);
    }

    public void runRaptorScript(String testFileName, String testName) throws IOException {
        TestExecution.runScript(testFileName,testName);
    }


}
