package collection_mapInterfaceConcept_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		/*
		 * 1.HashMap is the class which implements Map interface 2.extends Abstract map
		 * 3.it contains only unique values/elements 4.stores the value in key / value
		 * pair 5.it may have one null key and multiple null values 6.it maintain no
		 * order. 7.Hashmap is non synchronized..i.e it is not thread safe...multiple threads can attach map at the same time
		 */

		HashMap<Integer, String> Hm = new HashMap<Integer, String>();

		Hm.put(1, "Tajamul");
		Hm.put(2, "Zahid");
		Hm.put(3, "Zamin");
		Hm.put(4, "Haadiya");

		System.out.println(Hm);
		System.out.println(Hm.get(1));
		System.out.println(Hm.get(4));

		for (Entry GM : Hm.entrySet()) {

			System.out.println(GM.getKey() + "  " + GM.getValue());
		}

		System.out.println(Hm);

		Hm.remove(2);
		System.out.println(Hm);
		System.out.println("******************************************");
		
		
		HashMap<Integer, Student> hm2 = new HashMap<Integer, Student>();

		Student st = new Student("TAJAMUL", "FIrst", 100);
		Student st1 = new Student("Zahid", "FIrst", 101);
		Student st2 = new Student("Zamin", "FIrst", 102);
		Student st3 = new Student("Haadiya", "FIrst", 103);

		hm2.put(1, st);
		hm2.put(2, st1);
		hm2.put(3, st2);
		hm2.put(4, st3);

		for (Entry<Integer, Student> em : hm2.entrySet()) {
			int k = em.getKey();
			Student v = em.getValue();

			System.out.println(k);
			System.out.println(v.name + "  " + v.grade + "   " + v.Rollnumber);

		}

	}
}
