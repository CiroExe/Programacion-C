package modelo;

public class ViaCompartidaCaso4 extends ViaCompartida{
	@Override
	public synchronized void entrar(Tren tren) {
		if(tren.direccion.equals("A"))
			esperandoA++;
		else esperandoB++;
		boolean hayOpuestosEsperando = 
		        (tren.direccion.equals("A") && esperandoB > 0) ||
		        (tren.direccion.equals("B") && esperandoA > 0);

		    while ((trenesEnTramo > 0 && !tren.direccion.equals(direccionActual)) ||
		           (trenesEnTramo == 0 && direccionActual != null && !tren.direccion.equals(direccionActual) && hayOpuestosEsperando)
		    ) {
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
		this.trenesEnTramo--;
		System.out.println(tren.nombre + " Sale de la via... Trenes Restantes: "+ trenesEnTramo);
		
		if(this.trenesEnTramo == 0) {
			ocupado = false;
			if(tren.direccion.equals("A") && esperandoB > 0)
				this.direccionActual = "B";
			else if(tren.direccion.equals("B") && esperandoA > 0)
				this.direccionActual = "A";
			else
				this.direccionActual = null;
			notifyAll();
		}
	}
}
