package com.seleniumlearning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.MultipleWindowpages;

public class TC_11MultipleWindow {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			MultipleWindowpages  gmailaccount =new MultipleWindowpages(driver);
			driver.get("https://www.google.com/intl/en_in/gmail/about/");
			gmailaccount.getCreateAccountUrl().click();
			gmailaccount.getTermsLink().click();
			gmailaccount.getPrivacyLink().click();   
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> iterator = windowHandles.iterator();
			while(iterator.hasNext())
			{
				String Winid = iterator.next();
				WebDriver window =driver.switchTo().window(Winid);
				System.out.println(window.getTitle());
					List<WebElement> Links = window.findElements(By.tagName("a"));
				System.out.println("Total no of links present on the window  with id"+Winid+"are:"+Links.size());
			}
			driver.close();

	}
	     

}