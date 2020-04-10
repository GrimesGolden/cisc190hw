class CopyArray
{
	public static void main(String[] args)
	{
		double[] test = {1.0, 2.5, 3.0, 3.1, 3.2, 3.3, 4.0}; // Declare and initalize test array
		double[] copy = CopyArray.makeCopy(test); // Initialize copy array as it returns from the copyArray method. 
      
		System.out.println(test); // Prove that they are both unique arrays in memory. 
      System.out.println(copy);
      
      System.out.println("TEST" + " COPY");
      
      for(int i = 0; i<copy.length; i++)
      {
         System.out.println(test[i] + " " + copy[i]); // Itirate through both arrays and print their contents.
                                                      // Note that they are equal. Therefore makeCopy() method works as intended. 
      }
	}
   

	public static double[] makeCopy(double[] originalCopy)
	{
		double[] newCopy = new double[originalCopy.length]; // Intialize and decalre new double array equal in length to originalCopy double[] parameter.

		for (int i=0; i<originalCopy.length; i++) // Itirate through the length of the original array.
		{
			newCopy[i] = originalCopy[i]; // For each item in the orginal array, new copy initializes an identical item. 
		}

		return newCopy; // Return that new array.
	}
}