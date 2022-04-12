package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider = "test_Data")
	private void adactin_Runner(String username,int password) {
		System.out.println("Username  :"+username);
		System.out.println("Password  :"+password);
	}
	@DataProvider
	private Object[][] test_Data()
	{
		return new Object[][]
				{
					{"Shalu",123},
					{"Navin",8798},
					{"Ramya",845}
				};
	}
}
