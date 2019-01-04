package Random;


class Dataoverriding
{
	int x=10;			
}

class Dataoverridingchile extends Dataoverriding

{
	int x=20;
	void show()
	{
		System.out.println(x);
		System.out.println(super.x); //data overriding is achieved by keyword super...super is a non static keyword 
		}
	public static void main(String[] args) 
	{
		Dataoverridingchile c1 = new Dataoverridingchile();
		c1.show();	
	}
}

