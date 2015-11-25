package com.j2.iterator.dinermerger.after;
public class MenuTestDrive {
public static void main(String ar[]){
	PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
	DinerMenu dinerMenu=new DinerMenu();
    
	Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
    System.out.println("********** 전체메뉴 **********");
    waitress.printMenus();
    System.out.println("********** 체식주의자 메뉴 **********");
	waitress.printVegetarianMenu();
    

}
}
