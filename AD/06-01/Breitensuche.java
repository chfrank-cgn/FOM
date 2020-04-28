
import java.util.LinkedList;
import java.util.Queue;

public class Breitensuche {

	public static void main(String[] args) {
		
		// Adjazenzmatrix initialisieren mit 0 und 1
		int array[][] = {{0,0,0,1,1,1,0,0,0,0},
				 {0,0,0,1,0,0,0,0,0,0},
				 {0,0,0,1,0,0,0,0,0,0},
				 {0,0,0,0,1,0,0,0,0,0},
				 {0,0,0,0,0,1,0,0,0,0},
				 {0,0,0,0,0,0,0,0,0,0},
				 {0,0,0,0,0,1,0,0,0,0},
				 {1,1,0,0,0,0,1,0,0,0},
				 {0,0,0,0,0,0,0,1,0,1},
				 {0,1,1,0,0,0,0,0,0,0}};
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// zum Markieren, ob der Knoten mit Index i bereits besucht wurde
		boolean arrayBesucht[] = {false,false,false,false,false,false,false,false,false,false};
		
		// Start bei Knoten 9
		int v0 = 8;
		arrayBesucht[v0] = true;
		
		do {
			for (int i = 0; i<10; i++) {
				if (arrayBesucht[i] == false) { 
					if (array[v0][i] == 1) {
						queue.add(i);
						arrayBesucht[i] = true;
					}
				}
			}

			System.out.println("Besuchter Knoten: "+v0);
			v0 = queue.remove();

		} while (queue.size() > 0);

		System.out.println("Besuchter Knoten: "+v0);

	}
}

