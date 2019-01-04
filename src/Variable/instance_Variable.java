package Variable;

/*A variable declared inside the class but outside the body of the method, 
 * is called instance variable. It is not declared as static.
 It is called instance variable because its value is instance specific and 
 is not shared among instances.*/

 class instance_Variable {
	public int p=10; //this is instance variable.

	 public void main(String[] args) {
	System.out.println(p);

	}

}
