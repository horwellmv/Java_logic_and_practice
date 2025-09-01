
import java.util.Scanner;

public class Intro_Ejercicio1 {
    public static void main(String[] args) {
        // TODO: Imprimir un mensaje de bienvenida personalizado para un usuario
        // Tip: usar Scanner para entrada de nombre
        // Buenas prácticas: validar que el nombre no sea vacío
        // Analisis: considerar trimming y posibles errores de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a la práctica de Java!, escribe tu nombre");
        
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío. Por favor, ingresa un nombre válido.");
        } else {
            System.out.println("¡Hola, " + nombre + ", Bienvenido a la práctica de Java!");
        }

    }
}