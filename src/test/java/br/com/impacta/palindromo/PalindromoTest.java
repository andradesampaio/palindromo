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
                () -> assertEquals(true, palindromo.isPalindromo("bob")),
                () -> assertEquals(true, palindromo.isPalindromo("Rotator"))
        );   
    }

    
    @Test
    public void testePalindromoFailure() {
        Palindromo palindromo = new Palindromo();
        assertAll(
                () -> assertEquals(false, palindromo.isPalindromo("abbc")),
                () -> assertEquals(false, palindromo.isPalindromo("xyz")),
                () -> assertEquals(false, palindromo.isPalindromo("Wonderful-fool"))
        ); 

    }

}