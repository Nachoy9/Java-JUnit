package Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertidorTempTest {

    //20 grados Celsius son equivalentes a 68 grados Fahrenheit.
    @Test
    void celFar() {
        assertEquals(68,ConvertidorTemp.celFar(20));
    }

    //68 grados Fahrenheit son equivalentes a 20 grados Celsius.
    @Test
    void farCel() {
        assertEquals(20,ConvertidorTemp.farCel(68));
    }

    //20 grados Celsius son equivalentes a 293.15 grados Kelvin.
    @Test
    void celKel() {
        assertEquals(293.15,ConvertidorTemp.celKel(20));
    }

    //293.15 grados Kelvin son equivalentes a 20 grados Celsius.
    @Test
    void kelCel() {
        assertEquals(20,ConvertidorTemp.kelCel(293.15));
    }

    //293.15 grados Kelvin son equivalentes a 68 grados Fahrenheit.
    @Test
    void farKel() {
        assertEquals(68,ConvertidorTemp.kelFar(293.15));
    }

    //68 grados Fahrenheit son equivalentes a 293.15 grados Kelvin.
    @Test
    void kelFar() {
        assertEquals(293.15,ConvertidorTemp.farKel(68));
    }
}