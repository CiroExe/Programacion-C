package ej6g3;

public class SistemaArchivos extends Directorio {
	private static SistemaArchivos _instance = null;
	
	private SistemaArchivos()
	{
		super("C:");
	}
	
	public static SistemaArchivos getInstance()
	{
		if(_instance==null)
			return new SistemaArchivos();
		return _instance;
	}
	
}
