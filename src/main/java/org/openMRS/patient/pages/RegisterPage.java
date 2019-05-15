package org.openMRS.patient.pages;

import org.openMRS.patient.testBase.TestBase;
import org.openMRS.patient.testUtility.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase
{
	@FindBy(id="genderLabel")
	WebElement genderLink;
	
	@FindBy(id="birthdateLabel")
	WebElement birthdateLink;
	
	@FindBy(xpath="//span[text()='Address']")
	WebElement addressLink;

	@FindBy(xpath="//span[text()='Phone Number']")
	WebElement phoneNumberLink;
	
	@FindBy(xpath="//span[text()='Relatives']")
	WebElement relativesLink;
	
	@FindBy(id="confirmation_label")
	WebElement confimLink;
	
	@FindBy(id="submit")
	WebElement confimButton;
	
	
	@FindBy(name="givenName")
	WebElement given;

	@FindBy(name="middleName")
	WebElement middle;
	
	@FindBy(name="familyName")
	WebElement familyName;
	
	//param
	@FindBy(xpath="//option[text()='Female']")
	WebElement gender;
	
	@FindBy(id="birthdateDay-field")
	WebElement day;
	
	//param
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	WebElement monthDropdown;	
	
	@FindBy(id="birthdateYear-field")
	WebElement year;
		
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="cityVillage")
	WebElement cityVillage;
	
	@FindBy(id="stateProvince")
	WebElement stateProvince;

	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="postalCode")
	WebElement postalCode;
	
	@FindBy(name="phoneNumber")
	WebElement phoneNumber;
	
	//param
	@FindBy(id="relationship_type")
	WebElement relationshipType;

	@FindBy(xpath="//input[@ng-model='relationship.name']")
	WebElement relationshipName;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerPatient() throws InterruptedException
	{
		String Given = TestUtil.getColumnData("Given");
		String Middle = TestUtil.getColumnData("Middle");
		String FamilyName = TestUtil.getColumnData("FamilyName");
		String Gender =TestUtil.getColumnData("Gender");
		
		String Day =	TestUtil.getColumnData("Day");
		String Month =TestUtil.getColumnData("Month");
		String Year =TestUtil.getColumnData("Year");
		String Address1 =TestUtil.getColumnData("Address1");
		String Address2 =TestUtil.getColumnData("Address2");
		String City =TestUtil.getColumnData("City");
		String State =TestUtil.getColumnData("State");
		String Country =TestUtil.getColumnData("Country");
		
		String PostalCode =TestUtil.getColumnData("PostalCode");
		String PhoneNumber =TestUtil.getColumnData("PhoneNumber");
		System.out.println(PhoneNumber); 
		
		String RelationType =TestUtil.getColumnData("RelationType");
		String PersonName =TestUtil.getColumnData("PersonName");
		
		given.sendKeys(Given);
		middle.sendKeys(Middle);
		familyName.sendKeys(FamilyName);
		
		genderLink.click();
		
		driver.findElement(By.xpath("//option[text()='"+Gender+"']")).click();

		birthdateLink.click();
		
		day.sendKeys(Day);
		
		monthDropdown.click();
		
		driver.findElement(By.xpath("//select[@id='birthdateMonth-field']//option[text()='"+Month+"']")).click();
		
		year.sendKeys(Year);
		
		addressLink.click();
		address1.sendKeys(Address1);
		address2.sendKeys(Address2);
		cityVillage.sendKeys(City);
		stateProvince.sendKeys(State);
		country.sendKeys(Country);
		postalCode.sendKeys(PostalCode);

		
		phoneNumberLink.click();
		phoneNumber.sendKeys(PhoneNumber);
		
		relativesLink.click();
		relationshipType.click();
		driver.findElement(By.xpath("//select[@id='relationship_type']//option[text()='"+RelationType+"']")).click();
		
		relationshipName.sendKeys(PersonName);
		
		confimLink.click();
		
		confimButton.click();
		
		Thread.sleep(10);
		
	}
}
