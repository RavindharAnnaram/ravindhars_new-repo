package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicxpathTest2Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		
		Thread.sleep(8000);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 	
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='abc xyz']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='X Men']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		

	}

}
