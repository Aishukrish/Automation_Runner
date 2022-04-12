package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Manjupriya pc\\eclipse-workspace\\Cucumber_Adactin_Page\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
		glue ="com.sd",
		plugin="html:Cucumber_Reports/rep"
		)
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
		driver=Base_Class.browser_Configuration("chrome");
		System.out.println("Launch");
	}
	@AfterClass
	public static void tear_Down() {
		driver.quit();
		System.out.println("Close");
	}
}
