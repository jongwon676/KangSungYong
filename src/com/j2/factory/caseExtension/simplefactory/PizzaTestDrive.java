package com.j2.factory.caseExtension.simplefactory;

public class PizzaTestDrive{
  public static void main(String[] args){
    SimplePizzaFactory fac=new SimplePizzaFactory();
    PizzaStore store=new PizzaStore(fac);
    Pizza pizza=store.order("potato");
    System.out.println("We ordered a "+pizza.getName());
    
  }
  
}