public class Intro_Ejercicio3 {
    public static int calcularIMC(double pesoKg, double alturaM) {
        // TODO: calcular índice de masa corporal
        // Tip: IMC = peso / (altura^2)
        // Buenas prácticas: validar que altura > 0
        // Analisis: considerar límites para clasificar bajo peso, normal, sobrepeso
        if (alturaM <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        int imc = (int) (pesoKg / (alturaM * alturaM));
        return imc;
    }
}