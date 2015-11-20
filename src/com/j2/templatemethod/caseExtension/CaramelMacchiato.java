package com.j2.templatemethod.caseExtension;

public class CaramelMacchiato extends CaffeineBeverage{

	void brew() {
		
		System.out.println("Dripping coffee through filter");
	}

	void addCondiments() {
		System.out.println("adding vanilla syrup, espresso, milk, caramel");
		
	}

}
