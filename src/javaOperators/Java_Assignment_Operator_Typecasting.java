package javaOperators;

/*An example of typecasting is converting an integer to a string. This might be done in order to compare two numbers,
when one number is saved as a string and the other is an integer*/

public class Java_Assignment_Operator_Typecasting {
	
	public static void main (String args[]) {
		short a=10;
		short b=20;
		
		//a=a+b;  //Compile time error because 10+10=20 now int
		
		a=(short)(a+b);
		System.out.println(a);
	}

}
