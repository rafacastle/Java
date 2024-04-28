import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Module5 {
    // Arrays: Los arrays tienen tamaño fijo y no pueden crecer o encoger una vez inicializados.
    private static int[] numeros = new int[5]; // Array de 5 enteros
    private static String[] nombres = {"Alice", "Bob", "Charlie"}; // Array initialization

    private static int x;

    // Listas: Permite elementos duplicados y acceso posicional, pueden crecer o encogerse.
    private static List<String> listaNombres = new ArrayList<>();

    // Sets: No permiten elementos duplicados y no garantizan un orden.
    private static Set<String> conjuntoNombres = new HashSet<>();

    // Maps: Almacenan pares de clave-valor.
    private static Map<String, Integer> mapaEdades = new HashMap<>();

    public Module5() {
        // Inicialización de la lista en el constructor
        numeros[0] = 10;  // Asignar el primer valor
        x = numeros[0];   // Obtener el primer valor
        listaNombres.add("Anna");
        listaNombres.add("Bob");

        conjuntoNombres.add("Anna");
        conjuntoNombres.add("Anna");  // Este elemento duplicado no se añadirá de nuevo.

        mapaEdades.put("Anna", 28);
        mapaEdades.put("Bob", 25);
    }

    public static void main(String[] args) {
        new Module5();
        // Arrays
        System.out.println("X value and Numeros Array: " + x + Arrays.toString(numeros));

        // Listas
        System.out.println("Lista de Nombres: " + listaNombres);

        // Sets y Maps
        System.out.println("Conjunto de Nombres: " + conjuntoNombres);
        System.out.println("Mapa de Edades: " + mapaEdades);
    }
}
