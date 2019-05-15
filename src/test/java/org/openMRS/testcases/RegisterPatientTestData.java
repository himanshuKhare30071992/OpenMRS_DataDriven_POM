package org.openMRS.testcases;

import org.openMRS.patient.testBase.TestBase;
import org.openMRS.patient.testUtility.TestUtil;

public class RegisterPatientTestData extends TestBase
{
	
	public static void main(String[] args) throws Exception
	{
		TestUtil.readExcel("FullTestCase");
		
		String r = TestUtil.getColumnData("Username");
		System.out.println(r);
		
		TestUtil.getColumnData("Password");
		TestUtil.getColumnData("SessionLocation");
		TestUtil.getColumnData("Given");
		TestUtil.getColumnData("Middle");
		TestUtil.getColumnData("FamilyName");
		TestUtil.getColumnData("Gender");
		
		TestUtil.getColumnData("Day");
		TestUtil.getColumnData("Month");
		TestUtil.getColumnData("Year");
		TestUtil.getColumnData("Address1");
		TestUtil.getColumnData("Address2");
		TestUtil.getColumnData("City");
		TestUtil.getColumnData("State");
		TestUtil.getColumnData("Country");
		
		TestUtil.getColumnData("PostalCode");
		TestUtil.getColumnData("PhoneNumber");
		TestUtil.getColumnData("RelationType");
		TestUtil.getColumnData("PersonName");
		TestUtil.getColumnData("SearchByName");
		
			 											

		 			
		
		
		
	}

}
