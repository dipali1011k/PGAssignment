package com.Commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.constants.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commons {
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		constants.driver=new ChromeDriver();
	}
	public static void maximizeBrowser()
	{
		constants.driver.manage().window().maximize();
	}
	public static void scrollByJSE()
	{
		JavascriptExecutor jse=(JavascriptExecutor)constants.driver;
		jse.executeScript("window.scrollBy(0,5000);");
	}
	public static void launchUrl()
	{
		constants.driver.get("https://basecopy5.staging.pg-test.com/hub/newhub503949860203/home-v3");
		constants.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
public static void hoverOnWebElement(WebElement ele)
{
	Actions act=new Actions(constants.driver);
	act.moveToElement(ele).perform();
	}
public static WebElement getWebelement(String locatorType,String locatorValue)
{
	WebElement element=null;
	switch(locatorType)
	{
	case"id":
	element=constants.driver.findElement(By.id(locatorValue));
		break;
	case"name":
		element=constants.driver.findElement(By.name(locatorValue));
		break;
	case"xpath":
		element=constants.driver.findElement(By.xpath(locatorValue));
		break;
	case"classname":
		element=constants.driver.findElement(By.className(locatorValue));
		break;
	case"linktext":
		element=constants.driver.findElement(By.linkText(locatorValue));
		break;
	case"partiallinktext":
		element=constants.driver.findElement(By.partialLinkText(locatorValue));
		break;
	case"tagname":
		element=constants.driver.findElement(By.tagName(locatorValue));
		break;
	case"cssselector":
		element=constants.driver.findElement(By.cssSelector(locatorValue));
		break;
		default:
			System.out.println("invalid loactor type"+locatorType+"expected id,name,className,xpath,linkText,partialLinText,tagName,cssSelector");
	 
	}
	return element;
	
	}
public static void enterText(String locatorType,String locatorValue,String textToEnter)
{
	getWebelement(locatorType, locatorValue).sendKeys(textToEnter);
	}
public static void clickOnWebElement(String locatorType,String locatorValue)
{
	getWebelement(locatorType,locatorValue).click();
	
}
public static void refreshBrowser()
{
	constants.driver.navigate().refresh();
	}
public static void switchParentWindow()
{
	String parent =constants.driver.getWindowHandle();
	constants.driver.switchTo().window(parent);
	}
public static void closeBrowser()
{
	constants.driver.close();
	}
public static void closeAllBrowsers()
{constants.driver.quit();
	}
public static void navigateTobackpage()
{
	constants.driver.navigate().back();
	}

}
