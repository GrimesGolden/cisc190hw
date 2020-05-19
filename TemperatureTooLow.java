public class TemperatureTooLow
			extends Exception
{
	public TemperatureTooLow()
	// Default constructor
	{
		super("Error: Temperature too low");
	}

	public TemperatureTooLow(int currentTemp)
	// Constructor recieves current temp as int
	{
		super(currentTemp + " degrees is too low." 
			+ " Please increase above 10");
	}
}