package com.mvnseltng.tests;

import org.testng.annotations.Test;

import com.mvnseltng.global.Hooks;

public class AppTest extends Hooks
{

	@Test
	public void smoke(){
		System.out.println(driver.getTitle());				
	}
}
