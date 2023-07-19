package Ejemplo.Entidades;

public class Rectangulo {

    private double lado1, lado2;
    private String color;
    private boolean activo;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.color = "Rojo";
        this.activo = true;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public String getColor() {
        return color;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
