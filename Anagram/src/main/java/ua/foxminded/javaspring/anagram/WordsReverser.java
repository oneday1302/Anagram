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

        StringJoiner outputString = new StringJoiner(" ");
        for (String word : value.split(" ", -1)) {
            outputString.add(reverser.reverse(word));
        }
        return outputString.toString();
    }
}
