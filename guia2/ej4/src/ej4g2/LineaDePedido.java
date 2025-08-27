package ej4g2;

public class LineaDePedido {
	private Producto producto;
	int cantidad;
	
	public LineaDePedido(Producto producto, int cantidad)
	{
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	public Producto getProducto()
	{
		return producto; 
	}
	
	public double getSubtotal()
	{
		return producto.getPrecio()*cantidad;
	}
}
