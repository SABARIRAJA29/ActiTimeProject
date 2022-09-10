package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_Time_Track {
	
	@FindBy(xpath="//a[@class='content tasks']")
    private WebElement taskclick;
	
	@FindBy(id="logoutLink")
	private WebElement logoutclick;
	
	public Enter_Time_Track(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setTaskclick() {
		taskclick.click();
	}

	public void setLogoutclick() {
		logoutclick.click();
	}
	
}
