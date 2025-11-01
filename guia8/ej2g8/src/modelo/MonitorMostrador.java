package modelo;

public class MonitorMostrador {
	private int totalPersonas;
	private boolean mostradorDisponible = true;
	private int turnoActual = 1;
	private boolean todosAtendidos = false;
	private int personasAtendidas = 0;
	
	
	public MonitorMostrador(int totalPersonas) {
		this.totalPersonas = totalPersonas;
	}
	
	
	public synchronized void atender(Persona p) {
		//Verifica si fueron atendidos todos en orden. Si no agarra un hilo cualquiera
		
		while(!mostradorDisponible || (!todosAtendidos && p.turno != turnoActual)){
			try {
				System.out.println("El clinte "+p.nombre+" esta esperando a ser atendido...");
				wait();
			}catch(InterruptedException e) {
				System.out.println("No se pudo atender...");
			}
		}
		System.out.println("El clinte "+p.nombre+" esta siendo atendido...");
		mostradorDisponible = false;
	}	
	
	public synchronized void fueAtendido(Persona p)
	{
		this.mostradorDisponible = true;
		if(!todosAtendidos && p.turno == turnoActual) {
			this.turnoActual++;
			this.personasAtendidas++;	
			System.out.println("Turno actual: " + turnoActual + ", personas atendidas: " + personasAtendidas);
			if(personasAtendidas == totalPersonas-1)
				todosAtendidos = true;
		}
		System.out.println("El cliente "+p.nombre+" fue atendido...");
		notifyAll(); //Despierta a todos los hilos en espera
	}
}
