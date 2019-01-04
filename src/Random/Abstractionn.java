package Random;

abstract class plan { 
	
	int unit;
	abstract void getrate(int unit);
	}

class comercial extends plan {
	
int unit,rate;
void getrate(int unit)
{
	rate=2;
	System.out.println(unit*rate);
	
}

}

class domestic extends plan
{
	int unit,rate;
	void getrate(int unit)
	
	{
		rate=4;
		System.out.println(unit*rate);
	
	}
	
	}
 class Abstractionn
{
	public static void main(String...s)
	
	{
		
	comercial c1 =new comercial();
	c1.getrate(3);
	domestic d1 =new domestic();
	d1.getrate(4);
	
	}
		
}