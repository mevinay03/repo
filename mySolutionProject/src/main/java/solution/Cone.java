package solution;

public class Cone {
	
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
	
	public static double convert(double V, double r,double h) {
		double result = V /volume(r,h);
		return result;
	}
	
	public static double radiusFromLateralArea(double LateralArea, double h) {
		double result = LateralArea/(h);
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
	
	public static double heightFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	
	public static double heightFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double heightFromVolume(double Volume, double r) {
		double result = Volume/(r);
		return result;
	}
	
	public static double slantHeightFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	
	public static double slantHeightFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double slantHeightFromVolume(double Volume, double r) {
		double result = Volume/(r);
		return result;
	}
	
	
	
	
}
