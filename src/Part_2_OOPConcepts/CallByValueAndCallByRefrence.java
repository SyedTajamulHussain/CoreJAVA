package Part_2_OOPConcepts;

public class CallByValueAndCallByRefrence {

		int p;
		int q;
	
	
	public static void main(String[] args) {
		
		CallByValueAndCallByRefrence obj = new CallByValueAndCallByRefrence();
		
		
		int x =10;
		int y=20;
		obj.testsum(x,y);  // call by value or pass by value
	
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	
	}
	
	public int testsum(int a, int b) {
		int c = a+b;
		return c;
		
	}
	//Call by refrence... in c this can achieved by pointers and in java this is achieved by object references
	public void swap(CallByValueAndCallByRefrence t) {
		int temp;
		temp =t.p;  //temp is 50
		t.p=t.q;    //t.p is 60
		t.q=temp;   //t.q is 50

		
	}

}
