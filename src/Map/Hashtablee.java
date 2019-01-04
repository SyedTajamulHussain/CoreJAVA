//The important points about Java Hashtable class are:
//A Hashtable is an array of list. Each list is known as a bucket.
//The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
//It contains only unique elements.
//It may have not have any null key or value.
//It is synchronized

package Map;

import java.util.Hashtable;
import java.util.*;

public class Hashtablee {

	
	public static void main(String args[]){
	
		Hashtable<Integer,String> HM=new Hashtable<Integer,String>();
		
		HM.put(100,"D");  
		HM.put(102,"B");  
		HM.put(101,"C");  
		HM.put(103,"A"); 
		//HM.put(103,"E");
		
		
		//System.out.println(HM);
	
		for(Map.Entry m:HM.entrySet()){ 
		System.out.println(m.getKey()+" "+m.getValue()); 
		
		
		
		
		}
	}

}
