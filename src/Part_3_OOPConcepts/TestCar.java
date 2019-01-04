package Part_3_OOPConcepts;

public class TestCar {

	//Static polyimorphism....compile time polymorphism
	public static void main(String[] args) {
		BMW B = new BMW();
		B.Start();
		B.Stop();
		B.refuel();
		B.theftSafety();
		B.engine();
		B.GGNAuto();
		
		
		System.out.println("************");
		Car C1 = new BMW();// child class object can be refereed by parent class reference variable --dynamic polymorphism
							//or run time polymorphishm
		C1.Start();
		C1.Stop();
		C1.refuel();
	
		

	}

}
