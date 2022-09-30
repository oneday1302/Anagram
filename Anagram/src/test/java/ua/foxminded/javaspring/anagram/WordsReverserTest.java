package ua.foxminded.javaspring.anagram;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WordsReverserTest {

    Reverser mockReverser = Mockito.mock(Reverser.class);
    WordsReverser wordsReverser = new WordsReverser(mockReverser);

    @Test
    void reverse_shouldReturnNull_whenInputNull() {
        when(mockReverser.reverse(null)).thenReturn(null);
        assertEquals(null, wordsReverser.reverse(null));
    }

    @Test
    void reverse_shouldReturnEmptyString_whenInputEmptyString() {
        when(mockReverser.reverse("")).thenReturn("");
        assertEquals("", wordsReverser.reverse(""));
    }

    @Test
    void reverse_shouldReturnSingleSpace_whenInputSingleSpace() {
        when(mockReverser.reverse(" ")).thenReturn(" ");
        assertEquals(" ", wordsReverser.reverse(" "));
    }

    @Test
    void reverse_shouldReturnSameSpaces_whenInputSeveralSpaces() {
        when(mockReverser.reverse("   ")).thenReturn("   ");
        assertEquals("   ", wordsReverser.reverse("   "));
    }

    @Test
    void reverse_shouldReturnSameSingleCharacter_whenInputSingleCharacter() {
        when(mockReverser.reverse("a")).thenReturn("a");
        assertEquals("a", wordsReverser.reverse("a"));
    }

    @Test
    void reverse_shouldReturnSameLetter_whenInputSameLetter() {
        when(mockReverser.reverse("aaa")).thenReturn("aaa");
        assertEquals("aaa", wordsReverser.reverse("aaa"));
    }

    @Test
    void reverse_shouldReturnReversedSameCharacterInLowerAndUpperCases_whenInputSameCharacterInLowerAndUpperCases() {
        when(mockReverser.reverse("aA")).thenReturn("Aa");
        assertEquals("Aa", wordsReverser.reverse("aA"));
    }

    @Test
    void reverse_shouldReturnReversedDifferentLetters_whenInputDifferentLetters() {
        when(mockReverser.reverse("abcd")).thenReturn("dcba");
        assertEquals("dcba", wordsReverser.reverse("abcd"));
    }

    @Test
    void reverse_shouldReturnSameOnlySymbols_whenInputOnlySymbols() {
        when(mockReverser.reverse("!")).thenReturn("!");
        assertEquals("!", wordsReverser.reverse("!"));
    }

    @Test
    void reverse_shouldReturnReversedSameSeveralWords_whenInputSeveralWords() {
        when(mockReverser.reverse("Hello")).thenReturn("olleH");
        when(mockReverser.reverse("Word")).thenReturn("droW");
        assertEquals("olleH droW", wordsReverser.reverse("Hello Word"));
    }
}
