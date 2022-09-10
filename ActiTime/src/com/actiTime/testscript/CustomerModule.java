package com.actiTime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actiTime.generic.Baseclass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.Enter_Time_Track;
import com.actiTime.pom.TaskList;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class CustomerModule extends Baseclass {

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {

		FileLib fl=new FileLib();
		String custname = fl.getExceldata("createcustomer", 1, 2);
		String description = fl.getExceldata("createcustomer", 1, 3);

		Enter_Time_Track tk= new Enter_Time_Track(driver);
		tk.setTaskclick();
		TaskList tl=new TaskList(driver);
		tl.getAddclick().click();;
		tl.getNewcust().click();;



		tl.getCustname().sendKeys(custname);
		tl.getDesName().sendKeys(description);

		tl.getSelectCust().click();
		tl.getSelOtherCompy().click();
		tl.getCreatecust().click();



	}}
