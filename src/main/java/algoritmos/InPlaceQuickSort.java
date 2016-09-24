package algoritmos;

public class InPlaceQuickSort {

	public static Integer[] quickSort(Integer[] arreglo) {
		quickSort(arreglo, 0, arreglo.length -1);
		return arreglo;
	}

	public static void quickSort(Integer[] arreglo, int inicio, int fin) {
		
		int i = inicio;
		int j = fin;
		int pivote = arreglo[inicio + (fin - inicio)/2];
	
		while ( i <= j ) {
			while (arreglo[i] < pivote) {
				i++;
			}
			while (arreglo[j] > pivote) {
				j--;
			}
			if ( i <= j ) {
				int temp = arreglo[j];
				arreglo[j] = arreglo[i];
				arreglo[i] = temp;
				i++;
				j--;
			}
		}
		
		if (inicio <  j)
			quickSort(arreglo, inicio, j);
		if (i < fin)
			quickSort(arreglo, i, fin);
	}

}
