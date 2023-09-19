package prueba;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_e {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int vector[] = new int[10];
		
		System.out.println("Introduce 5 numeros de forma creciente");
		vector[0] = t.nextInt();
		vector[1] = t.nextInt();
		vector[2] = t.nextInt();
		vector[3] = t.nextInt();
		vector[4] = t.nextInt();
		
		Arrays.sort(vector); // por si los ha metido mal ordenado
		
		System.out.println("Dime otro numero");
		vector[5] = t.nextInt();
		
		Arrays.sort(vector);
		
		t.close();
	}

}
