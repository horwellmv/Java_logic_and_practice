# 📂 Carpeta: `Java_Exercises/`

Mapas - recursion - Algoritmos.

---

## 🔹 Módulo 7: Mapas

### Mapas\_Ejercicio1.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        // TODO: inicializar mapa con productos y sus cantidades
        // Tip: usar put para agregar elementos
        // Buenas prácticas: nombres de claves descriptivos
        // Analisis: preparar el mapa para consultas rápidas
    }
}
```

### Mapas\_Ejercicio2.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio2 {
    public static int obtenerStock(HashMap<String, Integer> stock, String producto) {
        // TODO: devolver cantidad disponible de un producto
        // Tip: usar containsKey para validar existencia
        // Buenas prácticas: manejar caso de producto inexistente
        return answer;
    }
}
```

### Mapas\_Ejercicio3.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio3 {
    public static void actualizarStock(HashMap<String, Integer> stock, String producto, int cantidad) {
        // TODO: incrementar o decrementar stock de un producto
        // Tip: usar get y put
        // Buenas prácticas: validar que stock nunca sea negativo
    }
}
```

### Mapas\_Ejercicio4.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio4 {
    public static boolean productoExiste(HashMap<String, Integer> stock, String producto) {
        // TODO: devolver true si producto está en stock
        // Tip: usar containsKey
        return answer;
    }
}
```

### Mapas\_Ejercicio5.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio5 {
    public static int contarProductos(HashMap<String, Integer> stock) {
        // TODO: devolver la cantidad total de productos diferentes
        // Tip: usar size del mapa
        return answer;
    }
}
```

### Mapas\_Ejercicio6.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio6 {
    public static void mostrarProductosConStock(HashMap<String, Integer> stock) {
        // TODO: imprimir productos con stock > 0
        // Tip: iterar sobre entrySet
        // Buenas prácticas: formatear salida para backend readable
    }
}
```

### Mapas\_Ejercicio7.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio7 {
    public static String productoMayorStock(HashMap<String, Integer> stock) {
        // TODO: devolver el producto con mayor cantidad disponible
        // Tip: recorrer mapa comparando valores
        // Buenas prácticas: manejar mapas vacíos
        return answer;
    }
}
```

### Mapas\_Ejercicio8.java

```java
import java.util.HashMap;

