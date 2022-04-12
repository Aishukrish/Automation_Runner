package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	@Test(priority = -1)
	private void username() {
		String expected_Username="aishu3";
		String actual_Username="aishu3";
		Assert.assertEquals(actual_Username, expected_Username);
		System.out.println("Assert Validation");
	}
	@Test
	private void password() {
		String expected_password="aishu3";
		String actual_password="aishu";
		Assert.assertNotEquals(actual_password, expected_password);
		System.out.println("Assert Validation");
	}
	@Test(priority = 1)
	private void result() {
		String expected_page="login";
		String actual_page="home";
		SoftAssert soft=new SoftAssert();
		soft.assertNotEquals(actual_page, expected_page);
		System.out.println("Assert Verification");
	}

}
