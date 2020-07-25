package com.elf.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddNewBtn;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement NewCustomerMenu;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerNametbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescriptiontbx;

	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement CopyProjectDropDown;

	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompanyMenu;

	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement VerifyCustomerText;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}

	public WebElement getNewCustomerMenu() {
		return NewCustomerMenu;
	}

	public WebElement getEnterCustomerNametbx() {
		return EnterCustomerNametbx;
	}

	public WebElement getCustomerDescriptiontbx() {
		return CustomerDescriptiontbx;
	}

	public WebElement getCopyProjectDropDown() {
		return CopyProjectDropDown;
	}

	public WebElement getOurCompanyMenu() {
		return OurCompanyMenu;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}

	public WebElement getVerifyCustomerText() {
		return VerifyCustomerText;
	}

}
