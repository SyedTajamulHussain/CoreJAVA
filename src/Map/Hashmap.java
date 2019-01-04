//HashMap is a Map based collection class that is used for storing Key & value pairs, it is denoted 
//as HashMap<Key, Value> or HashMap<K, V>.

package Map;

import java.util.HashMap;
import java.util.Map;


public class Hashmap {

	public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();  // Key is a string and value is a integer
	
	  hm.put("TAJAMUL",100);  
	  hm.put("ZAHID",200);  
	  hm.put("ZAMIN",300); 
	  hm.put("TAJAMUL",200); 
	  
	 
		   for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 
	  
	 
		   
		   
		   //System.out.println(hm.get("TAJAMUL"));  //Earlier value is replaced with new value.
		   											// Map does not allow duplicate values.
		   
		 //  System.out.println(hm);
		  }  
		 }  
	} 



// Map interface contain list of methods , map help to identify unique value
// can get, put and remove 

//Hashmap : elements are unsorted and unordered
//HashTable : all elemts are synchrozed
//linkedHashMap : is one where elements are linked with each other. it maintain order...1  3 
//Treemap : sort order is maintained  A C B.. it wil put B before C.


