package Random;
public class Test {

	int x=10;
	
	
	void show() 
	{

	   System.out.println(x);
	}

	public static void main(String[] args) {

	new Test().show(); //ananomous 
   //System.out.println(new Test().hashCode());
	System.out.println(new Test());
}
}
