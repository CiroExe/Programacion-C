package ej5g2;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		Categoria cat1 = new Categoria("Jefe");
		Categoria cat2 = new Categoria("Gerente");
		Categoria cat3 = new Categoria("Empleado");
		Chofer chofer1;
		Chofer chofer2;
		Chofer chofer3;
		Domicilio dom1 = new Domicilio("9 de julio", 321);
		Domicilio dom2 = new Domicilio("25 de mayo", 123);
		Domicilio dom3 = new Domicilio("3 de febrero", 213);
		Colectivo colectivo1 = new Colectivo("1114");
		Colectivo colectivo2 = new Colectivo("1234");
		
		
		emp.setNombre("Sancor S.A");
		
		//Agrego categorias
		cat1.setSueldo(35000);
		emp.agregarCategoria(cat1);
		
		cat2.setSueldo(28500);
		emp.agregarCategoria(cat2);
		
		cat3.setSueldo(20000);
		emp.agregarCategoria(cat3);
		
		//Agrega colectivos
		emp.agregarColectivo(colectivo1);
		emp.agregarColectivo(colectivo2);
		emp.agregarColectivo(new Colectivo("4321"));
		
		//Agrego choferes
		emp.agregarChofer(new Chofer("Mariano Diaz", dom1, emp.getCategorias().get(0)));
		emp.agregarChofer(new Chofer("Lautaro Martinez", dom2, emp.getCategorias().get(1)));
		emp.agregarChofer(new Chofer("Lionel Messi", dom3, emp.getCategorias().get(2)));
		emp.getChoferes().get(0).asignaColectivo(colectivo1);
		emp.getChoferes().get(1).asignaColectivo(emp.getColectivos().get(2));
		
		
		
		for (Chofer chofer : emp.getChoferes())
		{
			System.out.println(chofer);
		}
	}

}
