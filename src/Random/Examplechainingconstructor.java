package Random;
class ChainingContructorParent 
{

	public ChainingContructorParent () //constructor
	
	{
		System.out.println("A 1");	
		}
}

class ChainingContructorChild extends ChainingContructorParent
{
	public ChainingContructorChild()  //constructor
	
	
	{
		this(4);
		System.out.println("B 1");	
		}
	
	public ChainingContructorChild(int K) //one more constructor within same class
	{
		System.out.println("B 2");	
	}

	public void show()
	{ }
}

public class Examplechainingconstructor
{  
	

	public static void main(String[] args)
	{
		ChainingContructorChild obj =new ChainingContructorChild();
		obj.show();
		
		
	}
	}