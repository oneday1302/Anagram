package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;

public class WordsReverser implements Reverser {

    private Reverser reverse;

    public WordsReverser(Reverser reverse) {
        this.reverse = reverse;
    }

    @Override
    public String reverse(String value) {
        StringJoiner outputString = new StringJoiner(" ");
        for (String word : value.split(" ")) {
            outputString.add(reverse.reverse(word));
        }
        return outputString.toString();
    }
}
