package ej6g3;

public class prueba {

	public static void main(String[] args) {
		Directorio fotos, viaje, misDocumentos, mp3, queen, theBeatles;
		Archivo arch1 = new Archivo("Recordatorio.txt", 5);
		fotos = new Directorio("fotos");
		fotos.addArchivo(new Archivo("CAM00053.jpg", 150));
		fotos.addArchivo(new Archivo("CAM00054.jpg", 250));
		fotos.addArchivo(new Archivo("CAM00055.jpg", 350));
		fotos.addArchivo(new Archivo("CAM00056.jpg", 200));
		fotos.addArchivo(new Archivo("CAM00057.jpg", 150));

		viaje = new Directorio("viaje");
		fotos.addSubdirectorio(viaje);
		viaje.addArchivo(new Link("Acceso directo a raiz.lnk", arch1));
		viaje.addArchivo(new Archivo("DSC08904.JPG", 1500));
		viaje.addArchivo(new Archivo("DSC08909.JPG", 1500));
		viaje.addArchivo(new Archivo("DSC08910.JPG", 1500));
		viaje.addArchivo(new Archivo("DSC08911.JPG", 1500));
		
		//Se puede crear una clase sistema de archivos y subir todos los directorios ahi
		System.out.println(fotos);
		System.out.println(viaje);
		System.out.println(fotos);
	}

}
