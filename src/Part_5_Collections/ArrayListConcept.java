package Part_5_Collections;

import java.util.ArrayList;
import java.util.Iterator;

/*Collection is a framework to store and manipulate groups of object.
Different Operations : Searching , insertion, manipulation, sorting and Deletion
It consists different interfaces :
Set
List 
Queue
Dequeue

It consists of following classes:
	ArrayList
	Vector
	LinkedList
	Hashset
	TreeSet
	Priority Queue*/


public class ArrayListConcept {

	public static <E> void main(String[] args) {
		int a[] = new int[3]; //Static array , space is fixed/
		
		//Dynamic array --Array list.
		//can hold dublicate values /elements
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size()); // size of array , 
		ar.add(40);
		ar.add(50);
		ar.add("test");
		ar.add(a);
		ar.add(12.5);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));  // Getting value by array index
		
		//to Print all values of array list
		//for loop can be used
		//or iterator can alos be used.
		
		for(int i=0;i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//non Generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("test");  //this is not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		//ar2.add(10); // this is not allowed
		
		ArrayList<E> ar3 = new ArrayList<E>();  // as this is static you have to define in E in main method also
		
		
	//Employee class objects
		Employee E1 = new Employee("Tajamul", 37, "QA");
		Employee E2 = new Employee("Tajamul1", 37, "QAa");
		Employee E3 = new Employee("Tajamul2", 37, "BBB");
		
		//Create Arraylist
		
		ArrayList <Employee> ar4 = new ArrayList<Employee>();
		ar4.add(E1);
		ar4.add(E2);
		ar4.add(E3);
		//iterator to print values
		
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.age);
			System.out.println(emp.Name);
			System.out.println(emp.Dept);
		}
		
	}

}
