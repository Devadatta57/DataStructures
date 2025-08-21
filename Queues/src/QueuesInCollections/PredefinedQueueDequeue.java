package QueuesInCollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PredefinedQueueDequeue {

	public static void main(String[] args) {
		Deque q = new ArrayDeque();
        q.offerFirst(111);
        q.addFirst(222);
        q.offerFirst(344);
//        System.out.println(q.pollFirst());
//        System.out.println(q.removeFirst());
		
     // System.out.println(q.pollLast());
      //System.out.println(q.removeLast());

      //  System.out.println(q.peekFirst());
      //  System.out.println(q.getFirst());
		
		System.out.println(q.removeFirstOccurrence(111));
		System.out.println(q.removeLastOccurrence(111));


		
		
	}
}
