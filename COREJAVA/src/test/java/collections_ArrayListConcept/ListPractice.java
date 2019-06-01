package collections_ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ListPractice {

	public static void main(String[] args) {

		ArrayList<userdefinedclass> ar = new ArrayList<userdefinedclass>();

		userdefinedclass person1 = new userdefinedclass("tajamul", 36, "QE");
		userdefinedclass person2 = new userdefinedclass("Zahid", 34, "Dev ops");
		userdefinedclass person3 = new userdefinedclass("Zamin", 4, "toddler");
		userdefinedclass person4 = new userdefinedclass("Haadiya", 1, "toddler");

		ar.add(person1);
		ar.add(person2);
		ar.add(person3);
		ar.add(person4);

		Iterator<userdefinedclass> it = ar.iterator();

		while (it.hasNext()) {

			userdefinedclass person = it.next();
			System.out.println(person.name);
			System.out.println(person.age);
			System.out.println(person.skill);
		}

	}

}
