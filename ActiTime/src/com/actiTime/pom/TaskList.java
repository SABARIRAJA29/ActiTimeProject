package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addclick;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcust;
	
	@FindBy(xpath="//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[1]/input")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement desName;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection' ]")
    private WebElement selectCust;
	
	@FindBy(xpath="//div[text()='Our company' and@class='itemRow cpItemRow ' ]")
	private WebElement selOtherCompy;
	
    @FindBy(xpath="//div[text()='Create Customer' and@class='components_button_label' ]")
    private WebElement createcust;
	
	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddclick() {
		return addclick;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getDesName() {
		return desName;
	}

	public WebElement getSelectCust() {
		return selectCust;
	}

	public WebElement getSelOtherCompy() {
		return selOtherCompy;
	}

	public WebElement getCreatecust() {
		return createcust;
	}
	
	
}
