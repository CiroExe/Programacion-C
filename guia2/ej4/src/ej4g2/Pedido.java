package ej4g2;
import java.util.ArrayList;

public class Pedido {
	private Empleado emp;
	private String fecha;
	private ArrayList <LineaDePedido> linea = new ArrayList<>();
	
	public Pedido(String fecha)
	{
		this.fecha = fecha;
	}
	
    public void setEmpleado(Empleado emp)
    {
    	this.emp = emp;
    }
    
    public void agregaNuevaLinea(LineaDePedido nueva)
    {
    	this.linea.add(nueva);
    }
    
    public String getFecha()
    {
    	return fecha;
    }
    
    public Empleado getResponsable()
    {
    	return emp;
    }
    
    public double getCostoTotal() {
    	double costo = 0;
    	for(LineaDePedido p : linea)
    	{
    		costo += p.getSubtotal();
    	}
    	return costo;
    }
    
}
