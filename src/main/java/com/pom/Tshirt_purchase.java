package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_purchase {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	WebElement tshirt;
	
	@FindBy(xpath="//a[@id='color_1']")
	WebElement color;
	
	public WebElement getColor() {
		return color;
	}
	public Tshirt_purchase(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getTshirt() {
		return tshirt;
	}
	

}
