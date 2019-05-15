package org.openMRS.testcases;

import org.openMRS.patient.pages.HomePage;
import org.openMRS.patient.pages.RegisterPage;
import org.openMRS.patient.testBase.TestBase;
import org.testng.annotations.Test;

public class RegisterPatientPageTest extends TestBase
{
	HomePage homePageObject;
	RegisterPage registerPageObject;
	

@Test
public void registerPatientTest() throws InterruptedException
{
	registerPageObject = new RegisterPage();
	registerPageObject.registerPatient();
}
	
}
