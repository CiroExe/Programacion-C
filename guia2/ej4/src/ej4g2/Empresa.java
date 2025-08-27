package ej4g2;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;

    // Constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    // Getters
    public String getNombre() { 
    	return nombre; 
    }
    
    public ArrayList<Empleado> getEmpleados()
    {
    	return empleados; 
    }
    public ArrayList<Producto> getProductos() {
    	return productos; 
    }
    
    public ArrayList<Pedido> getPedidos() {
    	return pedidos; 
    }

    // Setters
    public void setNombre(String nombre) {
    	this.nombre = nombre; 
    }

    // Métodos para agregar
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }

    // Buscar empleado por nombre
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    // Buscar producto por código
    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getNum() == codigo) {
                return p;
            }
        }
        return null;
    }

    // Calcular total de ventas
    public double calcularTotalVentas() {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getCostoTotal();
        }
        return total;
    }

    // Mostrar resumen de pedidos
    public void salida() {
        for (Pedido p : pedidos) {
            System.out.println("Pedido de " + p.getResponsable().getNombre() +
                               " el " + p.getFecha() +
                               " → Total: $" + p.getCostoTotal());
        }
    }
}