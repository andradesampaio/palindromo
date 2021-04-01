package br.com.impacta.palindromo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testePalindromoSuccess() {
        Palindromo palindromo = new Palindromo();
        boolean result = palindromo.isPalindromo("abba");
        assertEquals(result, true);
    }

}