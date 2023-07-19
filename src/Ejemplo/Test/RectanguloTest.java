package Ejemplo.Test;

import Ejemplo.Entidades.Rectangulo;
import Ejemplo.Servicios.RectanguloServicio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    RectanguloServicio recSer;

    @Before
    public void setup() {
        recSer = new RectanguloServicio();
    }

    @Test
    public void deberiaInicializarConColorRojo() {
        assertEquals("Rojo", new Rectangulo(1,1).getColor());
    }

    @Test
    public void deberiaCalcularArea() {
        recSer.crearRectangulo(10,10);
        assertEquals(100, recSer.calcularArea());
    }

}