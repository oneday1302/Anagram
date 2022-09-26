package ua.foxmainded.javaspring.anagram;

import java.util.Scanner;

public class AnagramApp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scanner.nextLine();
		scanner.close();

		System.out.print("Reverse string: ");
		System.out.print(Anagram.reverseString(string));
	}
}
