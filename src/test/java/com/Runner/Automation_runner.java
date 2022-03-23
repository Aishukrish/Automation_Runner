package com.Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base.Base_Class;
import com.helper.Page_Object_Manager;

public class Automation_runner extends Base_Class {
	public static WebDriver driver=browser_Configuration("chrome");
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	public static Logger Log= Logger.getLogger(Automation_runner.class);

	public static void main(String[] args) throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
	getUrl("http://automationpractice.com/index.php");
	clickOnElement(pom.get_instance_hp1().getSignin());
	Log.info("Automation page Launch");
	
	//login_page
	inputValueElement( pom.get_instance_lp().getEmail(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Automation test cases.xlsx", 2, 5));
	inputValueElement(pom.get_instance_lp().getPassword(),particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Automation test cases.xlsx", 8, 5));
	clickOnElement(pom.get_instance_lp().getLogin());
	Log.info("Automation Sign_in");
	
	//Dress_page
	clickOnElement(pom.get_instance_Dp().getDress());
	sleep(3000);
	clickOnElement(pom.get_instance_Dp().getColor());
	clickOnElement(pom.get_instance_Dp().getCart());
	Log.info("Dress Selected");
	
	sleep(3000);
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
