package org.openMRS.patient.pages;

import org.openMRS.patient.testBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{
	@FindBy(xpath="//i[@class='icon-user']")
	WebElement registerPatient;
	
	public HomePage()
	{
		PageFactory.initElements(driver, HomePage.this);
	}
	
	
	public RegisterPage clickRegisterPatientLink()
	{
		registerPatient.click();
		return new RegisterPage();
	}
	
}
