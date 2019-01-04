package Random;
public class Emp {

	int empid;
	String empName;
	double empSalary;
	double empBonus;
	double empTotalpay;
	
	void calculateTotalpay() {

	   empTotalpay = empSalary + empBonus;
	}
}
