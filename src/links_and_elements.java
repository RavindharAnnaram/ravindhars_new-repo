import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class links_and_elements {

		public static void main(String[] args) {
			 
			System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.get("http://toolsqa.wpengine.com/");
	 
			List<WebElement> links = driver.findElements(By.xpath("//*"));
	 
			System.out.println(links.size());
			
			List<WebElement> elements = driver.findElements(By.xpath("//*"));
			 
			System.out.println(elements.size());
	 
	 
			for (int i = 1; i<=links.size(); i=i+1)
	 
			{
	 
				System.out.println(links.get(i).getText());
	 
			}
			for (int j = 1; j<=elements.size(); j=j+1)
				 
			{
	 
				System.out.println(elements.get(j).getText());
	 
			}
		}
}

