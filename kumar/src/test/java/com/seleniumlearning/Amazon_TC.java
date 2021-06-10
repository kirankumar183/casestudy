package com.seleniumlearning;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

public class Amazon_TC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		AmazonPages Amazonmain=new AmazonPages(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement>options=Amazonmain.getcategorylist().getOptions();
		System.out.println("total no.of.items in category list is "+ options.size());
		
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
		
		Amazonmain.getcategorylist().selectByVisibleText("Books");
		Amazonmain.getsearchinputfield().sendKeys("Di Vanci code");
		Amazonmain.getsearchicon().click();
		
		List <WebElement> booklist=Amazonmain.getselectbooklist();
		
		
		System.out.println("total no.of.items in category list is "+ booklist.size());
		for (WebElement book : booklist) 
		{
			System.out.println("the tittle of book is "+book.getText());
			
				}
				
		List<WebElement> bookprice=Amazonmain.getselectbookpricelist();		
				
		System.out.println("the book price is "+ bookprice.size());	
		for (WebElement price : bookprice) {
			System.out.println("the book prices are "+price.getText());
			
		}
		
		
		
		Thread.sleep(8000);
		
		Amazonmain.getcategorylist().selectByVisibleText("Electronics");
		Amazonmain.getsearchinputfield().sendKeys("mobile phones");
		Amazonmain.getsearchicon();
		
		
		
		
		

	}

}
}
