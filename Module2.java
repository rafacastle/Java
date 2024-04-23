import java.io.File;       // Importa la clase File para manejar archivos
import java.io.FileNotFoundException; // Importa esta clase para manejar errores de archivo no encontrado
import java.util.Scanner;  // Importa la clase Scanner para leer texto de un archivo

public class Module2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Introduce el nombre del círculo: ");
            String nombre = scanner.nextLine();

            System.out.println("Introduce el radio del círculo: ");
            double radio = scanner.nextDouble();

            double area = calcularAreaCirculo(radio);
            System.out.println("El área de " + nombre + " con radio " + radio + " es " + area + " unidades cuadradas.");

            // Cerrar el scanner
            scanner.close();
        }
    }
    // Método para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        final double PI = 3.14159; // Constante para el valor de Pi
        return PI * radio * radio; // Fórmula del área: π * r^2
    }
}

