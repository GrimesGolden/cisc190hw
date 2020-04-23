import java.lang.Math;

public class Circle
{
	private Point center;
	private double radius;

	public Circle()
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
	{
		Point centerCopy = new Point(this.center);
		return centerCopy;
	}

	public String toString()
	{
		String message = "Circle: \n" + "With center: " + this.center +
			" \nand radius: " + this.radius;

		return message;

	}

	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea()
	{
		double area = Math.PI * (radius * radius);
		return area;
	}



}