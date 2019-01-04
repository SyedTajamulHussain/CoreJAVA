package Variable;

/*A variable which is declared as static is called static variable. 
 * It cannot be local. You can create a single copy of static variable 
 * and share among all the instances of the class. 
 * Memory allocation for static variable happens only once when the class is loaded in the memory.*/

public class static_variable {
static int m=100;

	public static void main(String[] args) {
		
System.out.println(m);
	}

}
