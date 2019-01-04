package Part_2_OOPConcepts;

public class Methodsinjava {
	
	
	
	public static void main(String[] args) {   // main method is the starting point of execution. // main method is void as it does not have any return type.
		
		Methodsinjava obj = new Methodsinjava();  // one obj has been created and all non static methods will be given to this obj.
		
		obj.test();     
		
		int l= obj.testtwo();
		System.out.println(l);
		
		String p =obj.testthird();
		System.out.println(p);
		
		int div=obj.testforth(30,10);
		System.out.println(div);
		
		char ch=obj.testfifth();
		System.out.println(ch);
	}

	// non static methods
	// void does not return any value.
	// return type is void
	public void test() {   // no input and no output
		System.out.println("this is 1st method");
	}

	// return type is int
	public int testtwo() {   // no input some output.
		System.out.println("this is 2nd method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
//return type String
	public String testthird() {  // no input some output.
		System.out.println("this is 3rd method");
		String s = "selienium";
		return s;
	}
//return type int
	public int testforth(int x, int y) {  // some input some output.
		System.out.println("this is 4th method");
		int d = x / y;
		return d;
	}
	public char testfifth() {
		System.out.println("this is 5th method");
		char c ='$';
		return c;
	}
}