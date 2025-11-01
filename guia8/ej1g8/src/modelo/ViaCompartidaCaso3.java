package modelo;

public class ViaCompartidaCaso3 extends ViaCompartida{
	
	@Override
	public synchronized void entrar(Tren tren) {
		if(tren.direccion.equals("A"))
			esperandoA++;
		else esperandoB++;
		while(trenesEnTramo > 0 && !tren.direccion.equals(direccionActual)) {
			try {
				System.out.println(tren.nombre + " En espera desde "+ tren.direccion);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(tren.direccion.equals("A"))
			esperandoA--;
		else esperandoB--;
		
		trenesEnTramo++;
		ocupado = true;
		direccionActual = tren.direccion;
		
		System.out.println(tren.nombre + " Entra a la via...");
	}
	
	@Override
	public synchronized void salir(Tren tren) {
		this.ocupado = false;
		this.trenesEnTramo--;
		System.out.println(tren.nombre + " Sale de la via... Trenes Restantes: "+ trenesEnTramo);
		
		if(this.trenesEnTramo == 0) {
			ocupado = false;
			direccionActual = null;
			notifyAll();
		}
	}

}
