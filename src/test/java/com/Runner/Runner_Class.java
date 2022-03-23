package com.Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base.Base_Class;
import com.helper.Page_object_Manager_Adactin;

public class Runner_Class extends Base_Class{
	public static WebDriver driver=browser_Configuration("chrome");//---->null
	public static Page_object_Manager_Adactin pom1= new Page_object_Manager_Adactin(driver);
	public static Logger Log= Logger.getLogger(Runner_Class.class);
	
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		getUrl("https://adactin.com/HotelApp/index.php");
		Log.info("Adactin Page Launch");
		
		//home_page
		inputValueElement(pom1.get_instance_Hp().getUsername(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 1, 5));
		inputValueElement(pom1.get_instance_Hp().getPassword(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 2, 5));
		clickOnElement(pom1.get_instance_Hp().getLogin_btn());
		Log.info("Sign_in Successfully");
		
		//search hotel
		
		dropdown("byText",pom1.get_instance_Hs().getLocation(), "London");
		dropdown("byText", pom1.get_instance_Hs().getHotel(),"Hotel Sunshine");
		dropdown("byValue", pom1.get_instance_Hs().getRoom(), "Super Deluxe");
		dropdown("byIndex", pom1.get_instance_Hs().getNo(), "2");
		dropdown("byText", pom1.get_instance_Hs().getAdult(), "2 - Two");
		dropdown("byIndex", pom1.get_instance_Hs().getChild(),"0");
		clickOnElement(pom1.get_instance_Hs().getSearch());
		Log.info("Hotel Searched");
		
		//select Hotel
		clickOnElement(pom1.get_instance_Hs1().getSel());
		clickOnElement(pom1.get_instance_Hs1().getCon());
		Log.info("Hotel Selected");
		
		//booking details
		inputValueElement(pom1.get_instance_Bp().getFname(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 15, 5));
		inputValueElement(pom1.get_instance_Bp().getLname(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 16, 5));
	    inputValueElement(pom1.get_instance_Bp().getAddress(),particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 17, 5));	
	    inputValueElement(pom1.get_instance_Bp().getCard(),particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 18, 5));
	    dropdown("byText", pom1.get_instance_Bp().getType(), "Master Card");
	    dropdown("byIndex", pom1.get_instance_Bp().getExpiry(), "10");
	    dropdown("byValue",pom1.get_instance_Bp().getYear(), "2022");
	    inputValueElement(pom1.get_instance_Bp().getCvv(), particular_Cell_data("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\Test_cases\\Adacin Test Case1.xlsx", 22, 5));
	    clickOnElement(pom1.get_instance_Bp().getBook());
	    Log.info("Hotel Booked");
	    close();
	  
		

			  
	}
	

}
