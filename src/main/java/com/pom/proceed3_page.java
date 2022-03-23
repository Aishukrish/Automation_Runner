package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed3_page {
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceed3;

	public proceed3_page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	
}
