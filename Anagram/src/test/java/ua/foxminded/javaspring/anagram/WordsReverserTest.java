package ua.foxminded.javaspring.anagram;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WordsReverserTest {

    Reverser rev = Mockito.mock(Reverser.class);

    @Test
    void reverse_shouldReturnNull_whenInputNull() {
        when(rev.reverse(null)).thenReturn(null);
        assertEquals(null, rev.reverse(null));
    }

    @Test
    void reverse_shouldReturnEmptyString_whenInputEmptyString() {
        when(rev.reverse("")).thenReturn("");
        assertEquals("", rev.reverse(""));
    }

    @Test
    void reverse_shouldReturnSingleSpace_whenInputSingleSpace() {
        when(rev.reverse(" ")).thenReturn(" ");
        assertEquals(" ", rev.reverse(" "));
    }

    @Test
    void reverse_shouldReturnSameSpaces_whenInputSeveralSpaces() {
        when(rev.reverse("   ")).thenReturn("   ");
        assertEquals("   ", rev.reverse("   "));
    }

    @Test
    void reverse_shouldReturnSameSingleCharacter_whenInputSingleCharacter() {
        when(rev.reverse("a")).thenReturn("a");
        assertEquals("a", rev.reverse("a"));
    }

    @Test
    void reverse_shouldReturnSameLetter_whenInputSameLetter() {
        when(rev.reverse("aaa")).thenReturn("aaa");
        assertEquals("aaa", rev.reverse("aaa"));
    }

    @Test
    void reverse_shouldReturnReversedSameCharacterInLowerAndUpperCases_whenInputSameCharacterInLowerAndUpperCases() {
        when(rev.reverse("aA")).thenReturn("Aa");
        assertEquals("Aa", rev.reverse("aA"));
    }

    @Test
    void reverse_shouldReturnReversedDifferentLetters_whenInputDifferentLetters() {
        when(rev.reverse("abcd")).thenReturn("dcba");
        assertEquals("dcba", rev.reverse("abcd"));
    }

    @Test
    void reverse_shouldReturnSameOnlySymbols_whenInputOnlySymbols() {
        when(rev.reverse("!")).thenReturn("!");
        assertEquals("!", rev.reverse("!"));
    }

    @Test
    void reverse_shouldReturnReversedSameSeveralWords_whenInputSeveralWords() {
        when(rev.reverse("Hello Word")).thenReturn("olleH droW");
        assertEquals("olleH droW", rev.reverse("Hello Word"));
    }
}
