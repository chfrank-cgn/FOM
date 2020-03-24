
public class BubbleSort {
		
	public static void bubbleSort(int[] arr) {
		int i, j;

		for (i=0; i<arr.length; i++) {
			for (j=0; j<arr.length-1; j++) {
				if (arr[j]  < arr[j+1]) {
					vertausche(arr, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {44, 55, 12, 42, 94, 18, 6, 67, 34, 28, 33};
	
		ausgabe(arr);	
		bubbleSort(arr);
		ausgabe(arr);	
	}
	
	public static void vertausche(int[] arr, int i, int j) {
		int buffer = arr[i];
		arr[i] = arr[j];
		arr[j] = buffer;
	}
	
	public static void ausgabe(int[] arr) {
		for (int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

