package com.j2.iterator.dinermerger.after;
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;

	}

	public void printMenus() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("Menu breakfast");
		printMenu(pancakeIterator);
		System.out.println("Menu dinner");
		printMenu(dinerIterator);

	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.Next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + "--");
			System.out.println(menuItem.getDescription());
		}
	}

	public void printVegetarianMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator iterator = new VegetarianIterator(pancakeIterator, dinerIterator);
		
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.Next();
			if (menuItem.vegetarian == true) {
				System.out.println(menuItem.getName() + ", ");
				System.out.println(menuItem.getPrice() + "--");
				System.out.println(menuItem.getDescription());
			}
		}

	}

	public boolean isItemVegetarian(String name) {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator iterator = new VegetarianIterator(pancakeIterator, dinerIterator);
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.Next();
			if (menuItem.name.equals(name)) {
				return menuItem.vegetarian;

			}
		}
		return false; 
		
	}
}
