package testNG.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup() {
		System.out.println("set the system properties for chrome");
		}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("launch browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login to App");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("ENTER URL");
	}
	 
	@Test
	public void googleTitleText() {
		System.out.println("GOOGLE TITLE TEXT");
	}
	@Test
	 public void searchtest() {
		System.out.println("SEARCH TEST");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("LOGOUT FROM THE APP");
	}
	
	@AfterClass
	public void classbrowser() {
		System.out.println("CLASS BROWSER");
	}
	
	@AfterTest
	public void deleteAllcookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("GENERTE REPORT");
	}
	
	
	

}
