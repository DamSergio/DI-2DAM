package prueba;

import java.util.Arrays;

public class Ejercicio2_d {

	public static void main(String[] args) {
		int lista[] = {1,8,2,9,3,7,34,345,72,1,7,89,3,345,0};
		System.out.println(Arrays.toString(lista));
		
		int listaOrdenada[] = ordenarLista(lista);
		System.out.println(Arrays.toString(listaOrdenada));
		System.out.println(Arrays.toString(lista));
		
		int lista2[] = {1,8,2,9,3,7,34,345,72,1,7,89,3,345,0};
		System.out.println(Arrays.toString(lista2));
		
		int listaOrdenada2[] = ordenarLista2(lista2);
		System.out.println(Arrays.toString(listaOrdenada2));
		System.out.println(Arrays.toString(lista2));
	}

	private static int[] ordenarLista2(int[] lista) { //sin cambiar el original
		int list[] = new int[lista.length];
		for (int i = 0; i < lista.length; i++) {
			list[i] = lista[i];
		}
		
		Arrays.sort(list);
		return list;
	}

	private static int[] ordenarLista(int[] lista) { //cambiando el original
		Arrays.sort(lista);
		return lista;
	}

}
