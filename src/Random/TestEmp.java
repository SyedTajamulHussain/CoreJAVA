package Random;
public class TestEmp {

	public static void main(String[] args) {
	Emp tajamul = new Emp();
	tajamul.empid = 53632;
	tajamul.empName ="Syed tajamul";
	tajamul.empSalary =1200.23;
	tajamul.empBonus = 15000;	
	
	tajamul.calculateTotalpay();
	System.out.println("tajamuls total pay = " + tajamul.empTotalpay);
	
	Emp Himanshu = new Emp();
	Himanshu.empid = 53632;
	Himanshu.empName ="Himanshu rawat";
	Himanshu.empSalary =100.23;
	Himanshu.empBonus = 15000;
	
	Himanshu.calculateTotalpay();
	System.out.println("Himanshus total pay = " + Himanshu.empTotalpay);
	
	

	}

}
