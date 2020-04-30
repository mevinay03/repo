package solution;

public class Square {
	
	public static double parameter(double a) {
		double result = 4 * a;
		return result;
	}
	
	public static double area(double a) {
		double result = a * a;
		return result;
	}

	public static double sideFromPerimeter(double perimeter) {
		double result = perimeter/(4);
		return result;
	}
	
	public static double sideFromArea(double Area) {
		double result = Math.sqrt(Area);
		return result;
	}
	
}
