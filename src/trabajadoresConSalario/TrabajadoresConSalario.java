package trabajadoresConSalario;

import java.util.HashMap;
import java.util.Map;

public class TrabajadoresConSalario {

    public static void main(String[] args) {

        HashMap<String, Double> trabajadores = new HashMap<>();

        // agregar trabajadores
        trabajadores.put("Cristian Ceballos", 5500000.0);
        trabajadores.put("Bilmariz Muñoz", 4200000.0);
        trabajadores.put("Pedro El Escamozo", 2800000.0);
        trabajadores.put("Ana Valencia", 5100000.0);

        // Mostrar todas las tareas
        System.out.println(" ***************** Mis trabajadores *****************");
        for (Map.Entry<String, Double> entrada : trabajadores.entrySet()) {
            System.out.println("- " + entrada.getKey() + " ($" + entrada.getValue() + ")");
        }

        //actualizar un trabajador
        trabajadores.put("Cristian Ceballos",6500000.00);
        System.out.println("El salario de Cristian Ceballos Fue actualizado correctamente");


        // Mostrar los trabajadores actualizados
        System.out.println(" ***************** Mis trabajadores Actualizados *****************");
        for (Map.Entry<String, Double> entrada : trabajadores.entrySet()) {
            System.out.println("- " + entrada.getKey() + " ($" + entrada.getValue() + ")");
        }

        // Calcular promedio
        double total = 0;
        for (double salario : trabajadores.values()) {
            total += salario;
        }
        System.out.println("\nSalario promedio: $" + (total / trabajadores.size()));
    }

}
