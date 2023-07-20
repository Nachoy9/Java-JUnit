package Ejercicio4;

import Ejemplo.Servicios.RectanguloServicio;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    // Configuracion antes de cada prueba
    @BeforeEach
    public void setUp() {
        TaskManager.agregarTarea("Comprar Leche");
        TaskManager.agregarTarea("Comprar Pan");
    }

    // Limpieza despues de cada prueba
    @AfterEach
    public void cleanUp() {
        TaskManager.tareas.clear();
    }

    // Verifico que se agreguen las tareas correctamente
    @Test
    void agregarTarea() {

        TaskManager.agregarTarea("Pagar Luz");

        assertEquals("Comprar Leche", TaskManager.tareas.get(0));
        assertEquals("Comprar Pan", TaskManager.tareas.get(1));
        assertEquals("Pagar Luz", TaskManager.tareas.get(2));

        assertNotEquals("Hola", TaskManager.tareas.get(0));

        assertEquals(3, TaskManager.tareas.size());

    }

    // Verifico que se eliminen las tareas correctamente
    @Test
    void eliminarTarea() {

        TaskManager.eliminarTarea(1);

        assertEquals("Comprar Leche", TaskManager.tareas.get(0));

        assertEquals(1, TaskManager.tareas.size());

    }

    // Verifico que devuelva String correcto
    @Test
    void listarTareas() {

        String[] tareas = {"Comprar Leche", "Comprar Pan"};
        String[] listaTareas = TaskManager.listarTareas();

        assertEquals(tareas.length, listaTareas.length);

        for (int i = 0; i < tareas.length; i++) {
            assertEquals(tareas[i], listaTareas[i]);
        }

    }
}