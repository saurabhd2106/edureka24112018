package day2;

public class DemoEmployee1 {
	
	public static void main(String[] args) {
		Employee mohit= new Employee();
		
		int salary = mohit.calculateSalary2(9000, 700);
		
		System.out.println("Salary of mohit : "+ salary);
		
		//-------------------------------------
		
		Employee divya = new Employee();
		
		divya.salary = 6000;
		divya.bonus = 1000;
		
		int divSalary = divya.calculateSalary3(7000, 400);
		
		System.out.println("Salary of divya : "+ divSalary);
		
		//----------------------------------
		
		Employee namita = new Employee(7200, 600);
		
		namita.calculateSalary();
		
	}

}
