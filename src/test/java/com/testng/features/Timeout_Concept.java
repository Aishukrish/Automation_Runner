package com.testng.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_Concept {
	@Test(timeOut = 12000)
	private void browser_launch() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Manjupriya pc\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
