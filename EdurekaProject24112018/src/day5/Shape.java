package day5;

public abstract class Shape {
	
	public double calculateVolume(int len, int height){
		
		double volume;
		
		volume = areaOfBase(len) * height;
		
		return volume;
	}

	public abstract double areaOfBase(int len);
}
