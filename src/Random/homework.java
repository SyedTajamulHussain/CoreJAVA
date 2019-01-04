package Random;
public class homework {
int a;
int b;

	public  void setData(int a, int b) {
this.a = a;
this.b = b;
		}
	public void showData(){
		System.out.println("value of A ="+a);
		System.out.println("value of B ="+b);
	}
	public static void main(String s[])
	{
	homework obj =new homework();
	obj.setData(2, 3);
	obj.showData();
}	                       

}
