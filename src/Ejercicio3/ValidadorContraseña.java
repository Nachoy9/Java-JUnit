/*
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
*/

package Ejercicio3;

public class ValidadorContraseña {

    public static boolean validarContraseña(String contra) {

        int longitudMinima = 8;

        boolean longMin = false, cEspecial = false, cMayus = false, cMinus = false, cNumero = false, cEspacio = false;

        if (contra.length() >= longitudMinima) {
            longMin = true;
        }

        for (int i = 0; i < contra.length(); i++) {

            if (!Character.isLetterOrDigit(contra.charAt(i))) {
                cEspecial = true;
            }

            if (Character.isUpperCase(contra.charAt(i))) {
                cMayus = true;
            }

            if (Character.isLowerCase(contra.charAt(i))) {
                cMinus = true;
            }

            if (Character.isDigit(contra.charAt(i))) {
                cNumero = true;
            }

            if (Character.isSpaceChar(contra.charAt(i))) {
                cEspacio = true;
            }

        }

        if (longMin && cEspecial && cMayus && cMinus && cNumero && !cEspacio) {
            return true;
        } else {
            return false;
        }

    }
}
