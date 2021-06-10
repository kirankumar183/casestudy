package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchinputfield;
	
	public WebElement getsearchinputfield() {
		 return searchinputfield;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchicon;
	
	public WebElement getsearchicon() {
		return searchicon;
	}
	
	@FindBy(name="url")
	WebElement categorylist;
	
	public Select getcategorylist() {
		
		Select sel=new Select(categorylist);
		return sel;
	}
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> selectbooklist;
	 
	public List<WebElement> getselectbooklist(){
		return selectbooklist;
	}
	

	@FindAll(@FindBy(xpath="//span[@class='a-price-whole']"))
	List<WebElement> selectbookpricelist;
	
	public List<WebElement> getselectbookpricelist(){
		return selectbookpricelist;
	}
	 
	
	
	
	public AmazonPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

}
