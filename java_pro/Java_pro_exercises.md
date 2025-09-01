## 🔹 Módulo 10: Proyectos Finales (Contextualizados)

---

### Proyectos\_Ejercicio1.java – Inventario de Productos

```java
import java.util.HashMap;

public class Proyectos_Ejercicio1 {
    public static void main(String[] args) {
        // TODO: Sistema simple de inventario de productos
        // Uso: HashMap<String, Integer> para asociar nombre de producto con cantidad en stock
        // Datos de ejemplo:
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("Laptop", 10);
        inventario.put("Mouse", 50);
        inventario.put("Teclado", 30);

        // Objetivo: crear funciones para:
        // - agregar producto
        // - actualizar stock
        // - eliminar producto
        // - consultar cantidad disponible
        // Tip: usar containsKey para verificar existencia antes de actualizar
        // Buenas prácticas: validar que stock nunca sea negativo, nombres consistentes
        // Analisis: útil en backend para mantener inventario actualizado
    }
}
```

---

### Proyectos\_Ejercicio2.java – Gestión de Facturas

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Proyectos_Ejercicio2 {
    public static void main(String[] args) {
        // TODO: Sistema de cálculo de facturas de clientes
        // Uso: ArrayList<HashMap<String,Object>> para almacenar varias facturas
        // Datos de ejemplo:
        ArrayList<HashMap<String, Object>> facturas = new ArrayList<>();
        HashMap<String, Object> factura1 = new HashMap<>();
        factura1.put("cliente", "Ana");
        factura1.put("productos", new String[]{"Laptop", "Mouse"});
        factura1.put("precios", new double[]{1200.0, 25.0});
        factura1.put("descuento", 0.1); // 10% de descuento
        facturas.add(factura1);

        // Objetivo: crear funciones para:
        // - calcular subtotal
        // - calcular impuestos
        // - aplicar descuento
        // - mostrar total final
        // Tip: recorrer arrays dentro de cada HashMap
        // Buenas prácticas: separar lógica de cálculo de lógica de impresión
        // Analisis: simula backend de facturación, modular y escalable
    }
}
```

---

### Proyectos\_Ejercicio3.java – Analizador de Ventas

```java
import java.util.ArrayList;

public class Proyectos_Ejercicio3 {
    public static void main(String[] args) {
        // TODO: Analizador de registros de ventas diarias
        // Uso: ArrayList<Double> para ventas por día
        // Datos de ejemplo:
        ArrayList<Double> ventasDiarias = new ArrayList<>();
        ventasDiarias.add(1200.5);
        ventasDiarias.add(800.0);
        ventasDiarias.add(1500.25);
        ventasDiarias.add(950.75);

        // Objetivo: crear funciones para:
        // - calcular total de ventas
        // - promedio de ventas
        // - venta máxima y mínima
        // Tip: recorrer ArrayList con for-each
        // Buenas prácticas: validar que lista no esté vacía antes de operaciones
        // Analisis: simula backend de reportes para la gerencia de ventas
    }
}
```

---

### Proyectos\_Ejercicio4.java – Seguimiento de Pedidos

```java
import java.util.HashMap;

public class Proyectos_Ejercicio4 {
    public static void main(String[] args) {
        // TODO: Sistema de seguimiento de pedidos de clientes
        // Uso: HashMap<Integer, String> para asociar ID de pedido con estado
        // Datos de ejemplo:
        HashMap<Integer, String> pedidos = new HashMap<>();
        pedidos.put(1001, "Pendiente");
        pedidos.put(1002, "Enviado");
        pedidos.put(1003, "Entregado");
        pedidos.put(1004, "Cancelado");

        // Objetivo: crear funciones para:
        // - agregar nuevo pedido
        // - actualizar estado de pedido
        // - consultar estado por ID
        // Tip: usar containsKey antes de actualizar
        // Buenas prácticas: definir constantes para estados válidos
        // Analisis: refleja backend de logística y seguimiento de pedidos
    }
}
```

---

### Proyectos\_Ejercicio5.java – Gestión de Usuarios y Roles

```java
import java.util.HashMap;
import java.util.ArrayList;

