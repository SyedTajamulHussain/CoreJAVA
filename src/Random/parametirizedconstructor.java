package Random;
class parametirizedconstructor
{
static int i;
static String name;
static float f;
static double d;

parametirizedconstructor (int x,String n,float y, double z)  // parametirized constructor

{
i =x;
name =n;    //parametirized constructor
f =y;
d=z;
}



public static void main(String args[])

{
	parametirizedconstructor obj = new parametirizedconstructor(15,"Parametirizedconstructor" ,7.8f,9);
	obj.show();

}
void show()
{
	System.out.println("int i :" +i);
	System.out.println("Name:" +name);
	System.out.println("Float :" +f);
	System.out.println("double:" +d);
}
}
