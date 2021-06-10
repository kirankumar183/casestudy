package com.seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ebay_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    //System.out.println(driver.findElement(By.linkText("register")).getAttribute("href"));
		
//		Thread.sleep(3000);
//		WebElement firstname=driver.findElement(By.id("firstname"));
//		firstname.sendKeys("smith");
//		WebElement lastname=driver.findElement(By.id("lastname"));
//		lastname.sendKeys("kim");
//		driver.findElement(By.name("Email")).sendKeys("smithkim@gmail.com");
//		//Thread.sleep(3000);
//		driver.findElement(By.id("showpassword")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("kiran@");
//		Thread.sleep(4000);
//		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
//		String tittle=driver.getTitle();
//		System.out.println(tittle);
//		driver.close();
//		
	
		

	}

}
