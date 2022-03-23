package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_page {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@rel='nofollow'])[6]")
	private WebElement proceed;

	public proceed_page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed() {
		return proceed;
	}

}
