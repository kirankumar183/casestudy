package com.seleniumlearning1;






import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.Amazonpages;



public class TC_6Amazonsearch {
        //case study 7
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		//launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Amazonpages amazon =new Amazonpages(driver);
		//launch amazon url
		driver.get("https://www.amazon.in/");
		//print the category box list of items
		List<WebElement> options =amazon.getCategoryBox().getOptions();
        System.out.println("total number of options are: " + options.size());
        //select "books" item from category
        amazon.getCategoryBox().selectByVisibleText("Books");
        //search for book items
        amazon.getSearchBox().sendKeys("Da vinci Code");
        //click on search button
        amazon.getSearchBtn().click();
        //print the collection of item names
        List<WebElement> BookNames =amazon.getBookNames();
        System.out.println("total no of items loaded are: " + BookNames.size());
        for(WebElement Item:BookNames)
        {
        	System.out.println("the title of the book is: " + Item.getText());
        	
        }
        // print the prices of items
        List<WebElement> Prices =amazon.getBookPrices();
        System.out.println("the books prices count are: " + Prices.size());
        for(WebElement Price:Prices)
        {
        	System.out.println("the books prices are: " + Price.getText());
        	
        }
        //navigate back
        driver.navigate().back();
        //print the category box list of items
        List<WebElement> options2 =amazon.getCategoryBox().getOptions();
        System.out.println("total number of options are: " + options2.size());
        //select "Furniture" item from category box
        amazon.getCategoryBox().selectByVisibleText("Furniture");
        //search for furniture items
        amazon.getSearchBox().sendKeys("Wooden tables");
        //click on search button
        amazon.getSearchBtn().click();
        //print the collection of item names
        List<WebElement> FurNames =amazon.getFurnitureNames();
        System.out.println("total no of items loaded are: " + FurNames.size());
        for(WebElement Item2: FurNames)
        {
        	System.out.println("the title of the furniture is: " + Item2.getText());
        	
        }
        // print the prices of items
        List<WebElement> FurPrices =amazon.getFurnituePrices();
        System.out.println("the furniture prices count are: " + FurPrices.size());
        for(WebElement Price2:FurPrices)
        {
        	System.out.println("the furnitue  prices are: " + Price2.getText());
        	
        }
        //navigate back
        driver.navigate().back();
        //print the category box list of items
        List<WebElement> options3 =amazon.getCategoryBox().getOptions();
        System.out.println("total number of options are: " + options3.size());
        //select "Electronics" item from category box
        amazon.getCategoryBox().selectByVisibleText("Electronics");
        //search for mobile phone items
        amazon.getSearchBox().sendKeys("Mobile phones");
        //click on search button
        amazon.getSearchBtn().click();
      //print the collection of item names
        List<WebElement> MobNames =amazon.getMobileNames();
        System.out.println("total no of items loaded are: " + MobNames.size());
        for(WebElement Item3: MobNames)
        {
        	System.out.println("the title of the mobile is: " + Item3.getText());
        	
        }
        // print the prices of items
        List<WebElement> MobPrices =amazon.getMobilePrices();
        System.out.println("the mobile prices count are: " + MobPrices.size());
        for(WebElement Price3:FurPrices)
        {
        	System.out.println("the mobile  prices are: " + Price3.getText());
        	
        }
        
        
        
        
}

}