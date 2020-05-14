package solution;

public class Cone {
	
	public static double slantHeightFromRadiusHeight(double r,double h) {
		double result = Math.sqrt(r*r+h*h);
		return result;
	}
	
	public static double radiusOrHeightFromSlantHeight(double r,double h) {
		double result = r>h? Math.sqrt(r*r+h*h):Math.sqrt(h*h-r*r);
		return result;
	}
	
	public static double totalArea(double r, double l) {
		double area1 = Circle.area(r);
		double area2 = lateralArea(r,l);
		double result = area1 + area2;
		return result;
	}
	
	public static double lateralArea(double r,double l) {
		double result = Circle.parameter(r) * l;
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
	
	public static double radiusFromLateralArea(double LateralArea, double l) {
		// LA = pi r l 
		double result = LateralArea/(l);
		return result;
	}
	
	public static double radiusFromTotalArea(double TotalArea, double l) {
		// TA = pi r sqr + pi r l
		double result = TotalArea/l;
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
