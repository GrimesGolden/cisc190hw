public class GeometricTest
{
	public static void main(String[] args)
	{
		Point point1 = new Point(7, 3);
		Point point2 = new Point(15, 5);
		Circle circle1 = new Circle(point1, 4.5);

		System.out.println(circle1);

		circle1.setRadius(8.0);

		System.out.println(circle1.getPerimeter());

		System.out.println(circle1.getArea());

		Circle circle2 = new Circle(point2, 4.1);

	}
}