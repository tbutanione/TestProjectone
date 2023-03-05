package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RSATest {
	
	public static WebDriver Driver;
	
	@Test
	public void RSAdata()throws Exception{
			
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriverone\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");			
		Driver=new ChromeDriver();
		Driver.get("https://www.licindia.in");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
	}

}
