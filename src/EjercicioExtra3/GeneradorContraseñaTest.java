package EjercicioExtra3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorContraseñaTest {

    // La contraseña debe tener largo de 10 caracteres
    @Test
    void validarLargo() {

        String contra = GeneradorContraseña.generarContraseña();
        assertEquals(10, contra.length());

    }

    // La contraseña debe contener al menos una mayuscula
    @Test
    void validarMayuscula() {

        String contra = GeneradorContraseña.generarContraseña();
        boolean condicion = false;

        for (int i = 0; i < contra.length(); i++) {

            if (Character.isUpperCase(contra.charAt(i))) {
                condicion = true;
                break;
            }
        }

        assertTrue(condicion);

    }

    // La contraseña debe contener al menos una minuscula
    @Test
    void validarMinuscula() {

        String contra = GeneradorContraseña.generarContraseña();
        boolean condicion = false;

        for (int i = 0; i < contra.length(); i++) {

            if (Character.isLowerCase(contra.charAt(i))) {
                condicion = true;
                break;
            }
        }

        assertTrue(condicion);
    }

    // La contraseña debe contener al menos un numero
    @Test
    void validarNum() {

        String contra = GeneradorContraseña.generarContraseña();
        boolean condicion = false;

        for (int i = 0; i < contra.length(); i++) {

            if (Character.isDigit(contra.charAt(i))) {
                condicion = true;
                break;
            }
        }

        assertTrue(condicion);

    }

    // La contraseña debe contener al menos un caracter especial
    @Test
    void validarEspecial() {

        String contra = GeneradorContraseña.generarContraseña();
        boolean condicion = false;

        for (int i = 0; i < contra.length(); i++) {

            if (!Character.isLetterOrDigit(contra.charAt(i))) {
                condicion = true;
                break;
            }
        }

        assertTrue(condicion);

    }

    // La contraseña no debe contener espacios
    @Test
    void validarEspacio() {

        String contra = GeneradorContraseña.generarContraseña();

        boolean condicion = false;

        for (int i = 0; i < contra.length(); i++) {

            if (Character.isSpaceChar(contra.charAt(i))) {
                condicion = true;
                break;
            }
        }

        assertFalse(condicion);

    }
}