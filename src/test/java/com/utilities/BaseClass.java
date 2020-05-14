package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	//Global variables
	public static Properties prop;
	public static WebDriver driver;
	
	//This method reads properties file
	public static void initProperties(String filePath) {

		prop = new Properties();
		try {
			//this makes connection with file to be read
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//This code will run scripts on windows and Mac plat forms
	public static void setUp() {
		initProperties(Constants.filePath);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			if (Constants.osName.contains("Mac")) {
				//WebDriverBase.headlessSetup();
				System.setProperty("webdriver.chrome.driver", "/Users/fnuzarawar/Downloads/chromedriver");
			} else if (Constants.osName.contains("Windows")) {
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			}
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			if (Constants.osName.contains("Mac")) {
				System.setProperty("webdriver.gecko.driver", "/Users/fnuzarawar/Downloads/chromedriver");
			} else if (Constants.osName.contains("Windows")) {
				System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");
			}
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (Constants.osName.contains("Mac")) {
			driver.manage().window().fullscreen();
		} else if (Constants.osName.contains("Windows")) {
			driver.manage().window().maximize();
		}
		driver.get(prop.getProperty("url"));
	}

	//This method will close browser
	public static void tearDown() {
		driver.quit();
	}

	
}
