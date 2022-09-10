package com.actiTime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actiTime.pom.Loginpage;

public class Baseclass {
   public static WebDriver driver;
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f = new FileLib();
	String url = f.getProperty("url");
	String un = f.getProperty("username");
	String pwd = f.getProperty("password");
	
	driver.get(url);
	Loginpage lg=new Loginpage(driver);
	lg.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("",true);
	}
	
	
	
}
