
import java.util.Scanner;

public class Intro_Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa primer número:"); 
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa segundo número:");
        int numero2 = scanner.nextInt();

        // TODO: calcular la suma, resta, multiplicación y división de dos números
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        
        if (numero2 != 0) {
            System.out.println("División: " + (numero1 / numero2));
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }
        // Tip: manejar la división por cero
        // Buenas prácticas: mostrar resultados formateados
        // Analisis: usar variables descriptivas y comentarios claros
    }
}