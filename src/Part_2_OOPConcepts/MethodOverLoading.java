package Part_2_OOPConcepts;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();

		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		}
	public static void main(int i){  // main method overloading 
		
	}
	//we can overload main method also
	// Method overloading - when the method name is same but different arguments/input parameters
	//you can not create method under existing method.
	public void sum() {
		System.out.println("sum method..zero parameter");
	}

	public void sum(int i) {
		System.out.println("sum method..one input parameters");
		System.out.println(i);
	}

	public void sum(int i, int k) {
		System.out.println("sum method.. two input parameters");
		System.out.println(i * k);
	}
}
