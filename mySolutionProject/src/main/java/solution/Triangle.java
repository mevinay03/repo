package solution;

public class Triangle {

	/*
	 * https://www.mathsisfun.com/algebra/trig-area-triangle-without-right-angle.html
	 * angle is not giving correct value
	 * A = 1/2 bh
	 * Area =  1/2 ab sin C

		Area =  1/2 bc sin A
		
		Area =  1/2 ca sin B
	 */

	public static double twoAdjecentSideAndAngleBetweenThemTriangle(double a, double b , double Angle) {
		System.out.println("Math.sin(Angle) "+Math.abs(Math.sin(Angle)));
		System.out.println("Math.asin(Angle) "+Math.abs(Math.asin(Angle)));
		System.out.println("Math.sinh(Angle)" +Math.abs(Math.sinh(Angle)));
		double result =  0.5 * a * a * Math.abs(Math.sin(Angle));
		System.out.println(result);
		return result;
	}
	
	public static double parameter(double a, double b, double c) {
		double result = a + b + c;
		return result;
	}
	
	public static double area(double b, double h) {
		double result = 0.5 * b * h;
		return result;
	}
	
	public static double areaRightAngle(double b, double h) {
		double result =  0.5 * b * h;
		return result;
	}
	
	public static double areaIsoceles(double b, double h) {
		double result =  0.5 * b * h;
		return result;
	}
	
	public static double areaEquilateral(double a) {
		double result =  0.5 * a * a;
		return result;
	}
	
	public static double areaNonEquals(double a, double b, double c) {
		double s = (a + b + c )/ 2.0;
		//s > a b c
		double result =  Math.sqrt(s * (s-a)* (s-b) * (s-c));
		return result;
	}
	
	
}
