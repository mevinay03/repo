package solution;

public class Circle {
	
	public static double pi = 3.14159;
	
	public static double parameter(double r) {
		double result = 2 * pi * r;
		return result;
	}
	
	public static double area(double r) {
		double result = pi * r * r;
		return result;
	}
	
	public static double radiusFromPerimeter(double perimeter) {
		double result = perimeter/(2*pi);
		return result;
	}
	
	public static double radiusFromArea(double Area) {
		double result = Math.sqrt(Area/pi);
		return result;
	}
	
}
