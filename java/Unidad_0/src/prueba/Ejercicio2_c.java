package prueba;

import java.util.Scanner;

public class Ejercicio2_c {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Dime el dia del mes");
		int dia = t.nextInt();
		
		System.out.println("Dime el mes (numero)");
		int mes =  t.nextInt();
		
		System.out.println("Dime el año");
		int año = t.nextInt();
		
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (dia > 0 && dia <= diasMes[mes - 1]) {
			System.out.println("Fecha correcta");
		} else {
			System.out.println("Fecha incorrecta");
		}
	}

}
