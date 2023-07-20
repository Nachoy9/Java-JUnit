/*
Crea una clase PalindromeChecker que verifique si una cadena es un palíndromo (se lee
igual de adelante hacia atrás y viceversa).
Escribe pruebas unitarias para asegurarte de que el verificador de palíndromos detecte
correctamente las cadenas que son palíndromos y las que no lo son.
*/

package EjercicioExtra2;

public class PalindromeChecker {

    public static boolean esPalindromo(String palabra) {

        String mitad1 = "", mitad2 = "";

        if (palabra.length()%2 == 0) {

            for (int i = 0; i < palabra.length()/2; i++) {
                mitad1 = mitad1 + palabra.charAt(i);
            }

            for (int j = palabra.length()-1; j > (palabra.length()-1)/2; j--) {
                mitad2 = mitad2 + palabra.charAt(j);
            }

        } else {

            for (int i = 0; i < (palabra.length()-1)/2; i++) {
                mitad1 = mitad1 + palabra.charAt(i);
            }

            for (int j = palabra.length()-1; j > (palabra.length()-1)/2; j--) {
                mitad2 = mitad2 + palabra.charAt(j);
            }

        }

        for (int i = 0; i < mitad1.length(); i++) {
            if (mitad1.charAt(i) != mitad2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
