package com.j2.factory.caseExtension.factorymethod;
public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore smstore=new SMPizzaStore();
    Pizza pizza=nystore.orderPizza("cheese");
    System.out.println("We ordered a "+pizza.getName());
  }
}