package com.sd;

import org.openqa.selenium.WebDriver;

import com.Configuration.helper.File_Reader_Manager;
import com.base.Base_Class;
import com.helper.Page_object_Manager_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends Base_Class{
	public static WebDriver driver=com.adactin.runner.Test_Runner.driver;
	Page_object_Manager_Adactin pom= new Page_object_Manager_Adactin(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("https://www.google.com/");
		String url=File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_Url();
		getUrl(url);
		
	}
  
	@When("^user Enter the Username In Username Field$")
	public void user_Enter_the_Username_In_Username_Field() throws Throwable {
		inputValueElement(pom.get_instance_Hp().getUsername(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_username());
	}

	@When("^user Enter the Password in Password Field$")
	public void user_Enter_the_Password_in_Password_Field() throws Throwable {
		inputValueElement(pom.get_instance_Hp().getPassword(),File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_Password());
		
	}

	@Then("^user Click on the Login Button And it Navigates to the Search Hotel Page$")
	public void user_Click_on_the_Login_Button_And_it_Navigates_to_the_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hp().getLogin_btn());
	}

	@When("^user Enter the Hotel Location$")
	public void user_Enter_the_Hotel_Location() throws Throwable {
		dropdown("byText",pom.get_instance_Hs().getLocation(), "London");
	}

	@When("^user Select the Hotel$")
	public void user_Select_the_Hotel() throws Throwable {
		dropdown("byText", pom.get_instance_Hs().getHotel(),"Hotel Sunshine");
	}

	@When("^user Select the Room type$")
	public void user_Select_the_Room_type() throws Throwable {
		dropdown("byValue", pom.get_instance_Hs().getRoom(), "Super Deluxe");
	}

	@When("^user Select the Number of Rooms$")
	public void user_Select_the_Number_of_Rooms() throws Throwable {
		dropdown("byIndex", pom.get_instance_Hs().getNo(), "2");
	}

	@When("^user Select the Number of Adults$")
	public void user_Select_the_Number_of_Adults() throws Throwable {
		dropdown("byText", pom.get_instance_Hs().getAdult(), "2 - Two");
	}

	@When("^user Select the Number of Childrens$")
	public void user_Select_the_Number_of_Childrens() throws Throwable {
		dropdown("byIndex", pom.get_instance_Hs().getChild(),"0");

	}

	@Then("^user click on the Search button And it Navigates to the Select Hotel Page$")
	public void user_click_on_the_Search_button_And_it_Navigates_to_the_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hs().getSearch());	
	}

	@When("^user Click on the Continue button And it Navigates to the Book a Hotel Page$")
	public void user_Click_on_the_Continue_button_And_it_Navigates_to_the_Book_a_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hs1().getSel());
		clickOnElement(pom.get_instance_Hs1().getCon());
	}

	@When("^user Enter the Firstname in Firstname Field$")
	public void user_Enter_the_Firstname_in_Firstname_Field() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getFname(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_firstname());

	}

	@When("^user Enter the Lastname in Lastname Field$")
	public void user_Enter_the_Lastname_in_Lastname_Field() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getLname(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_lastname());

	}

	@When("^user Enter the Address in Address Field$")
	public void user_Enter_the_Address_in_Address_Field() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getAddress(),File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_address());
	}

	@When("^user Enter the CC Number in CC Number Field$")
	public void user_Enter_the_CC_Number_in_CC_Number_Field() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getCard(),File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_ccnum());
	}

	@When("^user Enter the CC card Type$")
	public void user_Enter_the_CC_card_Type() throws Throwable {
		dropdown("byText", pom.get_instance_Bp().getType(), "Master Card");
	}

	@When("^user Select the CC card expiry month and Year$")
	public void user_Select_the_CC_card_expiry_month_and_Year() throws Throwable {
		dropdown("byIndex", pom.get_instance_Bp().getExpiry(), "10");
		dropdown("byValue",pom.get_instance_Bp().getYear(), "2022");
	}

	@When("^user Enter the CCV number in CCV number field$")
	public void user_Enter_the_CCV_number_in_CCV_number_field() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getCvv(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_cvv());
	}

	@Then("^user click on the Book Now button And it navigates to the Booking Confirmation Page$")
	public void user_click_on_the_Book_Now_button_And_it_navigates_to_the_Booking_Confirmation_Page() throws Throwable {
		
		clickOnElement(pom.get_instance_Bp().getBook());   
	}

	@When("^user click on the My Itinerary Button and it navigates to Booked Itinerary Page$")
	public void user_click_on_the_My_Itinerary_Button_and_it_navigates_to_Booked_Itinerary_Page() throws Throwable {
	}

	
	
	
	
	
	
	
	
	

	
		    	
    
    
    
    
     
    //clickOnElement(pom1.get_instance_lo().getLogout());


}
