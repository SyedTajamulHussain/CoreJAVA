package reverse_String;

import java.util.Scanner;

/*Java reverse string program: This Java program reverses a string entered by a user. We use charAt method 
to extract characters from the input string
and append them in reverse order to reverse the entered string.
*/

public class Reverse_String_Using_charAt {

	public static void main(String[] args) {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	   }
	}