/*Java assignment operator is one of the most common operator. It is used to assign the value on its right to the operand on its left.*/

package javaOperators;

public class Java_Assignment_Operator {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=10;
	
	a+=4;
	b-=10;
	System.out.println(a);
	System.out.println(b);
	
	c+=3;
	System.out.println(c);  //10+3
	
	c-=1;
	System.out.println(c);  // 13-1

	c*=2;
	System.out.println(c); //12*2
	
	c/=24;
	System.out.println(c);
	
	}
}
