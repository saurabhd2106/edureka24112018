package day4;

public class DemoShape {

	public static void main(String[] args) {

		Shape cir = new Shape();
		
		System.out.println(cir.calculateArea(90.4));

		Shape sqr = new Shape();
		
		System.out.println(sqr.calculateArea(10));
		
		Shape rec = new Shape();
		
		System.out.println(rec.calculateArea(10, 5));
		
		
	}

}
