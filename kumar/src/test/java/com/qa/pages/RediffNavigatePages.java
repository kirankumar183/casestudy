package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffNavigatePages {
	WebDriver driver;
	@FindBy(linkText="Sign in")
	WebElement signinlink;
	
	public WebElement getsigninlink() {
		return signinlink;
	}
	
	public RediffNavigatePages(WebDriver driver) {
		this. driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
