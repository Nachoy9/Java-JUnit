/*
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
*/

package Ejercicio2;

public class ConvertidorTemp {

    public static double celFar(double tCel) {
        return (tCel*9/5) + 32;
    }

    public static double farCel(double tFar) {
        return (tFar - 32) * 5/9;
    }

    public static double celKel(double tCel) {
        return tCel + 273.15;
    }

    public static double kelCel(double tKel) {
        return tKel - 273.15;
    }

    public static double farKel(double tFar) {
        return celKel(farCel(tFar));
    }

    public static double kelFar(double tKel) {
        return celFar(kelCel(tKel));
    }


}
