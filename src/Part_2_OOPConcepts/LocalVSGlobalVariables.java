package Part_2_OOPConcepts;

public class LocalVSGlobalVariables {
	
// to use global variable you have to create an obj in method.
	
			String nam = "tajamul";  // String and int are global/class level varibles
			int Age = 25;
	
	public static void main(String[] args) {
		
			int i=10;  // local variable to this main method
			System.out.println(i);
		 
			LocalVSGlobalVariables obj = new LocalVSGlobalVariables();  //obj to use global variable
			System.out.println(obj.nam);
			System.out.println(obj.Age); 
			
			int multilpicaion =obj.testmethod(10, 2);
			System.out.println(multilpicaion);
		 }
	
	public int testmethod(int i, int j) {
		
			int m=i*j; 
			return m;
					
		}
	
	public void test() {
			int i= 10; // local variable to this sub method
			System.out.println(i);
}
}
