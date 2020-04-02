
public class HeapSort {

	/**  
	 * sortiert ein Array mit heapsort
	 * @param a das array
	 */
	private static void heapSort(int[] a) {
	        generateMaxHeap(a);
		ausgabe(a, 0, a.length - 1);
	 
	        //hier wird sortiert
	        for(int i = a.length -1; i > 0; i--) {
	                vertausche(a, i, 0);
	                versenke(a, 0, i);
			ausgabe(a, 0, a.length - 1);
	        }
	}
	 
	/**
	 * Erstellt einen MaxHeap Baum im Array 
	 * @param a das array
	 */
	private static void generateMaxHeap(int[] a) {
	        //starte von der Mitte rueckwaerts.
	        for(int i = (a.length / 2) - 1; i >= 0 ; i--) {
	                versenke(a, i, a.length);
	        }
	}
	 
	/**
	 * versenkt ein element im baum
	 * @param a Das Array
	 * @param i Das zu versenkende Element
	 * @param n Die letzte Stelle im Baum die beachtet werden soll
	 */
	private static void versenke(int[] arr, int i, int n) {
		int li, re;
	        while(i <= (n / 2) - 1) {
	                // berechnet den Index des linken kindes
	 		li = i * 2;
			re = (i * 2) + 1;
	        		
	                // bestimme ob ein rechtes Kind existiert
			if (re < n) {
	                        // Wenn rechtes kind existiert und dieses groesser als das
	        		// linke Kind ist, nimm das rechte Kind
				if (arr[re] > arr[li]) li = re;
			}
	        	
	                // teste ob element sinken muss 
			if (arr[i] < arr[li]) {
	        		// falls ja, dann Elemente vertauschen
	                	vertausche(arr, i, li);
	                    	// Index i auf den Index des Kindes setzen und die while-
	        		// Schleife weiterlaufen lassen
				i = li;
			} else {
	        		// wenn das Element nicht sinken muss, die while-Schleife verlassen
				break;
			}
	        }
	}
	 
	/**
	 * Vertauscht die arraypositionen von i und kindIndex
	 * @param a Das Array in dem getauscht wird
	 * @param i der erste index
	 * @param kindIndex der 2. index
	 */
	private static void vertausche(int[] a, int i, int kindIndex) {
	        int z = a[i];
	        a[i] = a[kindIndex];
	        a[kindIndex] = z;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,33,37,31,41,30,15};
		// int[] arr = {44, 55, 12, 42, 94, 18, 6, 67};
		// int[] arr = {26,12,10,30,3,88};
		ausgabe(arr, 0, arr.length - 1);
		heapSort(arr);
		// ausgabe(arr, 0, arr.length - 1);
	}
	
	public static void ausgabe(int[] arr, int anf, int end) {
		for (int i=anf; i<=end; i++) {
        	System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
}

