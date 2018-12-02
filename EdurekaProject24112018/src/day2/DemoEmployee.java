package day2;

public class DemoEmployee {

	public static void main(String[] args) {

		// Declaring a variable
		Employee saurabh;

		// Instantiation and Initialization
		saurabh = new Employee();

		saurabh.salary = 8000;
		saurabh.bonus = 900;

		saurabh.calculateSalary();

		// ---------------------------------

		Employee gaurav = new Employee();

		gaurav.salary = 9000;

		gaurav.bonus = 800;

		int salary = gaurav.calculateSalary1();
		
		System.out.println("Gaurav's salary : "+ salary);
		
		//--------------------------------------
		
		Employee supriyo = new Employee();
		
		supriyo.salary = -98673;
		supriyo.bonus = -9877;
		
		System.out.println(supriyo.salary);
		supriyo.calculateSalary();

	}

}
