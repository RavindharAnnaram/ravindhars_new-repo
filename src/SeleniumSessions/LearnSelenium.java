package SeleniumSessions;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class LearnSelenium 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	File file = new File("E:\\Library\\chrome driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
         WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.hmhco.com/classroom-solutions/assessment");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Classroom Solutions")).click();
        driver.close();
    }
}
