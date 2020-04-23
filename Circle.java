import java.lang.Math;


public class Circle
{
	private Point center;
	private double radius;

	public static void main(String[] args)
	{
 		System.out.println(Math.PI * 1);
	}
	public Circle()
	// Default constructor.
	{
		center = null;
		radius = 0;
	}

	public Circle(Point center, double radius)
	{
		this.center = center;
		this.radius = radius;
	}

	public void setCenter(Point center)
	{
		this.center = center;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public Point getCenter()
	// Returns a copy of the center using copy constructor.
	{
		Point centerCopy = new Point(this.center);
		return centerCopy;
	}

	public double getRadius()
	{
		return this.radius; 
	}

	public String toString()
	{
		String message = "Circle: \n" + "With center: " + this.center +
			" \nand radius: " + this.radius;

		return message;

	}

	public double getPerimeter()
	{
		double perimeter = (Math.PI * 2) * this.radius;
		return perimeter;
	}

	public double getArea()
	{
		double area = Math.PI * (radius * radius);
		return area;
	}

}