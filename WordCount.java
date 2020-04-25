public class WordCount
{
	public static void main(String[] args)
	{
		String sentence = "There are seven words in this sentence!";

		System.out.println(WordCount.wordCount(sentence));
	}

	public static int wordCount(String sentence)
	{
		String[] tokens = sentence.split(" "); 
		
		return tokens.length;

	}
}


