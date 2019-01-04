package Random;
class Ducat {
int x=1,y=2;  // instence variable


void show()

	
{
	int x=10; // local variable of void show function
	int y=11;
	System.out.println(x);
	System.out.println(y);
	

}

	
	public static void main(String s[])
	
	
	{
	Ducat obj =new Ducat();

	obj.show();
	
}
	
	
//Block
	{
		System.out.println(x);
		System.out.println(y);
	}
}
