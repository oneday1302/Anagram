package ua.foxminded.javaspring.anagram;

public class ReverseOnlyLetters implements Reverse {

    private String reverseWord(String word) {
        StringBuilder reverseLetters = new StringBuilder(word.replaceAll("[^A-Za-z]+", "")).reverse();
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (!Character.isLetter(letters[i])) {
                reverseLetters.insert(i, letters[i]);
            }
        }
        return reverseLetters.toString();
    }

    @Override
    public String reverse(String value) {
        return reverseWord(value);
    }
}
