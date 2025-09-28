package ej5;

public class Gato extends Animal{
	
	public Gato(String string, int i)
	{
		super(i, string);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
			throw new CloneNotSupportedException("Esta subclase no permite clonacion");
	}
	
}
