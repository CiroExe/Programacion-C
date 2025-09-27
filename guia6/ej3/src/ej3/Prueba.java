package ej3;

public class Prueba {

	public static void main(String[] args) {
		Surtidor surtidor1 = new Surtidor();
		
		try {
			surtidor1.cargarCombustible("diesel", 2500);
			System.out.println("Se cargo combustible");
		} catch (TipoCombustibleInvalidException e) {
			System.out.println(e.getMessage());
		} catch (FaltaCombustibleException e) {
			System.out.println(e.getMessage());
		} catch (CargaInvalidaExeption e) {
			System.out.println(e.getMessage());
		}
		
		try {
			surtidor1.cargarCombustible("premium", 20100);
			System.out.println("Se cargo combustible");
		} catch (TipoCombustibleInvalidException e) {
			System.out.println(e.getMessage());
		} catch (FaltaCombustibleException e) {
			System.out.println(e.getMessage());
		} catch (CargaInvalidaExeption e) {
			System.out.println(e.getMessage());
		}
	}

}
