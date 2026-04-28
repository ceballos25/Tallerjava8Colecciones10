package biblioteca;
import java.util.HashSet;

public class Biblioteca {

    public static void main(String[] args) {

        //Creal lista tipo HashSet
        HashSet<String> biblioteca = new HashSet<>();

        //agregart elementos
        biblioteca.add("Un Grito Desesperado");
        biblioteca.add("Volar Sobre el pantano");
        biblioteca.add("Hábitos Atómicos");
        biblioteca.add("Sangre de Campeón");

        // Mostrar biblioteca
        System.out.println(" ***************** Bienvenido a la bilioteca de Cris *****************");
        for (String libro : biblioteca) {
            System.out.println("- " + libro);
        }
        
        //buscar en la bibliotecha
        String buscarLibro = "Sangre de Campeón";
        if (biblioteca.contains(buscarLibro)){
            System.out.println("El libro (" + buscarLibro + ") se encuentra disponible.");
        }else{
            System.out.println("El libro (" + buscarLibro + ") NO está disponible.");
        }

        //total libros
        System.out.println("Total de libros en la biblioteca de Cris: " + biblioteca.size());
    }
}
