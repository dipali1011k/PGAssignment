package com.test;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Commons.Commons;
import com.baseclass.baseclass;
import com.constants.constants;

public class Task2 extends baseclass {
	@Test
	public static void PG_002() throws InterruptedException
	{
		WebElement ele4=constants.driver.findElement(By.xpath("//button[text()='Career']"));
		Commons.hoverOnWebElement(ele4);
		Thread.sleep(5000);
		Commons.clickOnWebElement("xpath","//p[text()='Career Paths']");
		Commons.scrollByJSE();
		WebElement opt=Commons.getWebelement("xpath","//h2[text()='Inspiration for you']");
		opt.click();
		WebElement opt1=Commons.getWebelement("xpath","(//a[@class='career-card'])[1]");
		opt1.click();
		Commons.navigateTobackpage();
		WebElement opt2=Commons.getWebelement("xpath","(//a[@class='career-card'])[3]");
		opt2.click();
		Commons.navigateTobackpage();
		WebElement opt3=	Commons.getWebelement("xpath","(//a[@class='career-card'])[2]");
		opt3.click();
		Commons.navigateTobackpage();
		List<WebElement>li=new ArrayList<>();
		li.add(opt1);
		li.add(opt2);
		li.add(opt3);
		System.out.println("arraylist is:"+li);
		Commons.switchParentWindow();
		Commons.refreshBrowser();
		JavascriptExecutor jse=(JavascriptExecutor)constants.driver;
		jse.executeScript("window.scrollBy(0,500);");
		Commons.scrollByJSE();
		List<WebElement>li1=constants.driver.findElements(By.xpath("(//div[@class='slick-list'])[1]"));
		Collections.reverse(li1);
		if(li.equals(li1))
		{
			System.out.println("list is correctly saved:");
		}
		else
		{
			System.out.println("list is not correctly saved");
		}
		
				
				
	}
}
