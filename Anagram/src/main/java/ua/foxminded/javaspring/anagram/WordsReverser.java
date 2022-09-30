package ua.foxminded.javaspring.anagram;

import java.util.StringJoiner;
import org.junit.platform.commons.util.StringUtils;

public class WordsReverser implements Reverser {

    private Reverser reverser;

    public WordsReverser(Reverser reverse) {
        this.reverser = reverse;
    }

    @Override
    public String reverse(String value) {
        if (value == null) {
            return null;
        }

        if (value.isEmpty()) {
            return value;
        }

        if (StringUtils.isBlank(value)) {
            return value;
        }

        StringJoiner outputString = new StringJoiner(" ");
        for (String word : value.split(" ")) {
            outputString.add(reverser.reverse(word));
        }
        return outputString.toString();
    }
}
