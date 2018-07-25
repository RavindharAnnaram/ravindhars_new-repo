package SeleniumSessions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;

public class JavaScriptExecutorConcept {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("Naveen");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,submit)]"));
		
		flash(loginBtn, driver);
		
	}
	
		
	
		
		public static void flash (WebElement element, WebDriver driver) {
			//JavaScriptExecutor js = ((JavaScriptExecutor)driver);
			String bgcolor = element.getCssValue("background color");
			for(int i=0; i<100 ; i++) {
			changecolor("rgb(0,200,0)",element, driver);
			changecolor(bgcolor, element, driver);
			}		
		}

		public static void changecolor(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("argument[0].Style.backgroundcolor = '"+color+"'" , element);
		
		
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e){
			
		}
		}
		
		
	}



