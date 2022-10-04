package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;

public class WordsReverser implements Reverser {

    private Reverser reverser;

    public WordsReverser(Reverser reverse) {
        this.reverser = reverse;
    }

    @Override
    public String reverse(String value) {
        if (value == null) {
            throw new IllegalArgumentException("param cannot be null.");
        }
        
        StringJoiner words = new StringJoiner("");
        for (String word : value.split(" ")) {
            if (!word.isEmpty()) {
                words.add(reverser.reverse(word));
            }
        }
        
        StringBuilder outputString = new StringBuilder(words.toString());
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ' ') {
                outputString.insert(i, value.charAt(i));
            }
        }
        return outputString.toString();
    }
}
