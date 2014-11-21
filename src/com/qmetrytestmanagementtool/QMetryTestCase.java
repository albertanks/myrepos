package com.qmetrytestmanagementtool;

import org.testng.annotations.Test;

import com.infostretch.automation.integration.qmetry.QmetryTestCase;
import com.infostretch.automation.ui.WebDriverTestCase;

public class QMetryTestCase extends WebDriverTestCase {

	@QmetryTestCase(TC_ID="197112")
	@Test(description = "test")
	public void test() {
		//TODO: call test steps
		System.out.println("TC 12345");
	}

}
