package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazonpages {
	WebDriver driver;
	@FindBy(name="url")
	WebElement CategoryBox;
	public Select getCategoryBox()
	{
		Select category = new Select(CategoryBox);
		return category;
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	public WebElement getSearchBox()
	{
		return SearchBox;
    }
	
	@FindBy(id="nav-search-submit-button")
	WebElement SearchBtn;
	public WebElement getSearchBtn()
	{
		return SearchBtn;
    }
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
    List<WebElement> BookNames;
	public List<WebElement> getBookNames()
	{
		return BookNames;
	}
	
	@FindAll(@FindBy(xpath="//div//span[@class='a-price-whole']"))
	List<WebElement> BookPrices;
	public List<WebElement> getBookPrices()
	{
		return BookPrices;
	}
	
	@FindAll(@FindBy(xpath="//div//span[@class='a-size-base-plus a-color-base a-text-normal']"))
    List<WebElement> FurnitureNames;
	public List<WebElement> getFurnitureNames()
	{
		return FurnitureNames;
	}
	
	@FindAll(@FindBy(xpath="//div//span[@class='a-price-whole']"))
	List<WebElement> FurnituePrices;
	public List<WebElement> getFurnituePrices()
	{
		return FurnituePrices;
	}
	@FindAll(@FindBy(xpath="//div//span[@class='a-size-base-plus a-color-base a-text-normal']"))
    List<WebElement> MobileNames;
	public List<WebElement> getMobileNames()
	{
		return MobileNames;
	}
	
	@FindAll(@FindBy(xpath="//div//span[@class='a-price-whole']"))
	List<WebElement> MobilePrices;
	public List<WebElement> getMobilePrices()
	{
		return MobilePrices;
	}
	
	public Amazonpages(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
}
