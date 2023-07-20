/*
Crea una clase RandomNumberGenerator que genere números aleatorios dentro de un rango
específico.
Escribe pruebas unitarias para asegurarte de que el generador de números aleatorios produce
resultados dentro del rango esperado y cumple con las propiedades de aleatoriedad.
*/

package EjercicioExtra1;

public class RandomNumberGenerator {

    public static int generarAleatorio() {
        return (int) (Math.random()*10 + 1);
    }

}
