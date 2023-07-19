/*
Como usar Junit en IntelliJ https://www.jetbrains.com/help/idea/junit.html#intellij
*/

package Ejemplo.Principal;

import java.util.Scanner;
import Ejemplo.Servicios.RectanguloServicio;

public class Principal {

    public static void main(String[] args) {

        double lado1, lado2;

        RectanguloServicio recSer = new RectanguloServicio();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el lado 1 del rectangulo (en cm):");
        lado1 = input.nextDouble();
        System.out.println("Ingrese el lado 2 del rectangulo (en cm):");
        lado2 = input.nextDouble();

        recSer.crearRectangulo(lado1, lado2);

        System.out.println("El area del rectangulo es " + recSer.calcularArea() + " cm2");
    }
}
