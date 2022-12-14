package com.shophunt.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement userlogout;
	
	public WebElement getUserLogout()
	{
		return userlogout;	
	}
	
	public void userLogout()
	{
		getUserLogout().click();
	}

}
