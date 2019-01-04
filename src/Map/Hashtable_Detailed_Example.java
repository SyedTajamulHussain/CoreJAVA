package Map;

import java.util.*;    



class Bookk {    
int id,quantity;  
String name,author,publisher;    
//int quantity;  

public Bookk(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    

public class Hashtable_Detailed_Example {    
	
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Bookk> map=new Hashtable<Integer,Bookk>();    
    //Creating Books    
    Bookk b1=new Bookk(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Bookk b2=new Bookk(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Bookk b3=new Bookk(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);      
    //Traversing map  
    for(Map.Entry<Integer, Bookk> entry:map.entrySet()){    
        int key=entry.getKey();  
        Bookk b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}    