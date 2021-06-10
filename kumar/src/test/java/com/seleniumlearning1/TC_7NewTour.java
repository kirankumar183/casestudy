package com.seleniumlearning1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.NewTourspages;

public class TC_7NewTour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		NewTourspages newtourmain=new NewTourspages(driver);
		driver.get("http://www.demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		newtourmain.getunamefield().sendKeys("mercury");
		newtourmain.getpwdfield().sendKeys("mercury");
		newtourmain.getsubmitbtn().click();
		newtourmain.getflightslink().click();
		newtourmain.getpassengercount().selectByIndex(3);
		newtourmain.getdeparture().selectByValue("London");
		newtourmain.getdeparturemonth().selectByValue("6");
		newtourmain.getdepartureday().selectByValue("14");
		newtourmain.getarrival().selectByVisibleText("New York");
		newtourmain.getreturningmonth().selectByVisibleText("July");
		newtourmain.getreturningday().selectByVisibleText("16");
		newtourmain.getcontinuebtn().click();

	}

}
