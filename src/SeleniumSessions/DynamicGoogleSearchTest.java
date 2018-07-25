package SeleniumSessions;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximise page
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("java");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role= 'listbox']//li/desendant::li[@data='java tutorial']"));
		
		System.out.println("the total number of suggesions in search box===>" + list.size());

		for(int i=0; i< list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial"));
			list.get(i).click();
			break;
			
			
		}
			
			
		
	}

}
