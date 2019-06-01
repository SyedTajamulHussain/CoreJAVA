package collections_MapInterfaceConcept_HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class hashTableConcept {

	public static void main(String[] args) {
		
		//it is similar to hashmap , but it is synchnorized
		//Store the value on the basis of key vaule
		//Key -->Object-->Hashcode
		
		Hashtable H1 = new Hashtable();
		
		H1.put(1, "Tajamul");
		H1.put(2, "Tajamul");
		H1.put(3, "Zahid");
		H1.put(4, "Zahid");
		
		
		
		 
		//clone
		
	Hashtable H2 = new Hashtable();	
		
	H2=(Hashtable) H1.clone();
	
	System.out.println("Values of H1" + H1);
	System.out.println("Values of H2" + H2);
	
	//Clear
	H1.clear();
	System.out.println("Values of H1" + H1);
	System.out.println("Values of H2" + H2);
	
	
	//Contains
	
	Hashtable st = new Hashtable();
	
	st.put("A", "Haadiya");
	st.put("B", "Zamin");
	st.put("C", "Zainab");
	
	if(st.containsValue("Zainacb")){
	System.out.println("Value found");
	} 
	else {
		System.out.println("value not found");
	}
	
	
	//Printing all values using enumeration
	
	Enumeration e=st.elements(); 
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	
		//printing values using entry set
		Set s = st.entrySet();
	System.out.println(s);
		
	}
	}
}
