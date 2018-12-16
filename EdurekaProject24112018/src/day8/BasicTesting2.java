package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTesting2 {
	
	@Test(priority=0)
	public void testcase1(){
		System.out.println("Class 2 Test case 1");
	}
	
	@Test(priority=1000, groups={"Sanity"})
	public void testcase4(){
		System.out.println("Class 2 Test case 4");
	}
	
	
	@Test(priority=2000, groups={"Sanity", "Regression"})
	public void testcase2(){
		System.out.println("Class 2 Test case 2");
	}
	
	
	@Test(priority=3000)
	public void testcase3(){
		System.out.println("Class 2 Test case 3");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeATestcase(){
		System.out.println("Before a Class 2 Test case");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterATestcase(){
		System.out.println("After a Class 2 Test case");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("Class 2 First  method to be executed when this class loads");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("Class 2 Last method of this class");
	}

}
