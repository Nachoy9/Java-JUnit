/*
Crea una clase SecurePasswordGenerator que genere contraseñas seguras con ciertos
requisitos (por ejemplo, longitud mínima, combinación de caracteres, etc.).
Escribe pruebas unitarias para asegurarte de que el generador de contraseñas seguras
cumpla con los requisitos establecidos y produzca contraseñas seguras.
*/

package EjercicioExtra3;

import java.util.Random;

public class GeneradorContraseña {

    // Crea contraseña de largo 10 caracteres que contienen numeros, mayusculas, minusculas y simbolos especiales
    public static String generarContraseña() {

        Random random = new Random();

        String contra = "";

        // 1 Mayuscula
        for (int i = 0; i < 1; i++) {

            char caracter = (char) (random.nextInt(26) + 65);
            contra += (String.valueOf(caracter));

        }

        // 4 Minusculas
        for (int i = 0; i < 4; i++) {

            char caracter = (char) (random.nextInt(26) + 97);
            contra += (String.valueOf(caracter));

        }

        // 4 Numeros
        for (int i = 0; i < 4; i++) {

            char caracter = (char) (random.nextInt(10) + 48);
            contra += (String.valueOf(caracter));

        }

        // 1 Caracter Especial
        for (int i = 0; i < 1; i++) {

            char caracter = (char) (random.nextInt(6) + 33);
            contra += (String.valueOf(caracter));

        }

        System.out.println(contra);

        return contra;

    }
}
