package prueba;
import modelo.Departamento;
import modelo.Empleado;
import modelo.Temporario;
import modelo.Permanente;
import modelo.Principiante;
import modelo.Intermedio;
import modelo.Experto;
import modelo.Empresa;
import modelo.Planilla;

public class prueba {

	public static void main(String[] args) {
			Empresa empresa = new Empresa("Techint S.A");
			Departamento dpto1= new Departamento("Mantenimiento");
			Empleado emp1 = new Intermedio("Juan Perez", "Matheu 2343",1234, 7,12000);
			Empleado emp2 = new Temporario("Julio Garcia", "Colon 5561", 3209, 80, 160);
			Empleado emp3 = new Temporario("Martin Rodriguez", "Mitre 3451", 3210, 70, 100);
			dpto1.addEmpleado(emp1);
			dpto1.addEmpleado(emp2);
			dpto1.addEmpleado(emp3);
			empresa.addDepartamento(dpto1);
			
			
			Departamento dpto2= new Departamento("Contabilidad");
			Empleado emp4 = new Experto("Martin Anchorena", "Luro 3489",9876, 18,13000);
			Empleado emp5 = new Principiante("Sandra Fernandez", "Cordoba 3843", 1276, 6, 11500);
			Empleado emp6 = new Principiante("Luis Gomez", "Formosa 2354", 1544, 2, 10500);
			Empleado emp7 = new Intermedio("Lucas Benitez", "Castelli 4563", 1634, 12, 12500);
			dpto2.addEmpleado(emp4);
			dpto2.addEmpleado(emp5);
			dpto2.addEmpleado(emp6);
			dpto2.addEmpleado(emp7);
			empresa.addDepartamento(dpto2);
			
	}

}
