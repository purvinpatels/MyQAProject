package sel;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn {

	@BeforeMethod 
	public void precondition() {
	System.out.println("Open Browser"); }
			
	
	@Test
	public void validfname() {
		System.out.println("Enter 4-10");}
	@Test
	public void invalidfname() {
		System.out.println("Less than 4");}
	
	@AfterMethod
	public void postcondition() {
		System.out.println("Close Browser");}
	
	}
