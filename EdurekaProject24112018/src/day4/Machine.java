package day4;

public class Machine {

	int engineSize;
	protected int numberOfSeats;
	
	
	private int numberOfwheels;

	public Machine() {
		System.out.println("Machine contructor");

		engineSize = 1000;
		numberOfwheels =4;
	}

	public void start() {
		System.out.println("Start method from Machine");
	}

	public void stop() {
		System.out.println("Stop method from Machine");
	}

}
