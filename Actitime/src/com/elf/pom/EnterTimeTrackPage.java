package com.elf.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {


	@FindBy(id="logoutLink")
	private WebElement logout;

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement TasksTab;

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	public void clickLogout() {
		logout.click();
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}
}


