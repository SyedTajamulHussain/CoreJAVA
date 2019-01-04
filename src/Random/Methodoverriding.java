package Random;

 class basee
{
	 void show()
	{
		System.out.println("base class");
}
	
	
}
	
	class Methodoverriding extends basee
	
{
		 void show()
	{
			
		System.out.println("Methodoverriding class");
		super.show();  //method overriding is achieved
	//	base.show();
		}

	
	
	public static void main(String[] args) 
	
	{
		Methodoverriding c1 = new Methodoverriding();
		c1.show();
	//Methodoverriding.show();
		
	}

}
