package com.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	public static void enterValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static WebElement waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		WebElement elm = waiting(element);
		elm.click();
	}
//	public static void Select(WebElement selectCriteria, String text) {
//		Select select=new Select(selectCriteria);
//		select.deselectByVisibleText(text);
//	}
	public static void DropDown(WebElement DD,String value) {

	       Select select=new Select(DD);
	       select.selectByVisibleText(value);
	   }
	public static void DropDown(WebElement DD1, int value1) {
		Select s=new Select(DD1);
		s.selectByIndex(value1);
	}
//	public static void DropDown(WebElement DD2, String value, String value2) {
//		Select 
//	s=new Select(DD2);
//		s.selectByValue(value);
//	}
	
}
