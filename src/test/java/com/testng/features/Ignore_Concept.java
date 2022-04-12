package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test(priority = -1)
	private void saree() {
		System.out.println("Purchase saree");
	}
	@Test(priority = 0)
	private void kurta() {
		System.out.println("Purchse kurta");
	}
	@Test(priority = 1)
	private void lehanga() {
		System.out.println("Purchase Lehanga");
	}
	@Ignore
	@Test
	private void tshirt() {
		System.out.println("Purchase T-Shirt");
	}
	@Test()
	private void jeans() {
		System.out.println("Purchase Jeans");
	}
	@Test(enabled = false)
	private void towel() {
		System.out.println("Purchase towel");
	}

}