public class Proyectos_Ejercicio5 {
    public static void main(String[] args) {
        // TODO: Sistema de control de usuarios y roles
        // Uso: HashMap<String, ArrayList<String>> asociando usuario con roles
        // Datos de ejemplo:
        HashMap<String, ArrayList<String>> usuarios = new HashMap<>();
        usuarios.put("ana", new ArrayList<String>(){{ add("admin"); add("editor"); }});
        usuarios.put("juan", new ArrayList<String>(){{ add("viewer"); }});

        // Objetivo: crear funciones para:
        // - asignar rol a usuario
        // - quitar rol
        // - verificar rol
        // Tip: evitar duplicar roles
        // Buenas prácticas: validar usuario existe antes de operar
        // Analisis: muy útil para backend de gestión de permisos
    }
}
```

---

### Proyectos\_Ejercicio6.java – Simulador de Carrito de Compras

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Proyectos_Ejercicio6 {
    public static void main(String[] args) {
        // TODO: Sistema de carrito de compras
        // Uso: ArrayList<HashMap<String, Object>> para productos agregados
        // Datos de ejemplo:
        ArrayList<HashMap<String, Object>> carrito = new ArrayList<>();
        HashMap<String, Object> item1 = new HashMap<>();
        item1.put("producto", "Laptop");
        item1.put("precio", 1200.0);
        item1.put("cantidad", 1);
        carrito.add(item1);

        HashMap<String, Object> item2 = new HashMap<>();
        item2.put("producto", "Mouse");
        item2.put("precio", 25.0);
        item2.put("cantidad", 2);
        carrito.add(item2);

        // Objetivo: crear funciones para:
        // - calcular subtotal
        // - aplicar impuestos y descuentos
        // - mostrar total final
        // Tip: recorrer ArrayList y acceder a valores del HashMap
        // Buenas prácticas: modularizar cálculos y salida
        // Analisis: simula backend de e-commerce
    }
}
```

---

### Proyectos\_Ejercicio7.java – Registro de Incidencias

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Proyectos_Ejercicio7 {
    public static void main(String[] args) {
        // TODO: Sistema de registro de incidencias de clientes
        // Uso: ArrayList<HashMap<String,Object>> para cada incidencia
        // Datos de ejemplo:
        ArrayList<HashMap<String, Object>> incidencias = new ArrayList<>();
        HashMap<String, Object> inc1 = new HashMap<>();
        inc1.put("cliente", "Ana");
        inc1.put("descripcion", "Error en pago");
        inc1.put("estado", "Abierta");
        incidencias.add(inc1);

        HashMap<String, Object> inc2 = new HashMap<>();
        inc2.put("cliente", "Juan");
        inc2.put("descripcion", "Producto dañado");
        inc2.put("estado", "Cerrada");
        incidencias.add(inc2);

        // Objetivo: crear funciones para:
        // - agregar nueva incidencia
        // - cambiar estado
        // - listar incidencias abiertas
        // Tip: usar bucle for-each para recorrer la lista
        // Buenas prácticas: validar datos antes de agregar
        // Analisis: útil para backend de soporte al cliente
    }
}
```

---

### Proyectos\_Ejercicio8.java – Estadísticas de Logins

```java
import java.util.HashMap;

public class Proyectos_Ejercicio8 {
    public static void main(String[] args) {
        // TODO: Sistema de estadísticas de logins de usuarios
        // Uso: HashMap<String, Integer> para contar logins por usuario
        // Datos de ejemplo:
        HashMap<String, Integer> logins = new HashMap<>();
        logins.put("ana", 5);
        logins.put("juan", 2);
        logins.put("maria", 7);

        // Objetivo: crear funciones para:
        // - incrementar login al iniciar sesión
        // - mostrar usuario con más logins
        // - calcular promedio de logins
        // Tip: iterar usando entrySet
        // Buenas prácticas: manejo de usuario inexistente
        // Analisis: refleja backend de análisis de actividad de usuarios
    }
}
```

---

