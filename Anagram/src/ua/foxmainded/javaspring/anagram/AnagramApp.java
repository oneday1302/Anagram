package ua.foxmainded.javaspring.anagram;

import java.util.Scanner;

public class AnagramApp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String word = scanner.nextLine();
		scanner.close();

		System.out.print("reverse word: ");
		System.out.print(Anagram.reverse(word));
	}
}
