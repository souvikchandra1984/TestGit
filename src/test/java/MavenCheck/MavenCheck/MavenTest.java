package MavenCheck.MavenCheck;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

@Test (threadPoolSize = 3)
public class MavenTest {

	public void check() throws IOException{
	System.setProperty("webdriver.gecko.driver", "D://Souvik//Selenium//Selenium Jar//geckodriver-v0.11.1-win64//geckodriver.exe");
	System.out.println("Hello");
	Reporter.log("Hellp"); 
	WebDriver driver = new FirefoxDriver();
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//The below method will save the screen shot in d drive with name "screenshot.png"
	String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	File screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
	FileUtils.copyFile(scrFile, screenShotName);
	Reporter.log(screenShotName.toString());
	Assert.assertEquals("2", "2");
	//WebDriver d = new FirefoxDriver();
	//d.get("http://google.com");
}

}
