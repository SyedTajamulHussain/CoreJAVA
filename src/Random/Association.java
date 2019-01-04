package Random;

class Address
{
	String city, state, country;
	
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;

	}

	
}

public class Association
{
	int id;
	String name;
	Address address;
	
	Association(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
				
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
	
	public static void main(String s[])
	{
		Address add = new Address("Noida","UP","India");
		Association a1 = new Association(1, "Syed", add);
		a1.display();
	}
	
}
