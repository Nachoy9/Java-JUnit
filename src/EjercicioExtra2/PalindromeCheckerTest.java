package EjercicioExtra2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void esPalindromo() {

        String palabra = "holaloh";
        assertTrue(PalindromeChecker.esPalindromo(palabra));

    }

    @Test
    void esPalindromo2() {

        String palabra = "abccba";
        assertTrue(PalindromeChecker.esPalindromo(palabra));

    }

    @Test
    void noEsPalindromo() {

        String palabra = "hola";
        assertFalse(PalindromeChecker.esPalindromo(palabra));

    }

    @Test
    void noEsPalindromo2() {

        String palabra = "holas";
        assertFalse(PalindromeChecker.esPalindromo(palabra));

    }
}