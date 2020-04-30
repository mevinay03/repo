package solution;

public class Sphere {
	
	public static double totalArea(double r) {
		double result = 4 * Circle.area(r);
		return result;
	}
	
	public static double volume(double r) {
		double result = 4/3  * Circle.area(r) * r;
		return result;
	}
	
	public static double convert(double V, double r) {
		double result = V /volume(r);
		return result;
	}
	
	public static double radiusFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double radiusFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	
}
