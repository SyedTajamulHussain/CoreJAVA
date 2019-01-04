package Part_6_final_finally_finalize_Concept;
//finalize is the method which will be called automatically before garbage collector to clean unused memory

public class FinalizeConcept {

	public static void main(String[] args) {
		
		FinalizeConcept fc1 = new FinalizeConcept();
		FinalizeConcept fc2 = new FinalizeConcept();
		
		fc1=null;
		fc2=null;
		System.gc();
	}

}
