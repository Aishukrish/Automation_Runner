package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement dress;
	
	@FindBy(className="color_pick")
	private WebElement color;
	@FindBy(linkText="Add to cart")
	private WebElement cart;

	public Dress_page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDress() {
		return dress;
	}
	public WebElement getColor() {
		return color;
	}
	public WebElement getCart() {
		return cart;
	}
	
}