public class Mapas_Ejercicio8 {
    public static void limpiarStock(HashMap<String, Integer> stock) {
        // TODO: eliminar productos con cantidad cero
        // Tip: iterar usando iterator para no causar ConcurrentModificationException
        // Buenas prácticas: mantener integridad del mapa
    }
}
```

---

## 🔹 Módulo 8: Recursión

### Recursion\_Ejercicio1.java

```java
public class Recursion_Ejercicio1 {
    public static int factorial(int n) {
        // TODO: calcular factorial usando recursión
        // Tip: caso base n == 0
        // Buenas prácticas: validar n >= 0
        return answer;
    }
}
```

### Recursion\_Ejercicio2.java

```java
public class Recursion_Ejercicio2 {
    public static int fibonacci(int n) {
        // TODO: devolver el n-ésimo número de Fibonacci
        // Tip: definir caso base n=0 y n=1
        // Buenas prácticas: considerar memoization para eficiencia
        return answer;
    }
}
```

### Recursion\_Ejercicio3.java

```java
public class Recursion_Ejercicio3 {
    public static int sumaArray(int[] numeros, int indice) {
        // TODO: sumar elementos de un array recursivamente
        // Tip: caso base cuando indice es último
        // Buenas prácticas: validar array no null
        return answer;
    }
}
```

### Recursion\_Ejercicio4.java

```java
public class Recursion_Ejercicio4 {
    public static String invertirCadena(String texto) {
        // TODO: devolver cadena invertida usando recursión
        // Tip: concatenar último caracter + llamada recursiva al resto
        return answer;
    }
}
```

### Recursion\_Ejercicio5.java

```java
public class Recursion_Ejercicio5 {
    public static int potencia(int base, int exponente) {
        // TODO: calcular base^exponente recursivamente
        // Tip: caso base exponente == 0
        return answer;
    }
}
```

### Recursion\_Ejercicio6.java

```java
public class Recursion_Ejercicio6 {
    public static int contarDigitos(int numero) {
        // TODO: contar cantidad de dígitos recursivamente
        // Tip: usar division entera por 10
        return answer;
    }
}
```

### Recursion\_Ejercicio7.java

```java
public class Recursion_Ejercicio7 {
    public static boolean esPalindromo(String texto) {
        // TODO: verificar si texto es palíndromo recursivamente
        // Tip: comparar primer y último caracter
        return answer;
    }
}
```

### Recursion\_Ejercicio8.java

```java
public class Recursion_Ejercicio8 {
    public static int sumaMatriz(int[][] matriz, int fila, int columna) {
        // TODO: sumar todos los elementos de una matriz usando recursión
        // Tip: recorrer fila y columna recursivamente
        // Buenas prácticas: validar matriz no null y no vacía
        return answer;
    }
}
```

---

## 🔹 Módulo 9: Algoritmos

### Algoritmos\_Ejercicio1.java

```java
public class Algoritmos_Ejercicio1 {
    public static void burbuja(int[] arr) {
        // TODO: ordenar array con método burbuja
        // Tip: usar bucles anidados
        // Buenas prácticas: evitar comparaciones innecesarias
    }
}
```

### Algoritmos\_Ejercicio2.java

```java
public class Algoritmos_Ejercicio2 {
    public static int busquedaLineal(int[] arr, int buscado) {
        // TODO: devolver índice de elemento usando búsqueda lineal
        // Tip: recorrer array secuencialmente
        return answer;
    }
}
```

### Algoritmos\_Ejercicio3.java

```java
public class Algoritmos_Ejercicio3 {
    public static int busquedaBinaria(int[] arr, int buscado, int inicio, int fin) {
        // TODO: búsqueda binaria recursiva en array ordenado
        // Tip: calcular mitad, comparar, llamar recursivamente
        return answer;
    }
}
```

### Algoritmos\_Ejercicio4.java

```java
public class Algoritmos_Ejercicio4 {
    public static void seleccion(int[] arr) {
        // TODO: ordenar array usando método de selección
        // Tip: buscar mínimo y cambiar posiciones
        // Buenas prácticas: evitar reordenar si ya está ordenado
    }
}
```

### Algoritmos\_Ejercicio5.java

```java
public class Algoritmos_Ejercicio5 {
    public static void insercion(int[] arr) {
        // TODO: ordenar array usando inserción
        // Tip: recorrer desde segunda posición y desplazar elementos
    }
}
```

### Algoritmos\_Ejercicio6.java

```java
public class Algoritmos_Ejercicio6 {
    public static int maximoSubArray(int[] arr) {
        // TODO: devolver suma máxima de subarray contiguo (Kadane)
        // Tip: usar bucle y variables auxiliares para max actual y global
        return answer;
    }
}
```

### Algoritmos\_Ejercicio7.java

```java
public class Algoritmos_Ejercicio7 {
    public static void mergeSort(int[] arr) {
        // TODO: ordenar array usando Merge Sort
        // Tip: dividir array, ordenar recursivamente, combinar
        // Buenas prácticas: manejar arrays de tamaño 0 o 1
    }
}
```

### Algoritmos\_Ejercicio8.java

```java
public class Algoritmos_Ejercicio8 {
    public static boolean existeCiclo(int[] arr) {
        // TODO: detectar si hay ciclo en una secuencia de índices (simulando punteros)
        // Tip: usar slow/fast pointer o marca de visitados
        // Buenas prácticas: manejar arrays vacíos o con un solo elemento
        return answer;
    }
}
```

---
