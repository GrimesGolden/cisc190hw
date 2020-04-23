public class GeometricTest
{
	public static void main(String[] args)
	{
		// Creates an instance of the Circle class called circle1 as follows:
		Circle circle1 = new Circle(new Point(7,3), 4.5);

		// Prints the the circle1 object:
		System.out.println(circle1);

		// Sets the radius of circle1 objects to 8.0:
		circle1.setRadius(8.0);

		// Prints the perimeter and area of the circle1 object:
		System.out.println("\nPerimeter: " + circle1.getPerimeter());

		System.out.println("Area: " + circle1.getArea() + "\n");

		// Creates another instance of the Circle class called circle2 as follows:
		Circle circle2 = new Circle(new Point(15,5), 4.1);

		// Compares the position of circle1 and circle2 objects centers using their equals() methods and if they are not equal, prints “The objects are not at the same location”:

		//Point center1 = circle1.getCenter();
		//Point center2 = circle2.getCenter();

		//System.out.println(center1.equals(center2));

		if (circle1.getCenter().equals(circle2.getCenter()))
		{
			System.out.println("The points are equal.");
		}
		else 
		{
			System.out.println("The objects are not at the same location.");
		}
	}
}