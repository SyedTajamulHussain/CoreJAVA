package collections_ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConceptPart1 {
	//Array List is dynamic array
	//ArrayList is the class available in collections
	//it can contain duplicate values
	//it maintain insertion order, o,1,2,3...
	//it is not synchronized....
	//it allows you random access to fetch any element.
	
	public static <E> void main(String[] args) {
	
		ArrayList ar = new ArrayList(); // this is non generic array list.
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(20.5);
		ar.add("Tom");
		
		System.out.println(ar.size());  // size of array
		
		System.out.println(ar.get(2)); //get values from  an index
		
		//for loop is used to print all values in array.
		
		for (int i=0 ; i<ar.size(); i++) {
			System.out.println(ar.get(0));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // this is generic array list and will only allow integers	
		
		ArrayList<String> ar2 = new ArrayList<String>(); // this is generic array list and will only allow Strings
	
		ArrayList<E> ar3 = new ArrayList<E>();// this is generic array and will store any value.
		
	//iterator
		
		Student s1 =new Student("Tajamul" , "First" , 10);
		Student s2 =new Student("Zahid" , "First" , 11);
		Student s3 =new Student("Zamin" , "First" , 12);
		Student s4 =new Student("Haadiya" , "First" , 13);
		
		
		ArrayList<Student> ar4 = new ArrayList<Student>();
		ar4.add(s1);
		ar4.add(s2);
		ar4.add(s3);
		ar4.add(s4);
		
		Iterator<Student> it =ar4.iterator();
		while(it.hasNext()) {
			Student emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.grade);
			System.out.println(emp.Rollnumber);
	}

}
}
