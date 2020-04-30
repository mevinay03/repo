package solution;

public class Cuboid {
	
	public static double totalArea(double l,double b , double h) {
		double result = 2 * (Rectangle.area(l,b)+Rectangle.area(b, h)+Rectangle.area(l, h));
		return result;
	}
	
	public static double lateralArea(double l, double b, double h) {
		double result = 2 * (Rectangle.area(l, b)+Rectangle.area(b, h));
		return result;
	}
	
	public static double volume(double l, double b, double h) {
		double result = Rectangle.area(l, b) * h;
		return result;
	}

	public static double convert(double V, double l,double b, double h) {
		double result = V /volume(l,b,h);
		return result;
	}
	
	public static double lengthFromLateralArea(double LateralArea, double h) {
		double result = LateralArea/(h);
		return result;
	}
	public static double heightFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	public static double widthFromLateralArea(double LateralArea, double r) {
		double result = LateralArea/(r);
		return result;
	}
	
	public static double lengthFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	public static double heightFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	public static double widthFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double heightFromVolume(double Volume, double r) {
		double result = Volume/(r);
		return result;
	}
	
	public static double lengthFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	public static double widthFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	
}
