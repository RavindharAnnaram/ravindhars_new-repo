package testNG.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class googleTest {
	 WebDriver driver;
	
	
	@BeforeMethod
	public  void Setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	@Test
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test 
	public void GooglelogoTest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test 
	public void maillogo() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	

}
