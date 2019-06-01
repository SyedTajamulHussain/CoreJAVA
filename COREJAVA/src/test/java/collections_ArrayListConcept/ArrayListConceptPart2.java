package collections_ArrayListConcept;

import java.util.ArrayList;

public class ArrayListConceptPart2 {

	public static void main(String[] args) {

		// Addall concept
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Tajamul");
		ar1.add("QE");
		ar1.add("Selienim");
		

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Zahid");
		ar2.add("Dev");
		ar2.add("JAVA");

		ar1.addAll(ar2);

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

		System.out.println("*******************");

		// RemoveAll concept
		ar1.removeAll(ar2);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("*******************");

		// RetainAll method is used to fetch common value.

		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Tajamul");
		ar3.add("QE");
		ar3.add("Selienim");

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Tajamul");
		ar4.add("Dev");
		ar4.add("JAVA");

		ar3.retainAll(ar4);
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}

	}

}
