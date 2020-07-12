package com.raptor.util;

import net.minidev.json.JSONArray;

public class JsonTestCase {
	public JsonTestCase() {
	}

	private TestCaseConfig testCaseConfig;

	private JSONArray testSteps;

	/**
	 * @return the testCaseConfig
	 */
	public TestCaseConfig getTestCaseConfig() {
		return testCaseConfig;
	}

	/**
	 * @param testCaseConfig the testCaseConfig to set
	 */
	public void setTestCaseConfig(TestCaseConfig testCaseConfig) {
		this.testCaseConfig = testCaseConfig;
	}

	/**
	 * @return the testSteps
	 */
	public JSONArray getTestSteps() {
		return testSteps;
	}

	/**
	 * @param testSteps the testSteps to set
	 */
	public void setTestSteps(JSONArray testSteps) {
		this.testSteps = testSteps;
	}

	public JsonTestCase(TestCaseConfig testCaseConfig, JSONArray testSteps) {
		this.testCaseConfig = testCaseConfig;
		this.testSteps = testSteps;
	}

}
