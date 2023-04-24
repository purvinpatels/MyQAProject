package sel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNew {

	// step 1 system.setproperty(location of driver)
	// step 2 get URL
	// step 3 Perform action on particular element
	// step 4 close browser
	
	//STLC Work Process - Write test cases - execute test cases - log defect
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
		
	
	@Test(priority=1) 
	public void Writetestcases() {
		System.out.println("First Write Test Cases");
	}
	
	@Test(priority=2) 
	public void executetestcases() { 
		System.out.println("Then Execute test cases");
	}
	@Test(priority=3) 
	public void Defect() { 
		System.out.println("Log Defect");
	}
	@AfterMethod //Close browser
	public void aftermethod() { 
		System.out.println("After Method");
	}
	@AfterClass // Only once after all test cases are executed
	public void afterclass() { 
		System.out.println("After Class");
	}
	@AfterTest // This will also be executed once but afterclass condition if its available or it will be series
	public void aftertest() { 
		System.out.println("After Test");
	}
	@AfterSuite //At last when all other annotations have been executed according to sequences
	public void aftersuite() { 
		System.out.println("After Suite");
	}
	
	
}
