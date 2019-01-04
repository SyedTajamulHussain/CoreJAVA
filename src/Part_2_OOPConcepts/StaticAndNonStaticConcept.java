package Part_2_OOPConcepts;

public class StaticAndNonStaticConcept {

	//Global variable one is static and one non static.
	String name = "tajamul";  // non static global variable.
	static int Age = 35;   // static Global variable
	
	
public static void main(String[] args) {
		//how to call static method or variable
		
		sum(); //calling static method directly 
		StaticAndNonStaticConcept.sum();  //calling static method  by class name.
		
		System.out.println(Age); // calling static variable directly 
		System.out.println(StaticAndNonStaticConcept.Age);  // calling static variable by class name
		
		//how to call non static method or variable.
		
		StaticAndNonStaticConcept nonstatic = new StaticAndNonStaticConcept(); // create object
		
		nonstatic.sendmail();
	
		System.out.println(Age);
		System.out.println(nonstatic.name);
		

	}
public void sendmail() {
		System.out.println("this is non static method");
}
public static void sum() {
	System.out.println("this is static sum method");
}
}
