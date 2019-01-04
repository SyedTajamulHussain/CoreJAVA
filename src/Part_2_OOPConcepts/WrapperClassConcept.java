package Part_2_OOPConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// data conversion from string to integer.
		String x = "100";
		System.out.println(x + 20); // simple concantation
		int j = Integer.parseInt(x);
		System.out.println(j + 20);

		WrapperClassConcept MMM = new WrapperClassConcept();
		MMM.doublee();
		MMM.booleann();
		MMM.inttostring();

	}

	// string to double
	public void doublee() {
		String p = "500.33";
		System.out.println(p + 20);
		double d = Double.parseDouble(p);
		System.out.println(d + 20);

	}

	// String to boolean
	public void booleann() {
		String K = "true";
		boolean b = Boolean.parseBoolean(K);
		System.out.println(b);
	}
	// character does not have parsing method
	
	//int to String
	public void inttostring() {
		int i=200;
		System.out.println(i+20);
		String s =String.valueOf(i);
		System.out.println(s+20);
	
	
}
}
