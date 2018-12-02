package day4;

public class Machine {

	int engineSize;

	public Machine() {
		System.out.println("Machine contructor");

		engineSize = 1000;
	}

	public void start() {
		System.out.println("Start method from Machine");
	}

	public void stop() {
		System.out.println("Stop method from Machine");
	}

}
