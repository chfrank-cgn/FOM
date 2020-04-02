/**
 * 
 * @author Prof. Dr. Oliver S. Lazar
 *
 * Diese Klasse implementiert den CountingSort-Algorithmus
 * fuer Integer-Arrays mit Werten >=0, doppelte Werte sind erlaubt.
 */

public class CountingSort {

	/**
	 *  Die Indizes der Elemente aus diesem Array entsprechen den moeglichen
	 *  Werten aus dem zu sortierenden Array. Die Elemente enthalten die 
	 *  Anzahl, wie oft der jeweilige Wert vorkommt.
	 */
	private static int[] countArray;

	/**
	 * Diese Methode durchlaeuft das Array und fuer jeden gefundenen Wert
	 * wird das zugehoerige Element aus dem countArray inkrementiert (also
	 * countArray[wert]++).
	 * @param a Das zu sortierende Array
	 * @return Das sortierte Array.
	 */
	public static int[] sort(int[] a){
		getMax(a);
		for(int j=0; j <a.length; j++){
			countArray[a[j]]++;
		}
		getSortedArray(a);
		
		return a;
	}
	
	//------------------------------------------------------------------------------------------------------------
	/**
	 * Diese Methode bestimmt den groessten Wert und erzeugt das countArray in 
	 * der notwendigen Groesse.
	 * @param a Das zu sortierende Array
	 */
	private static void getMax(int[] a){
		int max = a[0];
		for(int i=1; i<a.length; i++){
			if(a[i]>max)
				max = a[i];
		}
		countArray = new int[max+1];
	}
	
	
	//------------------------------------------------------------------------------------------------------------
	/**
	 * Diese Methode erzeugt aus dem countArray das sortierte Array.
	 * @param a Das sortierte Array.
	 */
	private static void getSortedArray(int[] a){
		int k=0;
		for(int i=0; i<countArray.length; i++){
			for(int j=0; j<countArray[i]; j++){
				a[k] = i;
				k++;
			}
		}
	}

	//------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		int[] arr = {4, 3, 11, 4, 8, 7, 9, 4, 2, 6};
		// int[] arr = {44, 55, 12, 42, 94, 18, 6, 67};
		ausgabe(arr, 0, arr.length - 1);
		sort(arr);
		ausgabe(arr, 0, arr.length - 1);
	}
	
	public static void ausgabe(int[] arr, int anf, int end) {
		for (int i=anf; i<=end; i++) {
        	System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

