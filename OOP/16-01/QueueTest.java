// QueueTest.java

class Queue {

	private static Queue q;

	private Queue() {
		System.out.println("Initializing printer queue");
	}

	public static Queue initQueue() {
		if (q == null) { q = new Queue(); }
		return q;
	}
}

public class QueueTest {

	public static void main(String[] args) {
		
		Queue q1 = Queue.initQueue();
		Queue q2 = Queue.initQueue();

	}
}

