package Part_4_Interface_Concept;

public class HSBCBank_Class implements USBankInterface ,JKBANKInterface {
	
	//if a class is implementing any interface then it is mandatory to define/override all the methods of interface.
	

public void credit() {
	System.out.println("Credit");
}

public void debt(){
	System.out.println("Debt");
}

public void transferMonry(){
	System.out.println("transfermoney");
}

public void EducationLoan() {
	System.out.println("Education loan");
}

public void CarLoan() {
	System.out.println("Car Loan");
	
	}

public void stateLoan(){
System.out.println("StateLoan");	
}
public void srinagarLoan(){
	System.out.println("Srinagar loan");
}
}
