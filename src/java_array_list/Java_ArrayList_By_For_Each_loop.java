package java_array_list;

import java.util.ArrayList;

class Java_ArrayList_By_For_Each_loop {
	 
	public static void main(String args[]){  
	
		ArrayList<String> al=new ArrayList<String>(); 
		
		
			  al.add("Ravi");  
			  al.add("Vijay");  
			  al.add("Ravi");  
			  al.add("Ajay");  
			 
		  for(String obj:al)  
		    System.out.println(obj);  
		 }  
		}  