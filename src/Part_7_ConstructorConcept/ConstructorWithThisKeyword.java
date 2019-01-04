package Part_7_ConstructorConcept;

public class ConstructorWithThisKeyword {
	
	String name;  //Global variables or Class variables. if you want to initialize use this keyword
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) { //string name and int age in this constructor are local variables
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword CN = new ConstructorWithThisKeyword("Tajamul", 30);
	}
}
