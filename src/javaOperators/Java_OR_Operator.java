package javaOperators;

public class Java_OR_Operator {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;
		System.out.println(a>b||a<c); //The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
		System.out.println(a>b|a<c); // The bitwise | operator always checks both conditions whether first condition is true or false.
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked 
	
	}

}
