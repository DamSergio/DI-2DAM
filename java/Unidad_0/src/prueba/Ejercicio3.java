package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	static int NUM_ALUM = 5;
	private String nombre;
	private String apellido;
	private int nota;

	public Ejercicio3() {
		this.nombre = "";
		this.apellido = "";
		this.nota = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		ArrayList<Ejercicio3> alumnos = new ArrayList();
		
		for (int i = 0 ; i < NUM_ALUM ; i++) {
			Ejercicio3 alumno = new Ejercicio3();
			System.out.println("Dime el nombre del alumno");
			alumno.setNombre(t.next());
			
			System.out.println("Dime el apellido del alumno");
			alumno.setApellido(t.next());
			
			System.out.println("Dime la nota del alumno");
			alumno.setNota(t.nextInt());
			
			alumnos.add(alumno);
		}
		
		for (int i = 0 ;  i < NUM_ALUM ; i++) {
			alumnos.stream().filter(a -> a.nota == alumnos.stream().mapToInt(b -> b.nota).max().getAsInt()).forEach(null);;
		}
		
		t.close();
	}

}
