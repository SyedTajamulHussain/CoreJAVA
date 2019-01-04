package Random;
public class Methodoverloading
{
       void sum(int x, int y) //method name is sum
       {
              System.out.println(x+y);
       }
       
       void sum(int x, int y, int z) //method name is sum in this also
       {
              System.out.println(x+y+z);
       }
       
       public static void main(String s[])
       {
              Methodoverloading mo = new Methodoverloading();
              mo.sum(10, 20);
              mo.sum(10, 20, 30);
       }

}
