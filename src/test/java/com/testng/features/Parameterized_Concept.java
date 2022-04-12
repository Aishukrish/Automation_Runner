package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("aishu")String username,String password) {
		System.out.println("Username    :"+username);
		System.out.println("Password    :"+password);
	}

}
