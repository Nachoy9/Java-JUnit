package Ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    @Test
    void calcularDescuento() {
        assertEquals(0, CalculadoraDescuentos.calcularDescuento(100,150));
        assertEquals(0, CalculadoraDescuentos.calcularDescuento(100,100));
        assertEquals(80, CalculadoraDescuentos.calcularDescuento(100,20));
        assertEquals(100, CalculadoraDescuentos.calcularDescuento(100,0));
    }
}