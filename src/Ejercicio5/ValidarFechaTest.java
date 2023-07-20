package Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarFechaTest {

    @Test
    void diaInvalido() {
        assertFalse(ValidarFecha.fechaValida(50, 1, 2000));
    }

    @Test
    void diaInvalido2() {
        assertFalse(ValidarFecha.fechaValida(31, 11, 2000));
    }

    @Test
    void mesInvalido() {
        assertFalse(ValidarFecha.fechaValida(1, 15, 2000));
    }

    @Test
    void anioBisiesto() {
        assertTrue(ValidarFecha.fechaValida(29, 2, 1992));
    }

    @Test
    void anioNoBisiesto() {
        assertFalse(ValidarFecha.fechaValida(29, 2, 1993));
    }
}