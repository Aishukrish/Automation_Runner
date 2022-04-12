package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set property");
	}
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}
	@Test
	private void women() {
		System.out.println("Women");
	}
	

	@Test
	private void childer() {
		System.out.println("children");
	}
	@BeforeMethod
	private void signin() {
		System.out.println("Signin");
	}
	@AfterMethod
	private void signout() {
		System.out.println("Signout");
	}
	@AfterClass
	private void verify_Homepage() {
		System.out.println("Assert");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	@AfterSuite
	private void deleteAllCookies()
	{
		System.out.println("Delete All Cookies");
	}
}
