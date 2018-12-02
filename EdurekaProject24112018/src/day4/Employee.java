package day4;

public class Employee {

	private int salary;

	private int bonus;

	public void setSalary(int salary) {

		if (salary <= 0) {
			System.out.println("Invalid Salary");
		} else {
			this.salary = salary;
		}
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalary(){
		return salary;
	}
	
	public int getBonus() {
		return bonus;
	}

	public int calculateSalary() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

}
