package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BaseClass;
import com.utilities.CommonMethods;

public class Leave extends BaseClass{

	@BeforeClass
	public void lunchBrowser() {
		BaseClass.setUp();
	}
	
	@Test(priority=0)
	public void login() {
		try {
			loginPage.login();
			Thread.sleep(1000);
			WebElement userName = driver.findElement(By.xpath(Xpaths.LEAVE));
			CommonMethods.click(userName);
			System.out.println("Leave page successful");
			
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
	public void method() {
		System.out.println("//just some code");
	}
	
	@AfterClass
	public void closeBrowser() {
		BaseClass.tearDown();
	}
}
