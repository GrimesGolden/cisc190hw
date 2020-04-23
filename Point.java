public class Point   
{	
	// Write two private instance variables...
	// An x coord of type int and a y coord of type int.
	private int x;
	private int y;
	

	public static void main(String[] args)
	{
		Point point1 = new Point(3, 3);
		System.out.println(point1.getX());
		System.out.println(point1.getY());
	}

	public Point()
	// No param constructor.
	// Default constructor sets instance variables to zero.
	{
		x = 0;
		y = 0;
	}

	public Point(int val1, int val2)
	// Two param constructor.
	// Sets x and y coordinates.
	{
		x = val1;
		y = val2;
	}

	public Point(Point p)
	// Copy constructor.
	{
		this.x = p.x;
		this.y = p.y;
	}

	public void setX(int val)
	// Setters
	{
		x = val;
	}

	public void setY(int val)
	{
		y = val;
	}

	public int getX()
	// Getters
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public String toString()
	// toString method prints string as required.
	{
		String message = "(" + this.x + "," + this.y + ")";
		return message; 
	}
	public boolean equals(Point p)
	// Verify if two points are equal.  
	{
		if (this.x == p.x && this.y == p.y)
		{
			return true;
		}

		else
		{
			return false; 
		}
	}
}