package ej1;

public class Usuario {
	private String nombre;
	private String contrasena;
	
	public Usuario(String nombre, String contrasena) throws NombreInvalidoException, ContrasenaInvalidaException
	{
		this.setNombre(nombre);
		this.setContrasena(contrasena);
	}

	public String getNombre() {
		return nombre;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	
	/**
	 * Precondiciones: -Nombre distinto de null 
	 * 				   -El string no debe ser vacio
	 * 
	 * Postcondiciones: -El nombre pasado por parametro debe asignarse a la clase
	 * @param nombre
	 * @throws NombreInvalidoException
	 * @throws ContrasenaInvalidaException
	 */
	public void setNombre(String nombre) throws NombreInvalidoException
	{
		if(nombre == null || nombre == "")
			throw new NombreInvalidoException("El nombre es invalido");
		this.nombre = nombre;
	}
	
	/**
	 * Precondiciones: -Contrasena distinto de null 
	 * 				   -El string no debe ser vacio
	 * 
	 * Postcondiciones: -La contrasena pasada por parametro debe asignarse a la clase
	 * @param nombre
	 * @throws NombreInvalidoException
	 * @throws ContrasenaInvalidaException
	 */
	public void setContrasena(String contrasena) throws ContrasenaInvalidaException {
		if(contrasena == null || contrasena.length() <= 6 || !Character.isLetter(contrasena.charAt(0)))
			throw new ContrasenaInvalidaException("Contrasenia Invalida");
		this.contrasena = contrasena;
	}
	
	

}
