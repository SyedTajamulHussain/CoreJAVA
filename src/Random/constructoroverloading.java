package Random;

class constructoroverloading
{
int i;
String name;
float f;
double d;

constructoroverloading (int x,String n,float y, double z)  // constructoroverloading is when we have both parametirized and default constructor in single program.

{
i =x;
name =n;    //parametirized constructor
f =y;
d=z;
}

constructoroverloading()
{
	i=7;
	name = "tajamul";
	f =2.2f;
	d =7.0;
}

public static void main(String args[])

{
	
constructoroverloading obj = new constructoroverloading(15,"constructoroverloading" ,7.8f,9);
constructoroverloading obj1 = new constructoroverloading();

System.out.println("int i: "+obj.i);
System.out.println("Name: "+obj.name);
System.out.println("Float: "+obj.f);
System.out.println("double: "+obj.d);
System.out.println("int i: "+obj1.i);
System.out.println("Name: "+obj1.name);
System.out.println("Float: "+obj1.f);
System.out.println("double: "+obj1.d);
}
}
