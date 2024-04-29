import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
// Usando BufferedReader para texto
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Usando Scanner para texto
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


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
        listaNombres.add("Alex");
        listaNombres.add("Jose");

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

        System.out.println("Lista de Nombres que empiezan con A:");
        for (String nombre : listaNombres) {
            if (nombre.startsWith("A")) {
                System.out.println(nombre);
            }
        }

        // Usando BufferReader
        System.out.println("\n Texto con BufferReader (PREFERDO): \n");
        String path = "C:/Users/luis.castillo/Documents/LearningJava/learning Java/src/text.txt"; // Cambia esto por la ruta de tu archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Usando Scanner
        System.out.println("\n Texto con Scanner: \n");
        File file = new File("C:/Users/luis.castillo/Documents/LearningJava/learning Java/src/text.txt"); // Cambia esto por la ruta de tu archivo
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Leyendo un CSV
        System.out.println("\n CSV: \n");
        String pathcsv = "C:/Users/luis.castillo/Documents/LearningJava/learning Java/src/tabla.csv"; // Cambia esto por la ruta de tu archivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(pathcsv))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] valores = line.split(","); // Divide cada línea en partes separadas por comas
                System.out.println("Columna 1: " + valores[0] + " Columna 2: " + valores[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}