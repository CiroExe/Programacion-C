package modelo;

public class ViaCompartidaCaso2 extends ViaCompartida{
	
	@Override
	public synchronized void entrar(Tren tren) {
		if(tren.direccion.equals("A"))
			esperandoA++;
		else esperandoB++;
		while(this.ocupado || (direccionActual != null && !direccionActual.equals(tren.direccion))) {
			try {
				System.out.println(tren.nombre + " En espera desde "+ tren.direccion);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(tren.direccion.equals("A"))
				esperandoA--;
			else esperandoB--;
			
		}
		
		this.ocupado = true;
		System.out.println(tren.nombre + " Entra a la via...");
	}
	
	@Override
	public synchronized void salir(Tren tren) {
		this.ocupado = false;
		
		if(tren.direccion.equals("A") && esperandoB > 0)
			this.direccionActual = "B";
		else if(tren.direccion.equals("B") && esperandoA > 0)
			this.direccionActual = "A";
		else
			this.direccionActual = null;
		System.out.println(tren.nombre + " Sale de la via...");
		notifyAll(); // Despierta al tren que esta esperando
	}

}
