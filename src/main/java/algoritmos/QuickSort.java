package algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static Integer[] quickSort(Integer[] arreglo) {
		
		List<Integer> res = quickSort(Arrays.asList(arreglo));
		Integer[] resultado = res.toArray( new Integer[0]); 
		return resultado;
	}
	
	public static List<Integer> quickSort(List<Integer> arreglo) {
	
		if ( arreglo.size() <= 1 ) {
			return arreglo;

		} else {
		
			int posicion = arreglo.size() / 2;
			int pivote = arreglo.get(posicion);
			
			List<Integer> menores = new ArrayList<Integer>();
			List<Integer> pivotes = new ArrayList<Integer>();
			List<Integer> mayores = new ArrayList<Integer>();
		
			for (Integer valor : arreglo) {
				if ( valor < pivote ) {
					menores.add(valor);				
				} else if ( valor == pivote) {
					pivotes.add(valor);				
				} else {
					mayores.add(valor);
				}
			}
			menores = quickSort(menores);
			mayores = quickSort(mayores);
			
			arreglo = menores;
			arreglo.addAll( pivotes );
			arreglo.addAll( mayores );
			
			return arreglo;
		}
	}

	
}
