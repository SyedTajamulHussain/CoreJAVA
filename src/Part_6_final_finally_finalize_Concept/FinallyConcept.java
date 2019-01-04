package Part_6_final_finally_finalize_Concept;
//finally is a block which will be executed all the time.
public class FinallyConcept {

	public static void main(String[] args) {
	divsion();
		}
	
	public static void divsion() {
		int i=1;
		try {
			System.out.println("inside try block");
			int K =i/0;
			System.out.println(K);
			
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divsion by o error");
		}
		finally {
			System.out.println("execute this code even after error");
		}
		
		
		
	}


}
