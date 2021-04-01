package br.com.impacta.palindromo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testePalindromoSuccess() {
        Palindromo palindromo = new Palindromo();

        assertAll(
                () -> assertEquals(true, palindromo.isPalindromo("abba")),
                () -> assertEquals(true, palindromo.isPalindromo("bob"))
        );   
    }

    
    @Test
    public void testePalindromoFailure() {
        Palindromo palindromo = new Palindromo();
        boolean result = palindromo.isPalindromo("abbc");
        assertEquals(false, result);
    }

}