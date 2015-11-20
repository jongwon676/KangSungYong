package com.j2.templatemethod.newCase;

public class DuckWeight extends Duck implements Comparable {
public DuckWeight(String name, int weight,int age) {
		
		this.name = name;
		this.weight = weight;
	    this.age=age;
	}
 
	public String toString() {
		return name + " ¸ö¹«°Ô " + weight+" ³ªÀÌ "+age;
	}
 

  
	public int compareTo(Object object) {
    
       
    	   Duck otherDuck = (Duck)object;
    	   
     		if (this.weight < otherDuck.weight) {
     			return -1;
     		} else if (this.weight == otherDuck.weight) {
     			return 0;
     		} else { // this.weight > otherDuck.weight
     			return 1;
     		}
    	   
       }
}
