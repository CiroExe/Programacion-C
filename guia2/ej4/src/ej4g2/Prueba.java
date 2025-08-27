package ej4g2;
import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        // Crear la empresa
        Empresa empresa = new Empresa("Tech Mar del Plata");

        // Registrar empleados
        Empleado e1 = new Empleado("Ciro", "223-1234567", "ciro@email.com");
        Empleado e2 = new Empleado("Lucía", "223-7654321", "lucia@email.com");
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);

        // Registrar productos
        Producto p1 = new Producto(101, "Mouse óptico", 3500.0);
        Producto p2 = new Producto(102, "Teclado mecánico", 8200.0);
        Producto p3 = new Producto(103, "Monitor LED 24\"", 42000.0);
        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);

        // Crear líneas de pedido
        LineaDePedido l1 = new LineaDePedido(p1, 2); // 2 mouse
        LineaDePedido l2 = new LineaDePedido(p2, 1); // 1 teclado
        LineaDePedido l3 = new LineaDePedido(p3, 1); // 1 monitor

        // Crear pedido
        Pedido pedido = new Pedido(LocalDate.now());
        pedido.agregarLinea(l1);
        pedido.agregarLinea(l2);
        pedido.agregarLinea(l3);

        // Registrar pedido en la empresa
        empresa.agregarPedido(pedido);

        // Mostrar resumen
        System.out.println("Resumen de pedidos:");
        empresa.mostrarPedidos();

        System.out.println("\nTotal vendido por la empresa: $" + empresa.calcularTotalVentas());
    }
}