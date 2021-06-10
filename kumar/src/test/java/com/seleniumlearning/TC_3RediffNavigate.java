package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RediffNavigatePages;

public class TC_3RediffNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String Homepagetittle=driver.getTitle();
		System.out.println("title of homepage is "+Homepagetittle);
		RediffNavigatePages rediffmain=new RediffNavigatePages(driver);
		
		rediffmain.getsigninlink().click();
		String loginpage=driver.getTitle();
		System.out.println("title of loginpage is "+loginpage);
		driver.navigate().back();
		String currenthomepage=driver.getTitle();
		System.out.println("current homepage is "+currenthomepage);
		if(currenthomepage.equals(Homepagetittle))
		{
			System.out.println("Homepage tittle is same as search");
		}
		else
			System.out.println("Homepage is not same");
		driver.navigate().forward();
		String currentloginpage=driver.getTitle();
		System.out.println("current login page is "+currentloginpage);
		if(currentloginpage.equals(loginpage))
		{
			System.out.println("loginpage tittle is same as search");
		}
		else
			System.out.println("loginpage is not same");
		driver.close();
		
		

	}

}
