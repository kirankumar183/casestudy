package virtusa_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Google_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\chan\\eclipse-workspace\\kumar\\conf\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		String actualTittle=driver.getTitle();
		String expected=actualTittle.toUpperCase();
		if(actualTittle.equals(expected))
		{
			System.out.println("Tittle is in uppercase");
		}
		else
		{
			System.out.println("Tittle is in lowercase");
		}
		driver.close();
		

	}

}
