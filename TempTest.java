public class TempTest
{
	public static void main(String[] args)
		throws TemperatureTooLow
	{	
		// Create instance of fridge class.
		Fridge fridge = new Fridge();

		try
		{
			// Call setTemp() to 35 and then print tempNormal() result.
			fridge.setTemp(35);
			System.out.println(fridge.tempNormal());

			// Call setTemp() to 8 and print tempNormal()
			fridge.setTemp(8);
			System.out.println(fridge.tempNormal());
		}

		catch (TemperatureTooLow e)
		{
			System.out.println(e);
		}
	}
}