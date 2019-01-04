package Part_1_Java_Basics;

public class incrementAndDecrementOperators {

	public static void main(String[] args) {
	
		//++ is increment
		//-- is decrement
		
		int A =1;
		int B =A++; // Post increment
		
		System.out.println(A);
		System.out.println(B);
		
		int c =1;
		int d =++c; //pre increment
		
		System.out.println(c);
		System.out.println(d);
		
		int e =2;
		int f =e--;  //Post decrement
		
		System.out.println(e);
		System.out.println(f);
		
		int g = 2;
		int h = --g; //Post decrement
		
		System.out.println(g);
		System.out.println(h);
	}

}
