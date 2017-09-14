package com.mvnseltng.global;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DriverSettings {
	
	public WebDriver setDriver(WebDriver driver){
		driver.manage().window().setSize(new Dimension(800, 1200));
		return driver;
	}
}
