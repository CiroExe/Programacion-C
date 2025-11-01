package modelo;

public class Tren extends Thread{
	protected String nombre;
	protected String direccion; // 0 = Norte; 1 = Sur; 2 = Este; 3 = Oeste
	protected ViaCompartida via;
	
	public Tren(String nombre, String direccion, ViaCompartida via)
	{
		this.nombre = nombre;
		this.direccion = direccion;
		this.via = via;
	}
	
	@Override
	public void run()
	{
		try
		{
			via.entrar(this);
			System.out.println(nombre+" esta cruzando");
			Thread.sleep(2000 + (int)(Math.random() * 2000)); // entre 2 y 4 segundos
			via.salir(this);
			
		}catch(InterruptedException e) {
			System.out.println("Tren "+ nombre +" fue interrumpido");
		}
	}

}
