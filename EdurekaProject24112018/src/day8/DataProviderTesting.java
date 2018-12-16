package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	@Test(dataProvider="getData")
	public void printTestData(String userId, String userPassword){
		
		System.out.println("User Id : "+ userId +"and password : "+ userPassword);
	}
	
	@Test(dataProvider="getDiffData")
	public void printTestData(String userId, int Id){
		
		System.out.println("User Id : "+ userId +"and Id : "+ Id);
	}
	
	@DataProvider
	public String[][] getData(){
		String[][] data = new String[3][2];
		
		data[0][0] = "saurabh.d2106@gmail.com";
		data[0][1] = "Pro@1234";
		
		data[1][0] = "saurabh.d2104@gmail.com";
		data[1][1] = "Pro@123";
		
		data[2][0] = "gaurav.d2104@gmail.com";
		data[2][1] = "Bro@123";
		
		return data;
	}
	
	@DataProvider
	public Object[][] getDiffData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "saurabh.d2106@gmail.com";
		data[0][1] = 4465132;
		
		data[1][0] = "saurabh.d2104@gmail.com";
		data[1][1] = 44657878;
		
		data[2][0] = "gaurav.d2104@gmail.com";
		data[2][1] = 214569;
		
		return data;
	}


}
