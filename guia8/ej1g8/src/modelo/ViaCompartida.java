package modelo;

public abstract class ViaCompartida {
	protected boolean ocupado = false;
	protected String direccionActual = null;
	protected int esperandoA = 0;
	protected int esperandoB = 0;
	protected int trenesEnTramo = 0;
	
	public abstract void entrar(Tren tren);
	public abstract void salir(Tren tren);

}
