package com.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void loginTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.getCurrentUrl();
	}
}
