package ej1;

public class Prueba {

	public static void main(String[] args) {
		 try {
	            Usuario u1 = new Usuario("Ciro", "a1234567");
	            System.out.println("Usuario creado: " + u1.getNombre());
	        } catch (NombreInvalidoException e) {
	            System.out.println("Error en el nombre: " + e.getMessage());
	        } catch (ContrasenaInvalidaException e) {
	            System.out.println("Error en la contraseña: " + e.getMessage());
	        }

	        // Prueba con errores
	        try {
	            Usuario u2 = new Usuario("", "123");
	        } catch (Exception e) {
	            System.out.println("Excepción atrapada: " + e.getMessage());
	        }
	}

}
