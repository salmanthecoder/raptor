package com.raptor.test;

import com.raptor.util.ReadJSON;
import com.raptor.util.TestStepsUtil;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;



@SpringBootTest
class TestApplicationTests {
	public static WebDriver browser;

	@Test
	void contextLoads() {
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
	}

	@Test
	public void testCTScan() throws InterruptedException {
		JSONArray testScript = ReadJSON.readTestScript("src/test/java/com/raptor/util/testScript-alodokter-ct-scan.json");
		browser.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)browser;
		System.out.println(testScript);
		// loop through all the setps from the json test script
		testScript.forEach( script -> {
			JSONObject scriptObject = (JSONObject) script;
			TestStepsUtil.executeTestBasedOnAction(js , scriptObject);
		} );

		browser.close();

	}

	@Test
	public void testMRIScan() throws InterruptedException {
		JSONArray testScript = ReadJSON.readTestScript("src/test/java/com/raptor/util/testScript-alodokter-mri-scan.json");
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor)browser;
		System.out.println(testScript);
		// loop through all the setps from the json test script
		testScript.forEach( script -> {
			JSONObject scriptObject = (JSONObject) script;
			TestStepsUtil.executeTestBasedOnAction(js , scriptObject);
		} );
		browser.close();

	}

}
