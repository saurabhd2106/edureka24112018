package day2;


public class Employee {
	
	public Employee() {
		salary = 3000;
		bonus = 500;
		
		System.out.println("I am a constructor...");
	}
	
	public Employee(int salary, int bonus){
		this.salary = salary;
		this.bonus = bonus;
	}

	int salary;
	int bonus;

	void calculateSalary() {
		int totalSalary = salary + bonus;

		System.out.println("Total salary : " + totalSalary);
	}

	int calculateSalary1() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

	int calculateSalary2(int sal, int bon) {
		int totalSalary = sal + bon;

		return totalSalary;
	}

	int calculateSalary3(int salary, int bonus) {
		int totalSalary = this.salary + this.bonus;

		return totalSalary;
	}

}
