package ua.foxmainded.javaspring.anagram;

public class Anagram
{
	public static String reverseWord(String word)
	{
		String reverseWord = new StringBuilder(word.replaceAll("[^A-Za-z]+", "")).reverse().toString();
		StringBuffer reverseWordBuffer = new StringBuffer(reverseWord);
		char[] letters = word.toCharArray();

		for (int i = 0; i < letters.length; i++)
		{
			if (!Character.isLetter(letters[i]))
			{
				reverseWordBuffer.insert(i, letters[i]);
			}
		}
		reverseWord = reverseWordBuffer.toString();
		return reverseWord;
	}

	public static String reverseString(String string)
	{
		String[] inputWords = string.split(" ");
		String[] outputWords = new String[inputWords.length];

		int i = 0;
		for (String inputWord : inputWords)
		{
			outputWords[i] = reverseWord(inputWord);
			i++;
		}
		return String.join(" ", outputWords);
	}
}
