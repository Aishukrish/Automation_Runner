package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class submit_page {
	public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	public submit_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
