package java_array_list;

import java.util.ArrayList;
import java.util.Iterator;

class Java_ArrayList_By_Iterator_Interface {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();     //Creating array list 
		
		  list.add("Abc");//Adding object in arraylist  
		  list.add("BBB");  
		  list.add("CCC");  
		  list.add("DDDD");  
		//Traversing list through Iterator  
		
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		}  


/*There are two ways to traverse collection elements:

By Iterator interface.
By for-each loop.*/

//Java ArrayList class uses a dynamic array for storing the elements
