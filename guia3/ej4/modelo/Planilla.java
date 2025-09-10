package modelo;

public class Planilla {
	private String nombre;
    private double sueldoNeto;

    public Planilla(String nombre, double sueldoNeto) {
        this.nombre = nombre;
        this.sueldoNeto = sueldoNeto;
    }

    public String getNombre() { return nombre; }
    public double getSueldoNeto() { return sueldoNeto; }

    @Override
    public String toString() {
        return nombre + " - $" + sueldoNeto;
    }
}
