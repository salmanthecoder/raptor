package com.raptor.util;

public class TestCaseConfig {

	private String testName;
	private Boolean proxy;
	private String browser;

	public TestCaseConfig() {
	}

	public TestCaseConfig(String testName, Boolean proxy, String browser) {
		this.testName = testName;
		this.proxy = proxy;
		this.browser = browser;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the proxy
	 */
	public Boolean getProxy() {
		return proxy;
	}

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(Boolean proxy) {
		this.proxy = proxy;
	}

	/**
	 * @return the browser
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * @param browser the browser to set
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}

}
