package Part_1_Java_Basics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. While loop
		// disadvantage of while loop is if you don't give incremental or decremental part , code wil go to infinite loop.
		
		int a=1; // Initialization
		while(a<=10) { //condition
			System.out.println(a);
			a=a+1; //incremental/decremental
			
			
	}
		System.out.println("*************");
		//2.for loop
		for(int b=1;b<=10;b++) {  //Initialization, condition and incremental/decremental in same line
			System.out.println(b);

	}
		System.out.println("*************");
		for(int c=10;c>=-10;c--) {
		System.out.println(c);
}
}
}