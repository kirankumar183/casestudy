package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.Ebay_pages;

public class TC_EbayRegister {

	public static void main(String[] args) throws InterruptedException {
		 //1.open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Ebay_pages Ebaymain=new Ebay_pages(driver);
		//2.launch the ebay url
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//3.click on register link
		Ebaymain.getclickregisterlink().click();
		//4.Enter first name as smith
		Ebaymain.getFirstnameTxtfield().sendKeys("smith");
		//5.Enter last name as kin
		Ebaymain.getlastnameTxtfield().sendKeys("kin");
		//6.Enter Email id
		Ebaymain.getEmailtxtfield().sendKeys("smithkim@gmail.com");
		//7.Enable the show check box
	    Ebaymain.getEnablepasswordcheckbox().click();
	    Thread.sleep(3000);
	    //8.Enter password
	    Ebaymain.getPasswordtxtfield().sendKeys("kiran@");
	    Thread.sleep(2000);
	    //9.click on register button
	    Ebaymain.getSubmitregister().click();
	    //10.close the browser
	    //driver.close();

	}

}
