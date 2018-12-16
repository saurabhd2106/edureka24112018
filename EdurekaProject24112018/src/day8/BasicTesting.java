package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTesting {
	
	@Test(priority=0)
	public void testcase1(){
		System.out.println("Test case 1");
	}
	
	@Test(priority=1000)
	public void testcase4(){
		System.out.println("Test case 4");
	}
	
	
	@Test(priority=2000, groups={"Sanity"})
	public void testcase2(){
		System.out.println("Test case 2");
	}
	
	
	@Test(priority=3000, groups={"Sanity"})
	public void testcase3(){
		System.out.println("Test case 3");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeATestcase(){
		System.out.println("Before a test case");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterATestcase(){
		System.out.println("After a test case");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("First method to be executed when this class loads");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("Last method of this class");
	}
	
	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testcase7(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 12;
		arr[2] = 81;
		arr[3] = 18;
		arr[4] = 67;

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		
	
	}

}
