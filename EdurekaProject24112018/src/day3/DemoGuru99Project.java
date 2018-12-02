package day3;

public class DemoGuru99Project {

	public static void main(String[] args) {
	
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.login("mngr166046", "ugudEpu");
		
		guru.addCustomer();
		
		String customerId  = guru.getCustomerId();
		
		System.out.println("Customer Id : "+ customerId);
		
		guru.addAccount(customerId);
	}

}
