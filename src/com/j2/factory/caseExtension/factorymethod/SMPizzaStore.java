package com.j2.factory.caseExtension.factorymethod;

public class SMPizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    Pizza pizza=null;
    if (item.equals("cheese")) {
       pizza=new SMStyleCheesePizza();
    }
    return pizza;
   }
}