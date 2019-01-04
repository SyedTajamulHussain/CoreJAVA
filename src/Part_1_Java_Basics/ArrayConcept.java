package Part_1_Java_Basics;


public class ArrayConcept {

	public static void main(String[] args) {
	/* one dimension array 
	   disadvantage is that size is fixed in one dimention array.
	   as size is fixed, it is called static array
	   2nd disadvantage is smiler data types.
	   to over come this problem,we use dynamic array ( object array, collection).
	    */
		
	//1. int array
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		
		//System.out.println(i[5]); //array index out of bound exception
		
		System.out.println(i.length); // Array length/size
		
		//Print all values of array..you have to use for loop
		
		for(int a=0;a<i.length;a++) 
		{
			System.out.println(a);
		}
		
		//2.double array
		double d[]=new double[3];
		d[0]=11.11;
		d[1]=22.22;
		d[2]=33.33;
		System.out.println(d[2]);
				
		//3.char array
		char c[] =new char[3];
		c[0]='a';
		c[1]='2';
		c[2]='$';
		System.out.println(c[2]);
		
		//4.boolean
		boolean b[] =new boolean[2];
		b[0]= true;
		b[1]=false;
		System.out.println(b[1]);
		
		//5. String array
		String s[] =new String[3];
		s[0]="Abc";
		s[1]="123";
		s[2]="##";
		System.out.println(s[2]);
		System.out.println(s.length);
		
		//6.Object array-- Object is the class
		Object obj[] = new Object[4];
		obj[0] = "Tajamul";
		obj[1] = 22.22;
		obj[2] = '$';
		obj[3] = 10;
		System.out.println(obj[1]);
		System.out.println(obj.length);
		
		//Print all values of array..you have to use for loop
		
	 
		for(int z=0; z<obj.length;z++) {  // why int not Object
			System.out.println(z);
		}
		
	}

}
