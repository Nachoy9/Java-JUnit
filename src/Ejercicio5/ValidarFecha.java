/*
Crea una clase DateValidator que valide la corrección de una fecha (por ejemplo, si es una
fecha válida en el calendario gregoriano).
Escribe pruebas unitarias para asegurarte de que el validador de fechas detecte correctamente
fechas válidas e inválidas, teniendo en cuenta diferentes casos, como años bisiestos.
*/

package Ejercicio5;

public class ValidarFecha {

    public static boolean fechaValida(int dia, int mes, int anio) {

        boolean bisiesto = false;

        // Dia y mes no pueden ser 0, año tiene que ser mayor o igual a 0
        if (dia < 1 || mes < 1 || anio < 0) {
            return false;
        }

        // El mes no puede ser mayor a 12
        if (mes > 12) {
            return false;
        }

        // Verifico que el año sea (o no) bisiesto
        if ((anio%4 == 0 && anio%100 != 0) || (anio%100 == 0 && anio%400 == 0)) {
            bisiesto = true;
        }

        // Verifico que los dias sean los correctos para cada mes
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 31) {
                    return false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    return false;
                }
                break;
            case 2:
                if (bisiesto && dia > 29) {
                    return false;
                } else if (!bisiesto && dia > 28) {
                    return false;
                }
                break;
            default:
                return false;
        }

        return true;
    }
}
