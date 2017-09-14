package com.mvnseltng.global;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.mvnseltng.global.DriverSettings;

public class Hooks {

	protected WebDriver driver;
	private DriverSettings driverSettings;
	private final String baseURL;
	
	public Hooks() throws IOException{
		driver = new ChromeDriver();
		driverSettings = new DriverSettings();
		driver = driverSettings.setDriver(driver);
		baseURL = driverSettings.getBaseURL();
		}
	
	@BeforeSuite
	public void testSetup(){
			driver.navigate().to(baseURL);
	}
	
	@AfterSuite
	public void testTearDown(){
		driver.quit();
	}
	
}
