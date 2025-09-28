package ej5;

public class Persona implements Cloneable, Comparable{
	private int DNI;
	private String apellido;
	private Domicilio domicilio;
	Animal mascota;
	private int legajo;
	
	public Persona(int DNI, String apellido, Domicilio dom, int legajo, Animal animal)
	{
		this.DNI = DNI;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.legajo = legajo;
		this.mascota = animal;
	}
	
	@Override
	public Object clone()
	{
		try {
			Persona copia = (Persona)super.clone();
			copia.domicilio = (Domicilio)domicilio.clone();
			copia.mascota = (Animal)mascota.clone();
			return copia;
		}catch(CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", apellido=" + apellido + ", domicilio=" + domicilio + ", legajo=" + legajo
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		int cmp = this.apellido.compareTo(((Persona) o).getApellido());
		if(cmp != 0)
			return cmp;
		
		return Integer.compare(this.DNI, ((Persona)o).getDNI());
	}
	
	
}
