package Part_1_Java_Basics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater then b");
		}
		else {
			System.out.println("b is greater then a");
		}
//Comparison operators : < > ==> <== == !=
		
		int c=20;
		int d=20;
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a program to find highest number
		int e=100;
		int f=500;
		int g=150;
		
		//nested if else
		
		if(e>f & e>g) {
			System.out.println("e is the highest");
		}
		else if (f>g){
			System.out.println("f is the greatest");			
		}
	
		else {
			System.out.println("g is the greatest");
		}

}
}