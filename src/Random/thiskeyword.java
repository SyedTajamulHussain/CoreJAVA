package Random;
public class thiskeyword {
	
private int x;  //instance variable
	
	public thiskeyword (int x) // local variable
	
{	
	{this.x=x;}	
}

public void show() 
{
	
int x=21; // one more local variable
System.out.println(this.x);
System.out.println(x);
	
}

public static void main(String[]args) //static member function
	
{
	
thiskeyword obj=new thiskeyword(10);
obj.show();	

}
	
}


//instance variable and local variable

//this keyword is used to give refrence to instance variable not the local variable.

//If this is not defined , compiler will give preference to local variable.