package com.seleniumlearning1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RadioButtonPages;

public class TC_3RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		RadioButtonPages button = new RadioButtonPages(driver);
		driver.get("http://destinationqa.com/radiobuttons-html/");
		
		boolean ele = button.getCheckDefaultButton().isEnabled();
		System.out.println("Wednesday is defaultly enabled:" + ele);
		button.getSelectMonday().click();
		Thread.sleep(2000);
		System.out.println("monday button is enabled");
		boolean btn1 = button.getClickRedbtn().isSelected();
		boolean btn2 = button.getCheckYellowBtn().isSelected();
		if(btn1 && btn2){
			System.out.println("Red and yellow are selected");
			button.getClickRedbtn().click();
			Thread.sleep(2000);
			button.getCheckOrangeBtn().click();
			System.out.println("orange and yellow are selected");
		}
		//driver.close();
	}

}