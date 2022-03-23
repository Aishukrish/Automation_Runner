package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_address {
	public WebDriver driver;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proceed2;
	public proceed_address(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed2() {
		return proceed2;
	}
	
}
