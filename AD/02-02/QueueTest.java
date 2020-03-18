import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> meineQueue = new LinkedList<String>();				

		meineQueue.add("First");
		meineQueue.add("Second");
		meineQueue.add("Third");
		meineQueue.add("Fourth");
		
		printQueue(meineQueue);
		
	}

	private static void printQueue(Queue<String> q){
		String elem;
		while (true) {
			elem = q.poll();
			if (elem == null) break;
			System.out.println(elem);
		}
	}
}

