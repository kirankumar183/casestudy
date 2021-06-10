package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qa.pages.Ebay_pages;


public class TC_2ebaypasswordReEnter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Ebay_pages ReEnter = new Ebay_pages(driver);
		driver.get("https://www.ebay.com/");
		ReEnter.getclickregisterlink().click();
		Thread.sleep(3000);
		WebElement email= ReEnter.getEmailtxtfield();
		String emailaddress="test@test.com";
		email.sendKeys(emailaddress);
		email.clear();
		Thread.sleep(2000);
		WebElement retypemail = ReEnter.getEmailtxtfield();
		String retypemailaddress="test@test.com";
		retypemail.sendKeys(retypemailaddress);
		
		if(emailaddress.equals(retypemailaddress)) 
		{
			System.out.println("Two fileds are matched");
		}
		else {
			System.out.println("Two fileds are not matched");
		}
		driver.close();
	}

}
