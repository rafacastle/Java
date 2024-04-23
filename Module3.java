import java.io.File;       // Importa la clase File para manejar archivos
import java.io.FileNotFoundException; // Importa esta clase para manejar errores de archivo no encontrado
import java.util.Scanner;  // Importa la clase Scanner para leer texto de un archivo

public class Module3 {
    public static void main(String[] args) {
    for(int i = 1; i<=10; i++) {
        if(i%2==0){
            System.out.println(i + " es par");
        } else {
            System.out.println(i + " es impar");
        }
        }
}
}

