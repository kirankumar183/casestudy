package com.seleniumlearning1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.Ebay_pages;

public class TC_4Ebayattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Ebay_pages Ebaymain=new Ebay_pages(driver);
		//2.launch the ebay url
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String Attribute1=Ebaymain.getclickregisterlink().getAttribute("href");
		System.out.println("register link href attributes are "+Attribute1);
		String Attribute2=Ebaymain.getclickregisterlink().getAttribute("sp");
		System.out.println("register link sp attributes are: "+Attribute2);
		driver.close();
		

	}

}
