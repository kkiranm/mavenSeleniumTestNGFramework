package com.mvnseltng.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.mvnseltng.global.DriverSettings;

public class Hooks {

	private final String baseURL = "http://www.aami.com.au";
	protected WebDriver driver;
	DriverSettings driverSettings;
	
	public Hooks(){
		driver = new ChromeDriver();
		driverSettings = new DriverSettings();
		driver = driverSettings.setDriver(driver);
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
