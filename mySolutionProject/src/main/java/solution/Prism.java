package solution;

public class Prism {

	public static double pi = 3.14159;
	
	public static double totalArea(double a, double h) {
		double area1 = lateralArea(a,h);
		double area2 = Square.area(a);
		double result = area1 + area2;
		return result;
	}
	
	public static double lateralArea(double a,double h) {
		double result = Square.parameter(a) * h ;
		return result;
	}
	
	public static double volume(double a, double h) {
		double result = 0.333  * Square.area(a) * h;
		return result;
	}
	
	public static double convert(double V, double a, double h) {
		double result = V /volume(a,h);
		return result;
	}
}
