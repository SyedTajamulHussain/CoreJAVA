package Part_2_OOPConcepts;

public class Car {

	int model; // class variables or global variables.
	int wheel;

	public static void main(String[] args) {

		// new car is the object
		// a, b and c are the reference to the object.
		// new is the keyword used to create object.

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();

		a.model = 2015;
		a.wheel = 4;

		b.model = 2014;
		b.wheel = 2;
		
		c.model =2007;
		c.wheel=1;
		System.out.println("Before assigning the refrences");
		System.out.println(b.wheel);
		System.out.println(a.wheel);
		System.out.println(c.model);
		
		System.out.println("After shifting the refrences");
		a=b;
		b=c;
		c=a;
		
		a.model =10;
		System.out.println(a.model);
		c.model =20;
		System.out.println(a.model);
		System.out.println(c.model);
		
	}

}
