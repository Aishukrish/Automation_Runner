package com.testng.features;

import org.testng.annotations.Test;

public class Groups_Concept {
	@Test(priority = -1,groups  ="women" )
	private void saree() {
		System.out.println("Purchase saree");
	}
	@Test( priority = 0,  groups ="women" )
	private void kurta()
	{
		System.out.println("Purchse kurta");
	}
	@Test(priority = 1,	groups ="women" )
	private void lehanga() {
		System.out.println("Purchase Lehanga");
	}
	@Test(priority = -2,groups = "men")
	private void tshirt() {
		System.out.println("Purchase T-Shirt");
	}
	@Test(priority = 2,	groups = "men")
	private void jeans() {
		System.out.println("Purchase Jeans");
	}
	@Test
	private void towel() {
		System.out.println("Purchase towel");
	}


}
