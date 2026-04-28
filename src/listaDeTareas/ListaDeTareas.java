package listaDeTareas;
import java.util.ArrayList;

public class ListaDeTareas {

    public static void main(String[] args) {

        // Array
        ArrayList<String> listaTareas = new ArrayList<>();

        // Agregar tareas
        listaTareas.add("Ir al GYM");
        listaTareas.add("Hacer el Desayuno");
        listaTareas.add("Hacer el Almuerzo");
        listaTareas.add("Ingresar al Bootcamp");

        // Mostrar todas las tareas
        System.out.println(" ***************** Mi lista de Tareas *****************");
        for (String tarea : listaTareas) {
            System.out.println("- " + tarea);
        }

        // Quitar tarrea por Nombre
        listaTareas.remove("Hacer el Desayuno");
        System.out.println("\nLa tarea se eliminó correctamente.");

        // Buscar una tarea
        if (listaTareas.contains("Hacer el Almuerzo")) {
            System.out.println("La tarea 'Hacer el Almuerzo' está pendiente.");
        }

        // Editar tarea
        listaTareas.set(2, "Dormir");

        // Mostrar liosrta de tareas
        System.out.println(" ***************** Mi lista de Tareas *****************");
        for (String tarea : listaTareas) {
            System.out.println("- " + tarea);
        }

        // Total de tareas
        System.out.println("\nTotal de tareas: " + listaTareas.size());

        // Limpiar toda la lista
        listaTareas.clear();
        System.out.println("Tu lista de tareas se limpió correctamente: ");
    }
}