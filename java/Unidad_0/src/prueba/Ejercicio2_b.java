package prueba;

import java.util.Scanner;

public class Ejercicio2_b {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Dime un numero entre 0 y 9999");
		int numero = t.nextInt();
		
		int cont = 0;
		if (numero == 0) {
			cont++;
		}
		
		while (numero > 0) {
			numero /= 10;
			cont++;
		}
		
		System.out.println(cont);
	}

}
