package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BaseClass;
import com.utilities.CommonMethods;
import com.xpaths.Xpaths;

public class AdminPage extends BaseClass {

	@BeforeClass
	public void lunchBrowser() {
		BaseClass.setUp();
	}
	
	@Test(priority=0)
	public void login() {
		try {
			loginPage.login();
			Thread.sleep(1000);
			WebElement userName = driver.findElement(By.xpath(Xpaths.ADMIN));
			CommonMethods.click(userName);
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
	
	@AfterClass
	public void closeBrowser() {
		BaseClass.tearDown();
	}
}
