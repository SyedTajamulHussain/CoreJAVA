package collection_mapInterfaceConcept_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("Tajamul", "Haadiya");
		hm.put("zahid", "Zamin");

		System.out.println(hm);

		for (Entry GM : hm.entrySet()) {
			System.out.println(GM.getKey() + "   " + GM.getValue());

			// user defined class in hashmap

			HashMap<Integer, practiceClass> hm1 = new HashMap<Integer, practiceClass>();

			practiceClass pr1 = new practiceClass("Tajamul", "Delhi", 747);
			practiceClass pr2 = new practiceClass("Zahid", "Delhi", 747);
			practiceClass pr3 = new practiceClass("Haadiya", "Delhi", 747);

			hm1.put(1, pr1);
			hm1.put(1, pr2);
			hm1.put(1, pr3);
			
			//printing
			
			for(Entry FF : hm1.entrySet()) {
				
			}

		}
	}

}
