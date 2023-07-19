package Ejemplo.Servicios;

import Ejemplo.Entidades.Rectangulo;

public class RectanguloServicio {

    private static Rectangulo rec;

    public void crearRectangulo(double lado1, double lado2) {
        rec = new Rectangulo(lado1, lado2);
    }

    public double calcularArea() {
        return rec.getLado1()*rec.getLado2();
    }

}
