package javaOperators;

public class Java_Logical_Operators {

	

	public static void main(String[] args) {
		int a =10;
		int b= 5;
		int c=20;
		System.out.println(a<b&&a<c);//The logical && operator doesn't check second condition if first condition is false
		System.out.println(a<b&a<c); //The bitwise & operator always checks both conditions whether first condition is true or false.
	}

	}
