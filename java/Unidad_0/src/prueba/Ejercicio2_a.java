package prueba;

import java.util.Scanner;

public class Ejercicio2_a {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Dime el primer coeficiente de una ecuacion de segundo grado");
		int a = t.nextInt();
		
		System.out.println("Dime el segundo coeficiente de una ecuacion de segundo grado");
		int b = t.nextInt();
		
		System.out.println("Dime el tercer coeficiente de una ecuacion de segundo grado");
		int c = t.nextInt();
		
		double solucion1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double solucion2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		if (Double.isNaN(solucion1) || Double.isNaN(solucion2)) {
			System.out.println("No tiene solucion");
		} else {
			System.out.println(solucion1 + " " + solucion2);
		}
		
		t.close();
	}

}
