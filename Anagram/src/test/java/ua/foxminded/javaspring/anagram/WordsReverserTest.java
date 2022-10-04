package ua.foxminded.javaspring.anagram;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WordsReverserTest {

    Reverser mockReverser = Mockito.mock(Reverser.class);
    WordsReverser wordsReverser = new WordsReverser(mockReverser);

    @Test
    void reverse_shouldReturnIllegalArgumentException_whenInputNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            wordsReverser.reverse(null);
        });

    }

    @Test
    void reverse_shouldReturnEmptyString_whenInputEmptyString() {
        when(mockReverser.reverse("")).thenReturn("");
        assertEquals("", wordsReverser.reverse(""));
    }

    @Test
    void reverse_shouldReturnSingleSpace_whenInputSingleSpace() {
        when(mockReverser.reverse("")).thenReturn("");
        assertEquals(" ", wordsReverser.reverse(" "));
    }

    @Test
    void reverse_shouldReturnSameSpaces_whenInputSeveralSpaces() {
        when(mockReverser.reverse("")).thenReturn("");
        assertEquals("   ", wordsReverser.reverse("   "));
    }

    @Test
    void reverse_shouldReturnSameSingleCharacter_whenInputSingleCharacter() {
        when(mockReverser.reverse("a")).thenReturn("a");
        assertEquals("a", wordsReverser.reverse("a"));
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
    
    @Test
    void reverse_shouldReturnReversedWordsAndSameSpaces_whenInputSeveralWordsSeveralSpaces() {
        when(mockReverser.reverse("abc")).thenReturn("cba");
        when(mockReverser.reverse("qwe")).thenReturn("ewq");
        when(mockReverser.reverse("as")).thenReturn("sa");
        when(mockReverser.reverse("")).thenReturn("");
        assertEquals("  cba   ewq   sa ", wordsReverser.reverse("  abc   qwe   as "));
    }
}
