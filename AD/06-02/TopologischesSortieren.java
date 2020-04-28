
public class TopologischesSortieren {

public static void main(String[] args) {
		
	// Adjazenzmatrix initialisieren mit 0 und 1
	int array[][] = {{0,1,1,0,0,0},
			 {0,0,0,0,0,0},
			 {0,1,0,0,0,0},
			 {0,0,0,0,1,0},
			 {0,1,0,0,0,0},
			 {0,0,0,1,1,0}};
		
	// Quellen finden
	for (int n=0; n<6 ; n++) {

		for(int j=0; j<6; j++) {
			boolean allesNull = true;
			boolean eineNull = false;
			for (int i=0; i<6; i++) {
				if (array[i][j]==1) allesNull = false;
				if (array[i][j]==0) eineNull = true;
			}
		
			if ((allesNull==true) && (eineNull==true)) {
				for (int i=0; i<6; i++) {
					array[i][j] = -1;
				}
				for (int k=0; k<6; k++) {
					array[j][k] = -1;
				}
				System.out.println("Quelle: "+j);
				break;
			}
		}

	}
}
}

