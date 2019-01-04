package Part_1_Java_Basics;

public class StringConcatenation {
//+ sign is the concantation operator.
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		String x ="Hello";
		String y= "world";
		
		double d=10.33;
		double d1=12.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b); // right to left execution
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(d+d1);
		System.out.println(x+y+d+d1);
		System.out.println("the value of a is:" +a);
		System.out.println("the addition of a and b is :"+(a+b));
		

	}

}
