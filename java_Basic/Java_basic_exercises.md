# 📂 Carpeta: `Java_Exercises/`
Introducción - Condicionales - Bucles.

---

## 🔹 Módulo 1: Introducción

### Intro\_Ejercicio1.java

```java
public class Intro_Ejercicio1 {
    public static void main(String[] args) {
        // TODO: Imprimir un mensaje de bienvenida personalizado para un usuario
        // Tip: usar Scanner para entrada de nombre
        // Buenas prácticas: validar que el nombre no sea vacío
        // Analisis: considerar trimming y posibles errores de entrada
    }
}
```

### Intro\_Ejercicio2.java

```java
public class Intro_Ejercicio2 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        // TODO: calcular la suma, resta, multiplicación y división de dos números
        // Tip: manejar la división por cero
        // Buenas prácticas: mostrar resultados formateados
        // Analisis: usar variables descriptivas y comentarios claros
    }
}
```

### Intro\_Ejercicio3.java

```java
public class Intro_Ejercicio3 {
    public static int calcularIMC(double pesoKg, double alturaM) {
        // TODO: calcular índice de masa corporal
        // Tip: IMC = peso / (altura^2)
        // Buenas prácticas: validar que altura > 0
        // Analisis: considerar límites para clasificar bajo peso, normal, sobrepeso
        return answer;
    }
}
```

### Intro\_Ejercicio4.java

```java
public class Intro_Ejercicio4 {
    public static void main(String[] args) {
        double[] precios = {10.5, 23.0, 5.75};
        // TODO: calcular el total de un carrito de compras y aplicar un descuento
        // Tip: recorrer array con bucle for
        // Buenas prácticas: usar variables descriptivas y no modificar array original
        // Analisis: pensar en escalabilidad si se agregan más productos
    }
}
```

---

## 🔹 Módulo 2: Condicionales

### Condicionales\_Ejercicio1.java

```java
public class Condicionales_Ejercicio1 {
    public static boolean esMayorEdad(int edad) {
        // TODO: devolver true si la edad >= 18
        // Tip: usar if/else
        // Buenas prácticas: manejo de casos límite (edad = 0)
        // Analisis: considerar validación de entradas negativas
        return answer;
    }
}
```

### Condicionales\_Ejercicio2.java

```java
public class Condicionales_Ejercicio2 {
    public static void main(String[] args) {
        int ventas = 1200;
        // TODO: determinar categoría de un vendedor según sus ventas
        // Tip: usar if, else if y else
        // Buenas prácticas: nombrar categorías claras, usar constantes si es posible
        // Analisis: pensar en ampliabilidad si se agregan nuevas categorías
    }
}
```

### Condicionales\_Ejercicio3.java

```java
public class Condicionales_Ejercicio3 {
    public static boolean esValidoPedido(int cantidad, double stock) {
        // TODO: verificar si un pedido puede ser procesado según el stock disponible
        // Tip: usar operadores relacionales y lógicos
        // Buenas prácticas: validar que cantidad no sea negativa
        // Analisis: considerar retorno booleano claro y descriptivo
        return answer;
    }
}
```

### Condicionales\_Ejercicio4.java

```java
public class Condicionales_Ejercicio4 {
    public static double calcularComision(double venta) {
        // TODO: calcular comisión según tramos de venta
        // Tip: usar if/else con rangos, o switch con patrones
        // Buenas prácticas: evitar números mágicos, usar constantes
        // Analisis: considerar margen para nuevas reglas de negocio
        return answer;
    }
}
```

---

## 🔹 Módulo 3: Bucles

### Bucles\_Ejercicio1.java

```java
public class Bucles_Ejercicio1 {
    public static int sumarNumerosHastaN(int n) {
        // TODO: sumar todos los números del 1 al n
        // Tip: usar bucle for
        // Buenas prácticas: validar que n sea positivo
        // Analisis: eficiencia en bucles grandes
        return answer;
    }
}
```

### Bucles\_Ejercicio2.java

```java
public class Bucles_Ejercicio2 {
    public static void mostrarTablaMultiplicar(int numero) {
        // TODO: imprimir la tabla de multiplicar del número
        // Tip: usar bucle for desde 1 hasta 10
        // Buenas prácticas: formatear salida
        // Analisis: podría generalizarse a cualquier rango dinámico
    }
}
```

### Bucles\_Ejercicio3.java

```java
public class Bucles_Ejercicio3 {
    public static void main(String[] args) {
        int[] pedidos = {5, 3, 12, 7};
        // TODO: calcular total de unidades vendidas sumando array de pedidos
        // Tip: recorrer array con for
        // Buenas prácticas: no modificar array original, usar variables descriptivas
        // Analisis: pensar en escalabilidad con listas grandes
    }
}
```

### Bucles\_Ejercicio4.java

```java
public class Bucles_Ejercicio4 {
    public static boolean detectarDuplicados(int[] ids) {
        // TODO: verificar si hay IDs duplicados en un array
        // Tip: usar bucles anidados o estructuras auxiliares como Set
        // Buenas prácticas: considerar eficiencia, evitar O(n^2) si es posible
        // Analisis: útil en backend para validar integridad de datos
        return answer;
    }
}
```

---

