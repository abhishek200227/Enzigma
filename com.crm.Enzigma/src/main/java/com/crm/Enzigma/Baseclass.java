package com.crm.Enzigma;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Baseclass {

	 public static  WebDriver driver;
		@BeforeClass
		public void beforeclass() throws IOException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("./credentials/url.properties");
			prop.load(fis);
			String url=prop.getProperty("url");
			driver.get(url);
			
		}
		
		@BeforeMethod
		public void beforemethod() {
			System.out.println("");
			
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("");
		}
		
		@AfterMethod
		public void aftermethod() {
			System.out.println("");
			
		}

}
