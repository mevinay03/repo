package solution;

public class Cube {
	
	
	public static double totalArea(double a) {
		double result = 6 * Square.area(a);
		return result;
	}
	
	public static double lateralArea(double a) {
		double result = 4 * Square.area(a);
		return result;
	}
	
	public static double volume(double a) {
		double result = Square.area(a) * a;
		return result;
	}

	public static double convert(double V, double r) {
		double result = V /volume(r);
		return result;
	}
	
	public static double aSideFromLateralArea(double LateralArea, double h) {
		double result = LateralArea/(h);
		return result;
	}

	
	public static double aSideFromTotalArea(double TotalArea, double h) {
		double result = TotalArea/(h);
		return result;
	}
	
	public static double aSideFromVolume(double Volume, double h) {
		double result = Volume/(h);
		return result;
	}
	
}
