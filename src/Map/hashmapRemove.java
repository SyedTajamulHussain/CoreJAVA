package Map;

import java.util.HashMap;

public class hashmapRemove {

	public static void main(String[] args) {
		
		// create and populate hash map  
		
	HashMap<Integer,String> Object = new HashMap<Integer,String>();
	
	Object.put(1, "this is one");
	Object.put(2,"This is two");
	Object.put(3,"This is three");
	
	System.out.println(Object);
	
	// Remove value for key
	
	Object.remove(1);
	System.out.println(Object);
	}

}
