package Part_7_ConstructorConcept;

public class Constructor_Concept {
	
	public Constructor_Concept() {
		System.out.println("Default Constructor");
	}
	
	public Constructor_Concept(int i) {
		
		System.out.println("Single parameter Construcot");
		System.out.println("value of i is :" + i);
	}
	
	public Constructor_Concept(int i,int y) {
		System.out.println("two parameter constructor");
		System.out.println("value of i is :" + i);
		System.out.println("value of y is :" + y);
	}

//constructor overloading is  happening as same constructor with different parameters are defined above.	

	public static void main(String[] args) {
	
		Constructor_Concept Obj1 = new Constructor_Concept();
		Constructor_Concept Obj2 = new Constructor_Concept(10);
		Constructor_Concept Obj3 = new Constructor_Concept(20,30);
	}

}
