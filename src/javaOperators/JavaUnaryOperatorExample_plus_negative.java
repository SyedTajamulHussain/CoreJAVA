/*The increment/decrement operators can be applied before (prefix) or after 
 * (postfix) the operand. The code result++; and ++result; will both end in
 *  result being incremented by one. The only difference is that the prefix version
 *   (++result) evaluates to the incremented value, whereas the postfix version (result++)
 *    evaluates to the original value. */

package javaOperators;


	class JavaUnaryOperatorExample_plus_negative {

	public static void main(String[] args) {
	int x=10;
	System.out.println(x++);
	System.out.println(x++);
	//System.out.println(++x);
	//System.out.println(x--);
	//System.out.println(x--);
	
	     int result = +1; // result is now 1
         System.out.println(result);
         result--;  // result is now 0
         System.out.println(result);
         result++; // result is now 1 
         System.out.println(result);
         result = -result; // result is now -1
         System.out.println(result);
         boolean success = false;
         System.out.println(success); // false
         System.out.println(!success); // true
    }
}