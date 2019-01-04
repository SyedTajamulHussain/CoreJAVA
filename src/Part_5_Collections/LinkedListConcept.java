package Part_5_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String>  LL = new  LinkedList<String>();
		
		//Add
		LL.add("Tester");
		LL.add("Tajamul");
		LL.add("Sapient");
		
		//Print Linked list
		System.out.println("Content of LinkedList is :"+ LL);
		
		//AddFirst
		LL.addFirst("Sr");
		System.out.println("Content of LinkedList is :"+ LL);
		
		//AddLast
		LL.addLast("Noida");
		System.out.println("Content of LinkedList is :"+ LL);
		
		//Get
		System.out.println(LL.get(0));
		
		//set
		LL.set(2, "Syed tajamul");
		System.out.println("Content of LinkedList is :"+ LL);
		
		//Remove First and last element
		
		LL.removeFirst();
		LL.removeLast();
		System.out.println("Content of LinkedList is :"+ LL);
		
		//Remove by index
		LL.remove(2);
		System.out.println("Content of LinkedList is :"+ LL);
		
		//How to print all the values of Linked List
		//for loop
		System.out.println("Printing using for loop");	
		for(int n=0; n<LL.size();n++) {
			System.out.println(LL.get(n));
		}
		
		//advance for loop
		System.out.println("Printing using for Advance loop");
		
		for(String str :LL) {
			System.out.println(str);	
		}
		//Iterator
		System.out.println("Printing using Iterator");
		
		Iterator<String> it=LL.iterator();
		while(it.hasNext()){
			System.out.println(it.next());	
		}
		
		//while loop
		System.out.println("Printing using while loop");
		
		int nn=0;
		while(LL.size()>nn){
			System.out.println(LL.get(nn));
			nn++;
		}
	}

}
