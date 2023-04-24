package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browse {

	public static void main(String[] args) {
		// Step 1 Open the Browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		// type URL
		
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.roicians.com/contact-us/");
		
		//Locate first name column
		driver.findElement(By.id("text-77525447616")).sendKeys("Roicians");
		
		
		

	}

}
