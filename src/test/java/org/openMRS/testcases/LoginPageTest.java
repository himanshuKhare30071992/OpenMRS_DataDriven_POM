package org.openMRS.testcases;

import org.openMRS.patient.pages.HomePage;
import org.openMRS.patient.pages.LoginPage;
import org.openMRS.patient.testBase.TestBase;
import org.openMRS.patient.testUtility.TestUtil;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
 
	LoginPage loginPageObject;
	HomePage homePageObject;
	private String userName;
	private String passWord;
	
	@BeforeSuite
	public void dataPreparation()
	{
		userName = TestUtil.getColumnData("Username");
		passWord = TestUtil.getColumnData("Password");
		initDriver();
	}
	
	
@Test
  public void validLoginTest() 
  {
	loginPageObject = new LoginPage();
	// NOTE: Below method will take username & password from Configuration file 
	//	loginPageObject.validLogin(prop.getProperty("username"), prop.getProperty("password"));
	homePageObject = loginPageObject.validLogin(userName, passWord);
  }


}
