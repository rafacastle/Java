import java.io.File;       // Importa la clase File para manejar archivos
import java.io.FileNotFoundException; // Importa esta clase para manejar errores de archivo no encontrado
import java.util.Scanner;  // Importa la clase Scanner para leer texto de un archivo

public class Module4 {
    private String titulo;
    private int horas;

    public String getTitle(){
        return titulo;
    }

    public int getHours(){
        return horas;
    }

    public void info(){
        System.out.println("El título es " + getTitle() + " y el total de horas es: " + getHours());
    }
public Module4(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
}


    public static void main(String[] args) {
// Creación de un objeto Module4 con título y horas especificadas
        Module4 modulo = new Module4("Fundamentos de Java", 10);

        // Uso del método info para mostrar la información del módulo
        modulo.info();
    }

}

