package sel;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSeleniumNew {

	WebDriver driver;
	
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver", "D:\\HRManagement\\chromedriver_win32\\chromedriver.exe");
	}
	@BeforeMethod
	public void initialsetup() {
	ChromeOptions op=new ChromeOptions();
    driver = new ChromeDriver(op);
    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    op.addArguments("--remote-allow-origins=*");
    driver.get("https://www.google.com/");
       
}
	/*@SuppressWarnings("deprecation")
	@BeforeMethod
	public void before() {
		driver=new FirefoxDriver(); 
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);*/
	
	@DataProvider(name = "getdata")
	public Object[][] search() {
	    return new Object[][] {
	            {"Roicians"},
	            {"Roicians Automation Testing"},
	            {"Roicians QA"}
	    };
	}
		
	@Test(dataProvider = "getdata")
	public void Display(String Keywords) throws InterruptedException {
	    driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Roicians");
	    Thread.sleep(2000);	}
	 
	@Test
	public void gettitle() {
		String Title=driver.getTitle();
		System.out.println(Title); 	}

	@Test
	public void gmailtitle() {
		boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(a); 	}

	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
}
