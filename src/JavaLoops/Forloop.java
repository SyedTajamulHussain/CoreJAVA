package JavaLoops;
public class Forloop {
public static void main(String[] args) 
{
	int rem;	
	for (int i=1; i<=20; i++) // intilization , conditon and increments in same line
		{
		rem = i%2;
		if(rem==1) 
			{
			System.out.println(i);
			}
		else
			{
			System.out.println();
		}
	}
}
}
//entry controlled loop
//For loop is used to execute same set of code multiple times.
//condition is check at the entry time
//The 'for' loop used only when we already knew the number of iterations.