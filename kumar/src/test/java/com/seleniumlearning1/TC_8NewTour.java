package com.seleniumlearning1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.NewTourspages;



public class TC_8NewTour {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	NewTourspages newtourmain=new NewTourspages(driver);
	driver.get("http://demo.guru99.com/test/newtours/");
	Thread.sleep(3000);
	newtourmain.getunamefield().sendKeys("mercury");
	newtourmain.getpwdfield().sendKeys("mercury");
	newtourmain.getsubmitbtn().click();
	newtourmain.getflightslink().click();
	String v1=newtourmain.getdeparture().getFirstSelectedOption().getText();
	System.out.println(v1);
	String v2=newtourmain.getarrival().getFirstSelectedOption().getText();
	System.out.println(v2);
	if(v1.contentEquals(v2))
	{
		System.out.println("departure location and arriving location are same");
	}
	else
	{
		System.out.println("departure time and arriving location are different");
	}
	driver.close();
	
}
}
