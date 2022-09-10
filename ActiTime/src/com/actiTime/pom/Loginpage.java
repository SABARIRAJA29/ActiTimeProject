package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id="username")
	private WebElement untxtbx;
	@FindBy (name="pwd")
	private WebElement psdtxtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBt;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String un,String pwd)
	{
		untxtbx.sendKeys(un);
		psdtxtbx.sendKeys(pwd);
		loginBt.click();
		}

	

}
