package Map;

import java.util.Hashtable;

public class HashtableRemove {

	public static void main(String[] args) {
		Hashtable<Integer,String> HM=new Hashtable<Integer,String>();
		HM.put(100, "Tajamul");
		HM.put(200, "Zahid");
		HM.put(300, "Zamin");
		HM.put(400, "Hashim");
		System.out.println("value befor removing" + HM);
		
		HM.remove(100);
		System.out.println("value after removing" + HM);
	}

}
