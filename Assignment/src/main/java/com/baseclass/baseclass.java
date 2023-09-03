package com.baseclass;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Commons.Commons;
import com.constants.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

@BeforeTest
public static void setUp() throws InterruptedException
{
	Commons.openBrowser();
	Commons.maximizeBrowser();
	Commons.launchUrl();
	Commons.enterText("xpath", "//input[@id='email']", "dipalikhilari@peoplegrove.com");
	Commons.enterText("xpath", "//input[@id='password']", "Automation@123");
	Commons.clickOnWebElement("xpath", "//button[@type='submit']");
	Thread.sleep(70000);
	}
@AfterTest
public static void tearDown()
{
	Commons.closeBrowser();
	Commons.closeAllBrowsers();
	}
}
