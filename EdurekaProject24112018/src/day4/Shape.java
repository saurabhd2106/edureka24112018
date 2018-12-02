package day4;

public class Shape {

	public double calculateArea(int len, int wid) {

		double area = len * wid;
		return area;
	}
	
	public double calculateArea(int side) {

		double area = side * side;
		return area;
	}
	
	public double calculateArea(double radius) {

		double area = Math.PI * radius * radius;
		return area;
	}

}
