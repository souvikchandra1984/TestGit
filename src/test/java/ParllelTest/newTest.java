package ParllelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class newTest {

	@Test
	public void checkPp()
	{
		System.setProperty("webdriver.gecko.driver", "D://Souvik//Selenium//Selenium Jar//geckodriver-v0.11.1-win64//geckodriver.exe");
		System.out.println("Hello New");
		Reporter.log("Inside PP Class 1st Methos"); 
		Reporter.log("\n");
		Reporter.log("3rd line PP");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		
	}
	
	
}
