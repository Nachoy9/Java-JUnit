/*
Crea una clase TaskManager que permita agregar, eliminar y listar tareas.
Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
*/

package Ejercicio4;

import java.util.ArrayList;

public class TaskManager {

    public static ArrayList<String> tareas = new ArrayList<String>();

    public static void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public static void eliminarTarea(int tarea) {
        tareas.remove(tarea);
    }

    public static String[] listarTareas() {

        String[] listaTareas = new String[tareas.size()];

        for (int i = 0; i < tareas.size(); i++) {
            listaTareas[i] = tareas.get(i);
        }

        return listaTareas;
    }

}
