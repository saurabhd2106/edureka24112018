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

	}

}
