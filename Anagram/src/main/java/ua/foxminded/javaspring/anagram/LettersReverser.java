package ua.foxminded.javaspring.anagram;

public class LettersReverser implements Reverser {

    @Override
    public String reverse(String value) {
        if (value == null) {
            throw new IllegalArgumentException("param cannot be null.");
        }

        StringBuilder reverseLetters = new StringBuilder(value.replaceAll("[^A-Za-z]+", "")).reverse();
        char[] letters = value.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (!Character.isLetter(letters[i])) {
                reverseLetters.insert(i, letters[i]);
            }
        }
        return reverseLetters.toString();
    }
}
