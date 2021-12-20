package dpm.bloque5.estaticos;

public class Ficha {
	private String nombre;
	private int edad;
	private static String club = "desconocido";

	public Ficha(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public static void actualizaNombreClub(String club) {
		Ficha.club = club;
	}

	public String toString() {
		String s;
		s = this.nombre + ", " + this.edad + " años, es socio de " + club;
		return s;
	}

}