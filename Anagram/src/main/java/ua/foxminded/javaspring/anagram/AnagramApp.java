package ua.foxminded.javaspring.anagram;

import java.util.Scanner;

public class AnagramApp {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        scanner.close();

        WordsReverser wordsReverser = new WordsReverser(new LettersReverser());

        System.out.print("Reverse string: ");
        System.out.println(wordsReverser.reverse(string));
    }
}
