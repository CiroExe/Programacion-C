package ej5;

public class Domicilio {
	private String calle;
	private int numero;
	
	public Domicilio(String calle, int numero)
	{
		this.calle = calle;
		this.numero = numero;
	}
	
	@Override
	public Object clone()
	{
		try {
			Domicilio copia = (Domicilio)super.clone();
			return copia;
		}catch(CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

}
