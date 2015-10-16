package com.j2.factory.caseExtension.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Potato createPotato(){
    	return new mashedPotato();
    }
}