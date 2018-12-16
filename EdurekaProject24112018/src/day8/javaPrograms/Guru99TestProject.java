package day8.javaPrograms;

public class Guru99TestProject {
	
	public void invokeBrowser(String browserType) throws Exception{
		if(browserType.equals("chrome")){
			System.out.println("Invoke chrome");
		} else if (browserType.equals("firefox")){
			System.out.println("Invoke Firefox");
		} else {
			throw new Exception("Invalid Browser Type : " + browserType);
		}
	}
	
	public void login() throws ArrayIndexOutOfBoundsException{
		int arr[] = new int[5];
		
		arr[0] = 8;
		arr[1] = 12;
		arr[2] = 81;
		arr[3] = 18;
		arr[4] = 67;

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Login");
	}
	
	public void addUser(){
		System.out.println("Add User");
	}
	
	public void addAccount(){
		System.out.println("Add Account");
	}
	
	public void logout(){
		System.out.println("Logout");
	}

	public void closeBrowser(){
		System.out.println("Close Browser");
	}
}
