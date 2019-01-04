package Random;
 class newstaticblock {  //static block should be declared before static member.
static int x=10;
static
{
	System.out.println("static block"+ x);
}
	
 }

class staticblock {
	public static void main(String[] args) {
		
		System.out.println(newstaticblock.x);	}

}

class staticblockDemo {
	public static void main(String[] args) {
		
		System.out.println(newstaticblock.x);	}

}


