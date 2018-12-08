package day5;

public class DemoShape {

	public static void main(String[] args) {
		
		Cylinder cyl = new Cylinder();
		
		Cuboid cuboid = new Cuboid();
		
		System.out.println(cyl.calculateVolume(10, 5));
		System.out.println(cuboid.calculateVolume(10, 5));
	}

}
