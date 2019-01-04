package Part_4_Interface_Concept;

public class TestBank {

	public static void main(String[] args) {
	
		HSBCBank_Class HS = new HSBCBank_Class();
		HS.debt();
		HS.credit();
		HS.transferMonry();
		HS.EducationLoan();
		HS.CarLoan();
		HS.stateLoan();
		HS.srinagarLoan();
		
		//Dynamic polymorphism
		//Child class object can be referred by parent interface refrence variable
		USBankInterface b = new HSBCBank_Class();
		b.credit();
		b.debt();
		b.transferMonry();
		
	}

}
