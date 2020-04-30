package solution;

public class Convert {

	public static double totalArea(double r, double h) {
		double area1 = Circle.area(r);
		double area2 = lateralArea(r,h);
		double result = area1 + area2;
		return result;
	}
	
	public static double lateralArea(double r,double h) {
		double result = Circle.parameter(r) * h;
		return result;
	}
	
	public static double volume(double r,double h) {
		double result = 1/3  * Circle.area(r) * h;
		return result;
	}
}
