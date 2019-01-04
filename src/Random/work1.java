package Random;
 class newstaticblock1 {  //static block should be declared before static member.
static int x=10;
static
{
	System.out.println("static block"+ x);
}
	
 }

class staticblock1 {
	public static void main(String[] args) {
		
		System.out.println(newstaticblock.x);	}

}

class staticblockDemo1 {
	public static void main(String[] args) {
		
		System.out.println(newstaticblock.x);	} //

}


 class work1  //int block programe. first. int should run followed by  default constructor and then normal funciton.
{
int x=10;

{
	
	System.out.println("int block"+ x);
}
	
work1()
{
	System.out.println("default constructio execute");
	}

void show()
{
	System.out.println("normal function call");
}

	public static void main(String[] args) { // main is the process,
		
		{
			
			System.out.println(newstaticblock1.x);
	work1 obj=new work1();
	obj.show();
	
		}
	}

}

