package ej3;

public class prueba {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado();
		Empleado emp3 = new Empleado();
		Empleado emp4 = new Empleado();
		Empleado emp5 = new Empleado();
		Empleado emp6 = new Empleado();
		
		Categoria cat1 = new Categoria("Principiante", 80);
		Categoria cat2 = new Categoria("Operario", 100);
		Categoria cat3 = new Categoria("Experto", 130);
		
		//Empleado 1
		emp1.setNombre("Juan Perez");
		emp1.setCat(cat1);
		emp1.setHstrabajadas(100);
		emp1.setAntiguedad(4);
		
		//Empleado 2
		emp2.setNombre("Roberto Gonzalez");
		emp2.setCat(cat1);
		emp2.setHstrabajadas(120);
		emp2.setAntiguedad(8);
		
		//Empleado 3
		emp3.setNombre("Sandra Lopez");
		emp3.setCat(cat1);
		emp3.setHstrabajadas(120);
		emp3.setAntiguedad(14);
		
		//Empleado 4
		emp4.setNombre("German Gutierrez");
		emp4.setCat(cat2);
		emp4.setHstrabajadas(110);
		emp4.setAntiguedad(16);
		
		//Empleado 5
		emp3.setNombre("Vicente Hernandez");
		emp3.setCat(cat3);
		emp3.setHstrabajadas(100);
		emp3.setAntiguedad(9);
		
		//Empleado 6
		emp6.setNombre("Carolina Gomez");
		emp6.setCat(cat3);
		emp6.setHstrabajadas(115);
		emp6.setAntiguedad(20);
		
		System.out.println(emp1.detalle());
		System.out.println(emp2.detalle());
		System.out.println(emp3.detalle());
		System.out.println(emp4.detalle());
		System.out.println(emp5.detalle());
		System.out.println(emp6.detalle());
	}
}
