package Collections.Queue.Priority;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>(); // takes data in Increasing Order.
		Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder()); // for reverOrder of elements

		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		q1.offer(4);
		q1.offer(5);
		q2.offer(1);
		q2.offer(2);
		q2.offer(8);
		q2.offer(4);
		q2.offer(5);
		System.out.println(q1);
		System.out.println(q2);
//		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q2.poll());
	}
	
}
