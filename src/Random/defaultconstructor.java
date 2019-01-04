package Random;


class defaultconstructor
{
static int x;
static String name;
static float f;
static double d;

defaultconstructor ()  //default constructor

{
x=10;
name ="default constructor";    //default constructor
f=4.5f;
d=6.8;
}

public static void main(String args[])

{
defaultconstructor obj = new defaultconstructor();
obj.show();
}

void show()
{
System.out.println("int x :" +x);
System.out.println("Name:" +name);
System.out.println("Float :" +f);
System.out.println("double:" +d);
}
}