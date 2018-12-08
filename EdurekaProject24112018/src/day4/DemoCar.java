package day4;

public class DemoCar {

	public static void main(String[] args) {
		
		Machine mac = new Machine();
		
		mac.start();
		mac.stop();
		mac.numberOfSeats = 78;
		
		mac.engineSize = 2000;
		
		System.out.println(mac.engineSize);
		System.out.println("--------------------------------");
		Car alto = new Car();
		
		alto.start();
		alto.stop();
		alto.restart();
		alto.open();
		
		System.out.println("--------------------------------");
		
		Machine bmw = new Car();
		
		bmw.start();
		bmw.stop();
		
		
		System.out.println(bmw.engineSize);
		

	}

}
