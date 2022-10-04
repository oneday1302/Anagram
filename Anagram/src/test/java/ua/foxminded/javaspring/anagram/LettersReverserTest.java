package ua.foxminded.javaspring.anagram;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LettersReverserTest {

    LettersReverser lettersReverser = new LettersReverser();

    @Test
    void reverse_shouldReturnIllegalArgumentException_whenInputNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            lettersReverser.reverse(null);
        });
    }

    @Test
    void reverse_shouldReturnEmptyString_whenInputEmptyString() {
        assertEquals("", lettersReverser.reverse(""));
    }

    @Test
    void reverse_shouldReturnSingleSpace_whenInputSingleSpace() {
        assertEquals(" ", lettersReverser.reverse(" "));
    }

    @Test
    void reverse_shouldReturnSameSpaces_whenInputSeveralSpaces() {
        assertEquals("   ", lettersReverser.reverse("   "));
    }

    @Test
    void reverse_shouldReturnSameSingleCharacter_whenInputSingleCharacter() {
        assertEquals("a", lettersReverser.reverse("a"));
    }

    @Test
    void reverse_shouldReturnSameLetter_whenInputSameLetter() {
        assertEquals("aaa", lettersReverser.reverse("aaa"));
    }

    @Test
    void reverse_shouldReturnReversedSameCharacterInLowerAndUpperCases_whenInputSameCharacterInLowerAndUpperCases() {
        assertEquals("Aa", lettersReverser.reverse("aA"));
    }

    @Test
    void reverse_shouldReturnReversedDifferentLetters_whenInputDifferentLetters() {
        assertEquals("dcba", lettersReverser.reverse("abcd"));
    }

    @Test
    void reverse_shouldReturnSameOnlySymbols_whenInputOnlySymbols() {
        assertEquals("!", lettersReverser.reverse("!"));
    }

    @Test
    void reverse_shouldReturnReversedString_whenInputString() {
        assertEquals("droWo lleH", lettersReverser.reverse("Hello Word"));
    }
}
