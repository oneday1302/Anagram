package ua.foxmainded.javaspring.anagram;

public class Anagram
{
	public static void main(String[] args)
	{
		System.out.println(reverse("Hello,"));
	}

	public static String reverse(String word)
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
}
