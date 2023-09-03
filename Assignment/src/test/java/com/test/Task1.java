package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Commons.Commons;
import com.baseclass.baseclass;
import com.constants.constants;

public class Task1 extends baseclass{

	@Test
	public static void PG_001() throws InterruptedException 
	{
	 WebElement ele4=constants.driver.findElement(By.xpath("//button[text()='Career']"));
		Commons.hoverOnWebElement(ele4);
		Thread.sleep(5000);
		Commons.clickOnWebElement("xpath", "//p[text()='Jobs']");
		Thread.sleep(5000);		
		Commons.scrollByJSE();
		Commons.clickOnWebElement("xpath","(//div[text()='Senior QA '])[1]");
		Commons.clickOnWebElement("xpath","//button[text()='Ask a Question']");
		Commons.enterText("xpath","//span[@class='fr-placeholder']","Dipali 01 sept,Total Exp:3.7");
		Commons.clickOnWebElement("xpath", "//button[@class='Button-module_root__XAZ4E Button-module_default__k4a0- Button-module_primary__4ciLr']");
		Commons.clickOnWebElement("xpath","//button[text()='Keep the Convo Going!']");
		Commons.clickOnWebElement("xpath", "//span[text()='View Profile']");
		WebElement ele1=constants.driver.findElement(By.xpath("//div[@class='rich-text ql-editor']"));
		String txt=ele1.getText();
		SoftAssert sa=new SoftAssert();
		String data="Dipali 01 sept,Total Exp:3.7";
		sa.assertEquals(txt, data,"Message sent is verified");
		sa.assertAll();
	}
	}

