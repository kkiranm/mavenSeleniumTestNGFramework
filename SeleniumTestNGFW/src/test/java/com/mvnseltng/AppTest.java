package com.mvnseltng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest 
{

	@Test
	public void smoke(){
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.aami.com.au");
				
	}
}
