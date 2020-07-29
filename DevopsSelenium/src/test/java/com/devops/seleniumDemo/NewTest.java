package com.devops.seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  
	WebDriver driver;
	@Test
	public void f() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Personal\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser is launched");
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.quit();
  }
  
  
}
