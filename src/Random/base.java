package Random;


class base

{
	private int x=10;
	void show()
	{
			System.out.println(x);
	}
	}
	
class childd extends base
	{
		int y=20;
		void print()
	{

			System.out.println(y);
	}
		public static void main(String s[])
	{
			childd c=new childd();	
			c.print();
			c.show();
	}
	}
