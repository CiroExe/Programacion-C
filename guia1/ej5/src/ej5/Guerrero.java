package ej5;

public class Guerrero {
	private String nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;
	
	public void mover(double inc_x, double inc_y)
	{
		this.x += inc_x;
		this.y += inc_y;
	}
	
	public void recibeDano(double cantidad)
	{
		this.armadura -= cantidad;
		if(this.armadura <= 0)
		{
			this.vitalidad -=  this.armadura;
			this.armadura = 0;
			if (this.vitalidad <= 0)
				this.vitalidad = 0;
		}
	}

}
