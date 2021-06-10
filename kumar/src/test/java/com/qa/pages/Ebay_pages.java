package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_pages {
	WebDriver driver;

	
	@FindBy(linkText="register")
	WebElement clickregisterlink;
	
	public WebElement getclickregisterlink() {
		return clickregisterlink;
	}
	
	
	@FindBy(id="firstname")
	WebElement FirstnameTxtfield;
	
	public WebElement getFirstnameTxtfield() {
		return  FirstnameTxtfield;
	}
	
	@FindBy(id="lastname")
	WebElement lastnameTxtfield;
	
	public WebElement getlastnameTxtfield() {
		return  lastnameTxtfield;
	}
	
	@FindBy(name="Email")
	WebElement Emailtxtfield;
	
	public WebElement getEmailtxtfield() {
		return  Emailtxtfield;
	}
	
	@FindBy(id="showpassword")
	WebElement Enablepasswordcheckbox;
	
	public WebElement getEnablepasswordcheckbox() {
		return  Enablepasswordcheckbox;
	}
	
	@FindBy(id="password")
	WebElement Passwordtxtfield;
	
	public WebElement getPasswordtxtfield() {
		return Passwordtxtfield;
	}
	
	@FindBy (xpath="//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement Submitregister;
	
	public WebElement getSubmitregister() {
		return Submitregister;
	}
	
	
	public Ebay_pages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
}
	
