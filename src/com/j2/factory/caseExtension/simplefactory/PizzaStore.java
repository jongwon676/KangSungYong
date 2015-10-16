package com.j2.factory.caseExtension.simplefactory;
public class PizzaStore{
 SimplePizzaFactory factory;
 Pizza pizza;
 PizzaStore(SimplePizzaFactory factory){
  this.factory=factory;
  
 }
 Pizza order(String type){
  
   pizza=factory.createPizza(type) ;
   pizza.prepare();
   pizza.bake();
   pizza.cut();
   pizza.box();
   return pizza;
   
 }
  
}