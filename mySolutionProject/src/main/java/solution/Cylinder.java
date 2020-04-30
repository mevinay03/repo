package solution;

public class Cylinder {
	
	
	public static double totalArea(double r, double h) {
		double area1 = lateralArea(r,h);
		double area2 = Circle.area(r) * 2;
		double result = area1 + area2;
		return result;
	}
	
	public static double lateralArea(double r,double h) {
		double result = Circle.parameter(r) * h ;
		return result;
	}
	
	public static double volume(double r,double h) {
		double result = 0.333  * Circle.area(r) * h;
		return result;
	}
	
	public static double convert(double V, double r,double h) {
		double result = V /volume(r,h);
		return result;
	}
	
	public static double radiusFromLateralArea(double LateralArea, double h) {
		double result = LateralArea/(h);
		return result;
	}
	
	public static double heightFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	
	public static double radiusFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double heightFromVolume(double Volume, double r) {
		double result = Volume/(r);
		return result;
	}
	
	public static double radiusFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	
	
}
