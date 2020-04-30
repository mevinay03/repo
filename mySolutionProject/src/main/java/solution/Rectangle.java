package solution;

public class Rectangle {
	
	public static double parameter(double l,double b) {
		double result = 2 * (l+b);
		return result;
	}
	
	public static double area(double l, double b) {
		double result = l * b;
		return result;
	}
	
	public static double sideFromPerimeter(double perimeter, double aSide) {
		double result = (perimeter/2)-aSide;
		return result;
	}
	
	public static double sideFromArea(double Area, double aSide) {
		double result = Area/aSide;
		return result;
	}
	
}
