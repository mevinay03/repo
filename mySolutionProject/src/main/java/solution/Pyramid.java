package solution;

public class Pyramid {
	
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
	public static double aSideFromLateralArea(double LateralArea, double h) {
		double result = LateralArea/(h);
		return result;
	}
	public static double heightFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	
	public static double aSideFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double heightFromVolume(double Volume, double r) {
		double result = Volume/(r);
		return result;
	}
	
	public static double aSideFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	
}
