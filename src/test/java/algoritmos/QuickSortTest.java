package algoritmos;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void pruebaQuickSort() {
		
		Integer[] datos = new Integer[]{ 10, 1, 8};
		
		datos = QuickSort.quickSort(datos);
		
		for (Integer dato : datos ) {
			System.out.println( dato );
		}		
	}
	
	@Test
	public void pruebaInPlaceQuickSort() {
		
		Integer[] datos = new Integer[]{ 10, 1, 6, 3, 5, 8, 7, 2, 4};
		
		InPlaceQuickSort.quickSort(datos);
		
		for (Integer dato : datos ) {
			System.out.println( dato );
		}
		
	}
	
	
}
