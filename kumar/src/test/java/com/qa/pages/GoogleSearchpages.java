package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchpages {
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement searchtxtfield;
	
	public WebElement getsearchtxtfield() {
		return searchtxtfield;
	}
	
	@FindBy(name="btnK")
	WebElement searchbutton;
	
	public WebElement getsearchbutton() {
		return searchbutton;
	}
	
	
	public GoogleSearchpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
