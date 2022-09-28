package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;

public class ReverseString {

    private Reverse reverse;

    public ReverseString(Reverse reverse) {
        this.reverse = reverse;
    }

    public String reverse(String string) {
        StringJoiner outputString = new StringJoiner(" ");
        for (String word : string.split(" ")) {
            outputString.add(reverse.reverse(word));
        }
        return outputString.toString();
    }
}
