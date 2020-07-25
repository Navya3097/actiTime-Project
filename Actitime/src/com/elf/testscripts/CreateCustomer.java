package com.elf.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.elf.generics.BaseClass;
import com.elf.pom.EnterTimeTrackPage;
import com.elf.pom.TaskListPage;

@Listeners(com.elf.generics.ListenersImplementation.class)
public class CreateCustomer extends BaseClass {
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		
		String ExpectedcustomerName = f.getExcelData("sheetname", 1, 0);
		String customerdescription = f.getExcelData("sheetname", 1, 1);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//Click on Task Tab
		e.getTasksTab().click();
		
		TaskListPage t=new TaskListPage(driver);
		//Click on Add New Button
		t.getAddNewBtn().click();
		
		//select New Customer in the Menu
		t.getNewCustomerMenu().click();
		
		//.Enter the customer Name
		t.getEnterCustomerNametbx().sendKeys(ExpectedcustomerName);
		
		//Enter the Customer Description
		t.getCustomerDescriptiontbx().sendKeys(customerdescription);
		
		//Click on Select Customer DropDown
		t.getCopyProjectDropDown().click();
		
		//Select our company in the drop drown
		t.getOurCompanyMenu().click();
		
		//Click on Create Customer button
		t.getCreateCustomerBtn().click();
		
		//Verify the Customer is successfully create or not
		Thread.sleep(5000);
		String ActualCustomerCreated = t.getVerifyCustomerText().getText();
		Assert.assertEquals(ActualCustomerCreated, ExpectedcustomerName);
		
	}

}


