package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class SelectCalendarByJs {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			driver.get("http://spicejet.com/");

			Thread.sleep(15000);
			WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
			
			String datevalue = "18/7";
			
			 
			SelectdatebyJs(driver, date, datevalue);
			
		}
			
			
			
			
			public static void SelectdatebyJs(WebDriver driver, WebElement element, String datevalue) {
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');", element);
				
			

	}

}
