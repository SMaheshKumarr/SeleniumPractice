package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void BS() {
		System.out.println("BS Method");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("BT Method");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("BC Method");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("BM Method");
	}
	
	@Test
	public void Test1() {
		System.out.println("T1 Method");
	}
	
	@Test
	public void Test2() {
		System.out.println("T2 Method");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("AM Method");
	}
	
	
	@AfterClass
	public void AC() {
		System.out.println("AC Method");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("AT Method");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("AS Method");
	}

}
