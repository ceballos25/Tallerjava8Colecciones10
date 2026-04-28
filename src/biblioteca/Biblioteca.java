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
    }
}
