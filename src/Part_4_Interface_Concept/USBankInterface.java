package Part_4_Interface_Concept;

public interface USBankInterface {
	
	int min_bal =100;
	
	public void credit();
	public void debt();
	public void transferMonry();
	
	//only method declaration 
	//no method body like {}
	//in interface we can declare variable and by default they are static.
	//variable value can not be changed
	// non static method in interface 
	//non main method
	// we cannot create object of interface, i.e interface abstract in nature.
	

}
