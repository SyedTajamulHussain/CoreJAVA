package Random;

abstract class baseOne 
{
baseOne()
{
System.out.println ("base class defcons");
}
abstract void show();
}

class child extends baseOne

{
child()
{
System.out.println("child class defcon");
}

void show()
{
System.out.println("show in child");
}

public static void main(String s[])
{
//child c =new child();
//c.show();
baseOne b1 = new child(); // data binding
b1.show();
}
} //constructor can be user in abstract class