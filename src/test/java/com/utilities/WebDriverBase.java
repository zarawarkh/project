package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverBase {
	
	static protected WebDriver driver;
    
    public static void headlessSetup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "src/test/resources/phantomjs");

        driver = new PhantomJSDriver(caps);
    }
//    public static void lunchOrangHRM(){
//    	driver.get("https://opensource-demo.orangehrmlive.com/");
//    	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//    	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin123");
//    	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//    	System.out.println("OrangeHRM login success");
//    }
//    
//    public static void LunchGoogle(){
//    	driver.get("https://www.amazon.com/");
//    	driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
//    	System.out.println("Amazon lunch success");
//    }
//    
//    
//    public static void main(String[] args) {
//        WebDriverBase.setup();
//        driver.get("https://devqa.io");
//        System.out.println("Tests Successful");
//        WebDriverBase.lunchOrangHRM();
//        WebDriverBase.LunchGoogle();
//    }

}
