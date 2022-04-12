package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Category {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	public Select_Category(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getColor() {
		return color;
	}

	@FindBy(xpath="//a[@id='color_16']")
	private WebElement color;

}
