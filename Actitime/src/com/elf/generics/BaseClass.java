package com.elf.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.elf.pom.EnterTimeTrackPage;
import com.elf.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public FileLib f=new FileLib();
@BeforeClass
public void openBrowser()
{
	System.out.println("open the browser");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterClass
public void closeBrowser()
{
	System.out.println("close the browser");
	driver.close();
}

@BeforeMethod
public void login() throws IOException
{
	System.out.println("login");
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("un");
	String pwd = f.getPropertyData("pwd");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pwd);

}

@AfterMethod
public void logout()
{
	System.out.println("logout");
    EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
    e.clickLogout();
}
}
