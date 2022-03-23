package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed1_page {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed1;

	public proceed1_page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed1() {
		return proceed1;
	} 

}
