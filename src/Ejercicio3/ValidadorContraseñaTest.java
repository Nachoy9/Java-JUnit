package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorContraseñaTest {

    /*
     La contraseña debe tener un largo mayor o igual a 8 caracteres. Debe contener al menos un caracter especial, una
     letra mayuscula, una letra minuscula, un numero y no contener espacios.
    */

    // La contraseña "aB1!" no deberia ser aceptada por que no cumple con el largo entre otras cosas
    @Test
    void validarLargo() {
        assertFalse(ValidadorContraseña.validarContraseña("aB1!"));
    }

    // La contraseña "palabras" no deberia ser aceptada por que no cumple con las condiciones de caracteres
    @Test
    void validarCaracteres() {
        assertFalse(ValidadorContraseña.validarContraseña("palabras"));
    }

    // La contraseña "Palabras1" no deberia ser aceptada por que no contiene un caracter especial
    @Test
    void validarEspecial() {
        assertFalse(ValidadorContraseña.validarContraseña("Palabras1"));
    }

    // La contraseña "Palabras!" no deberia ser aceptada por que no contiene un numero
    @Test
    void validarNum() {
        assertFalse(ValidadorContraseña.validarContraseña("Palabras!"));
    }

    // La contraseña "palabras!1" no deberia ser aceptada por que no contiene una mayuscula
    @Test
    void validarMayus() {
        assertFalse(ValidadorContraseña.validarContraseña("palabras!1"));
    }

    // La contraseña "PALABRAS!1" no deberia ser aceptada por que no contiene una minuscula
    @Test
    void validarMinus() {
        assertFalse(ValidadorContraseña.validarContraseña("PALABRAS!1"));
    }

    // La contraseña "Pala bras!1" no deberia ser aceptada por que tiene un espacio
    @Test
    void validarEspacio() {
        assertFalse(ValidadorContraseña.validarContraseña("Pala bras!1"));
    }

    // La contraseña "Palabras!1" deberia ser aceptada ya que cumple con todas las condiciones
    @Test
    void validarContra() {
        assertTrue(ValidadorContraseña.validarContraseña("Palabras!1"));
    }

}