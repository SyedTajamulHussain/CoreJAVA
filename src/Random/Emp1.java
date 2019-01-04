package Random;
class Emp1{
int Emp1Id;
String Emp1Name;
double Emp1Salary;

void input(int id,String name)

{
Emp1Id= id;
Emp1Name=name;
}
void input(double salary)
{
Emp1Salary=salary;
}
void disp()
{
System.out.println(Emp1Id);
System.out.println(Emp1Name);
System.out.println(Emp1Salary);
}

public static void main(String s[])
{
Emp1 e1=new Emp1();
e1.input(10,"abc");
e1.input(3444.88);
e1.disp();
Emp1 e2=new Emp1();
e2.input(20,"XYZ");
e2.input(5000.88);
e2.disp();
Emp1 e3=new Emp1();
e3.input(30,"tajamul");
e3.input(60000.88);
e3.disp();
}
}