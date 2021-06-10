package com.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.NewTourspages;

public class TC9_NewTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		NewTourspages newtourmain=new NewTourspages(driver);
		
		driver.get("http://www.demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		int unameheight=newtourmain.getunamefield().getSize().getHeight();
		int unamewidth=newtourmain.getpwdfield().getSize().getWidth();
		System.out.println("username height is " +unameheight +" username width is " +unamewidth);
		
		int pwdheight=newtourmain.getpwdfield().getSize().getHeight();
		int pwdwidth=newtourmain.getpwdfield().getSize().getWidth();
		
		System.out.println("pwdheight is " +pwdheight+" pwdwidth is " +pwdwidth);
		
		if(unameheight==pwdheight) {
			System.out.println("unameheight is same as pwdheight");
		}
		else
			System.out.println("unameheight and pwdheight is not same");
		
		if(unamewidth==pwdwidth)
		{
			System.out.println("unamewidth is same as pwdwidth");
		}
		else
			System.out.println("unamewidth and pwdwidth is not same");
		
		
		driver.close();
	
	}

}
