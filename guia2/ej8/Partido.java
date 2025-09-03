package ej8g2;
import java.util.ArrayList;

public class Partido {
	private int fecha;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesE1;
	private int golesE2;
	private String resultado_final;
	
	public Partido(int fecha)
	{
		this.fecha = fecha;
	}
	
	public Partido(Equipo equipo1, Equipo equipo2, int fecha)
	{
		this(fecha);
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public void setEquipo1(Equipo e1)
	{
		this.equipo1 = e1;
	}
	
	public void setEquipo2(Equipo e2)
	{
		this.equipo2 = e2;
	}
	
	public void addGol(Jugador jugador)
	{
		jugador.registrarGoles();
		if(jugador.getEquipo() == equipo1) {
			this.golesE1++;
			jugador.getEquipo().addGoles(golesE1);
			equipo2.addGolesEnContra(golesE1);
		}
		else if (jugador.getEquipo() == equipo2){
			this.golesE2++;
			jugador.getEquipo().addGoles(golesE2);
			equipo1.addGolesEnContra(golesE2);
		}
		else
			System.out.println("El jugador no juega en ningun equipo");
	}
	
	public void setResultado()
	{
		if(golesE1 > golesE2)
		{
			equipo1.setGanados();
			equipo2.setPerdidos();
		}
		else if (golesE2 > golesE1) 
		{
			equipo2.setGanados();
			equipo1.setPerdidos();
		}else {
			equipo1.setEmpatados();
			equipo2.setEmpatados();
		}
	}
	
}
