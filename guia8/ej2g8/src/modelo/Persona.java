package modelo;

public class Persona extends Thread{
	protected String nombre;
	protected MonitorMostrador monitor;
	protected static int num = 0;
	protected int turno;
	
	public Persona(String nombre, MonitorMostrador monitor)
	{
		this.nombre = nombre;
		this.monitor = monitor;
		this.turno = num++;
	}
	
	@Override
	public void run() {
		try {
			monitor.atender(this);
			Thread.sleep(500+ (int)(Math.random() * 1000));
			monitor.fueAtendido(this);
			for(int i=0; i<5; i++) {
				monitor.atender(this);
				Thread.sleep((int)(Math.random() * 2000));
				monitor.fueAtendido(this);
			}
			System.out.println("Fin de la ejecucion para "+this.nombre);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
