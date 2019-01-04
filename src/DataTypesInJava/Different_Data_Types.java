package DataTypesInJava;

public class Different_Data_Types {

	public static void main(String[] args) {
		char a= 'G'; //Declaring character.
		int i=89; // Declaring integer, used for numeric values.
		byte b=4; //use byte and short if memory is a constraint
		short s = 56; 
		double d = 4.355453532; // by default fraction value is double in java
        float f = 4.7333434f; // for float use 'f' as suffix
		
        //byte b1 = 7888888955; // this will give error as number is larger than byte range 
		//short s1 = 87878787878;  //this will give error as number is as this is larger than short range,
        
        
        System.out.println("char: " + a); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d);
	}

}
