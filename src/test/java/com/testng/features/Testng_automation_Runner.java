package com.testng.features;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Configuration.helper.File_Reader_Manager1;
import com.Runner.Automation_runner;
import com.base.Base_Class;
import com.helper.Page_Object_Manager;

public class Testng_automation_Runner extends Base_Class{
	public static WebDriver driver=browser_Configuration("chrome");
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	public static Logger Log= Logger.getLogger(Automation_runner.class);
	@BeforeClass
	private void logger_implementation() {
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@BeforeMethod
	private void login() throws Throwable {
		String url=File_Reader_Manager1.get_Instance_frm1().get_Instance_CR1().get_Config_Url();
		getUrl(url);
		clickOnElement(pom.get_instance_hp1().getSignin());
		Log.info("Automation page Launch");
		
		inputValueElement( pom.get_instance_lp().getEmail(), File_Reader_Manager1.get_Instance_frm1().get_Instance_CR1().get_Config_email());
		inputValueElement(pom.get_instance_lp().getPassword(),File_Reader_Manager1.get_Instance_frm1().get_Instance_CR1().get_Config_Password());
		clickOnElement(pom.get_instance_lp().getLogin());
		Log.info("Automation Sign_in");
		


	}
	@Test(priority = -1)
	private void womens_category() throws Throwable {
		clickOnElement(pom.get_instance_Dp().getDress());
		sleep(3000);
		clickOnElement(pom.get_instance_Dp().getColor());
		clickOnElement(pom.get_instance_Dp().getCart());
		Log.info("Women category Dress Selected");
		sleep(6000);
		clickOnElement(pom.get_instance_Pg().getProceed());
		clickOnElement(pom.get_instance_Pg1().getProceed1());
		clickOnElement(pom.get_instance_Pa().getProceed2());
		clickOnElement(pom.get_instance_Pg3().getTerms());
		clickOnElement(pom.get_instance_Pg3().getProceed3());
		clickOnElement(pom.get_instance_Pp().getPayment());
		clickOnElement(pom.get_instance_Sp().getSubmit());
		Log.info("Dress Purchased");
		
	}
	@AfterMethod
	private void sign_out() {
		clickOnElement(pom.get_instance_So().getSignout());
		Log.info("Sign_Out successfully");
		
	}
	
	
	@Test(priority = 0)
	private void dresses_category() throws Throwable
	{
		clickOnElement(pom.get_instance_Sc().getDresses());
		clickOnElement(pom.get_instance_Sc().getColor());
		clickOnElement(pom.get_instance_Dp().getCart());
		Log.info("Dresses Category Selected");
		sleep(5000);
		clickOnElement(pom.get_instance_Pg().getProceed());
		clickOnElement(pom.get_instance_Pg1().getProceed1());
		clickOnElement(pom.get_instance_Pa().getProceed2());
		clickOnElement(pom.get_instance_Pg3().getTerms());
		clickOnElement(pom.get_instance_Pg3().getProceed3());
		clickOnElement(pom.get_instance_Pp().getPayment());
		clickOnElement(pom.get_instance_Sp().getSubmit());
		Log.info("Dress Purchased");
		

			
	}
	@Test(priority = 1)
	private void tshirt_category() throws Throwable {
		clickOnElement(pom.get_instance_ts().getTshirt());
		clickOnElement(pom.get_instance_ts().getColor());
		clickOnElement(pom.get_instance_Dp().getCart());
		Log.info("tshirt category dress Selected");
		sleep(4000);
		clickOnElement(pom.get_instance_Pg().getProceed());
		clickOnElement(pom.get_instance_Pg1().getProceed1());
		clickOnElement(pom.get_instance_Pa().getProceed2());
		clickOnElement(pom.get_instance_Pg3().getTerms());
		clickOnElement(pom.get_instance_Pg3().getProceed3());
		clickOnElement(pom.get_instance_Pp().getPayment());
		clickOnElement(pom.get_instance_Sp().getSubmit());
		Log.info("Dress Purchased");
		
		
	}
	
	
	

}
