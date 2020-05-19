public class Fridge
{
	private int temperature;

	public void setTemp(int temp)
	{
		temperature = temp;
	}

	public boolean tempNormal()
		throws TemperatureTooLow
	{
		if (temperature < 10)
		{
			throw new TemperatureTooLow(temperature);
		}

		else
		{
			return true;
		}
	}
}