package solution;

public class SolutionMain {

	public static void main(String[] args) {
		
		System.out.println("Circle ::	 parameter :"+Circle.parameter(10)+" Area "+Circle.area(10));
		System.out.println("Square ::	 parameter :"+Square.parameter(10)+" Area "+Square.area(10));
		System.out.println("Rectangle ::	 parameter :"+Rectangle.parameter(10,10)+" Area "+Rectangle.area(10,10));
		System.out.println("Triangle ::	 parameter :"+Triangle.parameter(10,10,10)+" Area "+Triangle.area(10,10));
		
		System.out.println("Cone ::		 Area :"+Cone.totalArea(10, 10)+" Volume "+Cone.volume(10, 10));
		System.out.println("Cube ::		 Area :"+Cube.totalArea(10)+" Volume "+Cube.volume(10));
		System.out.println("Cuboid ::	 Area :"+Cuboid.totalArea(10, 10,10)+" Volume "+Cuboid.volume(10, 10,10));
		System.out.println("Cylinder ::	 Area :"+Cylinder.totalArea(10, 10)+" Volume "+Cylinder.volume(10, 10));
		System.out.println("Pyramid ::	 Area :"+Pyramid.totalArea(10, 10)+" Volume "+Pyramid.volume(10, 10));
		System.out.println("Sphere ::	 Area :"+Sphere.totalArea(10)+" Volume "+Sphere.volume(10));
		
		}

}
