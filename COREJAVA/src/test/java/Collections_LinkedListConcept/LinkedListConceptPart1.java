package Collections_LinkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConceptPart1 {

	public static void main(String[] args) {
	
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//ADD 
		ll.add("QE");
		ll.add("Dev");
		ll.add("infra");
		ll.add("Devops");
		
		System.out.println("Content of LinkedList is " + ll);
		
		//AddFirst
		
		ll.addFirst("First");
		
		System.out.println("Content of LinkedList is " + ll);
		
		//AddLast
		
		ll.addLast("Last");
		System.out.println("Content of LinkedList is " + ll);
		
		//get
		System.out.println("get method " + ll.get(0));
		
		//Set
		
		ll.set(0, "QA");
		System.out.println("Set method " + ll.get(0));
		
		
		//Remove first remove last
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList is " + ll);
		
		//Remove value based on index
		ll.remove(0);
		
		System.out.println("Content of LinkedList is " + ll);
		
		//how to print all values of linked list.
		//For loop
		System.out.println("*************************** For loop ");
		for(int i=0 ; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		//advance for loop
		System.out.println("*************************** Advance for loop");
		
		for(String st : ll) {
			System.out.println(st);
		}
		
		//iterator
		
		System.out.println("*************************** iterator");
		
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
			
		//while loop
		System.out.println("*************************** while loop");
		
		int i = 0;
		while(ll.size()>i) {
			System.out.println(ll.get(i));
			i++;
		}
		
		
		
		
		
	}

}
