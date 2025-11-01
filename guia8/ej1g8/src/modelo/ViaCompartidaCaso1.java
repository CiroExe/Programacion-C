package modelo;

public class ViaCompartidaCaso1 extends ViaCompartida{
	
	@Override
	public synchronized void entrar(Tren tren) {
		while(this.ocupado) {
			try {
				System.out.println(tren.nombre + " En espera");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Tren " + tren.nombre + " fue interrumpido");
				e.printStackTrace();
			}
		}
		
		this.ocupado = true;
		System.out.println(tren.nombre + " Entra a la via...");
	}
	
	@Override
	public synchronized void salir(Tren tren) {
		this.ocupado = false;
		System.out.println(tren.nombre + " Sale de la via...");
		notifyAll(); // Despierta al tren que esta esperando
	}

}
