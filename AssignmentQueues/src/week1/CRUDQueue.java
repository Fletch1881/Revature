package week1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class CRUDQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			q.add(i);
		}
		System.out.println("Queue after initialization: "+q);
		
		q.add(null);
		q.add(23);
		q.add(103);
		q.add(55);
		q.add(23);
		
		System.out.println("Queue after update: "+q);
		
		q.remove(0);
		q.remove(null);
		
		while(q.remove(23)) {}
		
		System.out.println("Queue after remove: "+q);
		
		
	
		// main difference between PriorityQueue and LinkedList is that LinkedList can accept null values. The other difference is the iterator for the list class that
		// is bidirectional will only work with the linked list but not the PriorityQueue. 
	}

}
