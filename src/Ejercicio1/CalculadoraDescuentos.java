/*
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
*/

package Ejercicio1;

import java.util.Scanner;

public class CalculadoraDescuentos {

    public static double calcularDescuento(double valor, double descuento) {

        if (descuento >= 100) {
            return 0;
        } else {
            return valor*(1-descuento/100);
        }

    }

}
