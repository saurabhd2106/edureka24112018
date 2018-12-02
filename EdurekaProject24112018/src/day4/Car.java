package day4;

public class Car extends Machine{
	

	public Car() {
		System.out.println("Car constructor");
		
		engineSize = 5000;
	}
	
	public void restart(){
		
		start();
		System.out.println("Restart method from Car class");
	}
	
	public void open(){
		System.out.println("Open method from Car class");
	}


}
