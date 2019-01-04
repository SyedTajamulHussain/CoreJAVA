package Random;
class parent //multiple level overiding

{

	int x=10;
}


class child1 extends parent
{
	
int x=20;

}

class subchild extends child1

{
int x=30;

void show()
{
	
System.out.println(x);
System.out.println(super.x);
System.out.println(((parent)this).x);
}
public static void main(String[] args) 
	{
		subchild c1 = new subchild();
		c1.show();	
	}
}