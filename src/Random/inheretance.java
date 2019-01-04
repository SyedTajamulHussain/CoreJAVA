package Random;
class ChainingContructorParentt 

{
	int eid;
	String ename;
	
void input(int eid,String ename)	
{this.eid=eid;
this.ename=ename;
}

void show()
{ System.out.println(eid);
System.out.println(ename);
}
}


class inheretance extends ChainingContructorParentt
{
	
	int payid;
	String payname;
	void setpay(int payid,String payname)
	
	{
		this.payid=payid;
		this.payname=payname;
		
	}
	
	void getpay()
	{
	System.out.println(payid);
	System.out.println(payname);
	}

   public static void main(String[] args)
   {
	inheretance P1= new inheretance();
	P1.input(1,"abc");
	P1.setpay(2,"saving");
	P1.getpay();
	P1.show();
 }
}