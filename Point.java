public class Point   
{
	private int x;
	private int y;

	public static void main(String[] args)
	{
		Point point1 = new Point(3, 3);
		System.out.println(point1.getX());
		System.out.println(point1.getY());

		System.out.println(point1.equals());
	}

	public Point()
	// No param constructor.
	{
		x = 0;
		y = 0;
	}

	public Point(int val1, int val2)
	// Two param constructor.
	{
		x = val1;
		y = val2;
	}

	public Point(Point p)
	// Copy  constructor.
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
	{
		String message = "Point: |X at " + this.x + "|  |Y at " + this.y + "|";
		return message; 
	}
	public boolean equals()
	// Verify instance variable equality. 
	{
		if (this.x == this.y)
		{
			return true;
		}

		else
		{
			return false; 
		}
	}
}