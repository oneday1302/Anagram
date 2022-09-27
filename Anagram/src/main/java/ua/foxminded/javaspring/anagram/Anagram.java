package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;

public class Anagram {
    static private String reverseWord(String word) {
        StringBuilder reverseWord = new StringBuilder(word.replaceAll("[^A-Za-z]+", "")).reverse();
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (!Character.isLetter(letters[i])) {
                reverseWord.insert(i, letters[i]);
            }
        }
        return reverseWord.toString();
    }

    static public String reverseString(String string) {
        StringJoiner outputString = new StringJoiner(" ");
        for (String word : string.split(" ")) {
            outputString.add(reverseWord(word));
        }
        return outputString.toString();
    }
}
