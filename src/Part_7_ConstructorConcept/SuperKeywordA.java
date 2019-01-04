package Part_7_ConstructorConcept;

public class SuperKeywordA {

	public SuperKeywordA() {
		System.out.println("Default parent class constructor");  // if i add super in extended class parametirized const will be called
																// with out super keyword , default constructor will be called
	}
	
	public SuperKeywordA(int i) {
		System.out.println("parent class constructor value is " + i);
	}
}

//Super keyword is used to call parent class constructor