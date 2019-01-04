package Part_7_ConstructorConcept;

public class SuperKeywordB extends SuperKeywordA {

	public SuperKeywordB() {
		super(10);
		System.out.println("Chile class constructor");
		
	}
	
	
	public static void main(String[] args) {
	
		SuperKeywordB obj = new SuperKeywordB();
	}

}
