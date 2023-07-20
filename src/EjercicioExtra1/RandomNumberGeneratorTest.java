package EjercicioExtra1;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    private int[] numeros = new int[10];
    private int[] numeros2 = new int[10];

    @BeforeEach
    public void setUp() {

        for (int i = 0; i < 10; i++) {
            numeros[i] = RandomNumberGenerator.generarAleatorio();
        }

        for (int i = 0; i < 10; i++) {
            numeros2[i] = RandomNumberGenerator.generarAleatorio();
        }

    }

    @Test
    void rangoCorrecto() {

        int min = numeros[0], max = numeros[0];

        for (int i = 0; i < 10; i++) {

            if (numeros[i] < min) {
                min = numeros[i];
            }

            if (numeros[i] >  max) {
                max = numeros[i];
            }
        }

        assertTrue(max<=10);
        assertTrue(min>=0);

    }

    @Test
    void numerosDistintos() {

        int aux = numeros[0];
        boolean distinto = false;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] != aux) {
                distinto = true;
            }
        }

        assertTrue(distinto);

    }
}