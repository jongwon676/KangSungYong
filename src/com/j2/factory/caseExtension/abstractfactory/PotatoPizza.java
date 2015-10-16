package com.j2.factory.caseExtension.abstractfactory;

public class PotatoPizza  extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public PotatoPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
      
    }
}
