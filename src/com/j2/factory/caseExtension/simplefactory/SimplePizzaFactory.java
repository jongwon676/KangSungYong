package com.j2.factory.caseExtension.simplefactory;
public class SimplePizzaFactory{
  
  public Pizza createPizza(String name){
Pizza pizza=null;
    if(name.equals("potato")){
      pizza=new PotatoPizza();
    }
      
    
      return pizza;
  
 }



}