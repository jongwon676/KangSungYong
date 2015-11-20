package com.j2.templatemethod.newCase;


public class DuckAge extends Duck implements Comparable {
	
	public DuckAge(String name, int weight,int age) {
		
		this.name = name;
		this.weight = weight;
	    this.age=age;
	}
 
	public String toString() {
		return name + " ¸ö¹«°Ô " + weight+" ³ªÀÌ "+age;
	}
 

  
	public int compareTo(Object object) {
    
       
    	   Duck otherDuck = (Duck)object;
    	   
     		if (this.age < otherDuck.age) {
     			return -1;
     		} else if (this.age == otherDuck.age) {
     			return 0;
     		} else { // this.weight > otherDuck.weight
     			return 1;
     		}
    	   
       }
   	
		
}