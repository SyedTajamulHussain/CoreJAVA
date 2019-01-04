/*Java ternary operator is the only conditional operator that takes three operands.
 * Java ternary operator is a one liner replacement for if-then-else statement and 
 * used a lot in java programming. We can use ternary operator to replace switch also.
 * ternary operator allows you to shorten an if-then-else statement to a single line
 *  condition ? exprTrue : exprFalse*/



package javaOperators;

class Java_Ternary_Operator {

	public static void main(String[] args) {
		int a=2;  
		int b=5; 
		int min=(a>b)?a:b;  // condition ? exprTrue : exprFalse
		System.out.println(min);  
		}
	}

		
