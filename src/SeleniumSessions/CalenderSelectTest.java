package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderSelectTest {




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
			driver.switchTo().frame("mainpanel ");
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//a[@title='Calendar']")).click();
			
			//WebDriverWait wait = new WebDriverWait(webDriver, timeoutInSeconds);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locator")));
			
	//		Actions action = new Actions (driver);
		//	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Calendar')]"))).build().perform();;
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[contains(text(), 'Month View') ]")).click();
			
			
			String date= "29-April-2000";
			
			String dateArr[] = date.split("-"); // {18,september,2018}
			String day = dateArr[0];
			String month =dateArr[1];
			String year = dateArr[2];
			
			
			
			Select select = new Select(driver.findElement(By.name("slctMonth")));
			select.selectByVisibleText(month);
			new Select(driver.findElement(By.name("slctYear"))).selectByVisibleText(year);
			
			///html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[1]
		    ///html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[2]
			
			String beforexpath = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[";
			String afterxpath = "]/td[";
			
			final int totalweekdays = 7;
			
			//2-1 2-2 2-3 2-4 2-5 2-6 2-7
			//3-1 3-2 3-3 3-4 3-5 3-6 3-7
			
			boolean flag = false;
			String dayvalue = null;
			
			for (int rowNum=2 ; rowNum<=7 ; rowNum++) {
				for(int colNum= 1; colNum<=7; colNum++) {
					
					try {
						dayvalue= driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum + "]")).getText();
					
					}catch (NoSuchElementException e) {
						System.out.println("please enter a correct date value");
						flag = false;
						break;
						
					}
					System.out.println(dayvalue);
					if(dayvalue.equals(day)) {
						driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum + "]")).click();
						flag = true;
						break;
						
					}
					
					}
					
					
				}
				
			}
			
		}

		

