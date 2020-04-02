public class QuickSort {
	
	/**
	 * @param arr zu sortierendes Array
	 * @param anf Anfangsindex
	 * @param end Endindex
	 * @return Position j: der Index, an dem das Array zu teilen ist.
	 */
	public static int partition (int[] arr, int anf, int end) {
		// Als Pivot-Element key wird das 1. Feld-Element gewaehlt.
		int i, j, pivot;

		pivot = arr[anf];
		i = anf;
		j = end;
		
		do {
			while ((i < j) && (arr[i] < pivot)) i++;
			while ((j > i) && (arr[j] > pivot)) j--;

			if (i<j) {
				vertausche(arr, i, j);
			}

		} while (i < j);

		return i;
		
		/*  von links (i) werden Elemente >= Pivot-Element (key) und von rechts (j)
		 * 	Elemente <= Pivot-Element (key) gesucht und gegenseitig ausgetauscht
		 *  solange i < j.
		 *  Sobald i >= j wird die Position von j zurueckhgegeben. arr hat sich dann
		 *  so veraendert, dass es links von dieser Position nur noch Elemente <= Pivot-
		 *  Element, rechts nur noch Elemente >= Pivot-Element gibt.
		 */
			
	}
	
	public static void quicksort (int[] arr, int anf, int end) {
		if (anf < end) {
			ausgabe(arr, anf, end);
			
			int teilung = partition(arr, anf, end);
			ausgabe(arr, anf, end);
			
			quicksort(arr, anf, teilung-1);
			quicksort(arr, teilung+1, end);
		}
	}
	
	public static void main(String[] args) {
		// int[] arr = {12, 5, 7, 21, 13, 6, 9, 15};
		int[] arr = {24, 4, 21, 47, 6, 74, 15, 38};
		ausgabe(arr, 0, arr.length - 1);
		quicksort(arr, 0, arr.length - 1);
		ausgabe(arr, 0, arr.length - 1);
	}
	
	
	public static void ausgabe(int[] arr, int anf, int end) {
		for (int i=anf; i<=end; i++) {
	        	System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void vertausche(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}


