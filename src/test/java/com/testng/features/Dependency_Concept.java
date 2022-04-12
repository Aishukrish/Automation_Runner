package com.testng.features;

import org.testng.annotations.Test;

public class Dependency_Concept {
	@Test(groups = "Education")
	private void SSLC() {
		System.out.println("SSLC");
	}
	@Test(dependsOnMethods = "SSLC",groups = "education")
	private void HSC() {
		System.out.println("HSC");
	}
	@Test(dependsOnMethods = "HSC",groups = "education")
	private void college() {
		System.out.println("College");
	}
	@Test(dependsOnGroups = "education")
	private void career() {
		System.out.println("IT profession");
	}

}
