package org.openMRS.patient.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openMRS.patient.testUtility.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	String filePath = "\\src\\main\\java\\org\\openMRS\\patient\\configuration\\myConfig.properties";
	File file;
	public static Properties prop;
	FileInputStream fis;
	
	public static WebDriver driver;
	
	public TestBase()
	{
		String projectLocation = System.getProperty("user.dir");
		System.out.println("# Project Location ---> "+projectLocation);
		
		file = new File(projectLocation+filePath);
		//System.out.println(file);
		
		try {
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		TestUtil.readExcel("FullTestCase");
	//	System.out.println(prop.getProperty("browserName"));
	}

	
	public static void initDriver()
	{
		String browserName  = prop.getProperty("browserName");
		String applicationURL = prop.getProperty("applicationURL");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(applicationURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
	
	
}
