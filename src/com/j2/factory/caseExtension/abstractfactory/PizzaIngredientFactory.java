package com.j2.factory.caseExtension.abstractfactory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Potato createPotato();
}