package org.openMRS.patient.pages;

import org.openMRS.patient.testBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase
{
		
//step 1: locating required webElements of LoginPage	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Inpatient Ward")
	WebElement locationSession;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	
//step 2: initialization of LoginPage webElements
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
//step 3: operations/functions which are required to perform in LoginPage
	public HomePage validLogin(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		locationSession.click();
		loginButton.click();
		return new HomePage();
	}
	
	
	
		
	}
	
