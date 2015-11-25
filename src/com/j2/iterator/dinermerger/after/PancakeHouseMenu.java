package com.j2.iterator.dinermerger.after;
import java.util.*;
public class PancakeHouseMenu {
ArrayList menuItems;
public PancakeHouseMenu(){
	menuItems=new ArrayList();
	addItem("K&B 팬케이크 세트","스캐램볼드 에그와 토스트가 곁들여진 팬케이트",true,2.99);
	addItem("레귤러 팬케이크 세트","달걀 후라이와 소시지가 곁들여진 팬케이크 ",false,2.99);
	addItem("블루베리 팬케이크","신선한 블루베리와 블루베리 시럽으로 만든 팬케이크 ",true,3.49);
	addItem("와플","취향에 따라 블루베리나 딸기를 얹을 수 있습니다.",true,3.59);
    addItem("나의 메뉴1","스페셜요리 채소듬뿍.",true,10.00);
    addItem("나의 메뉴2","스페셜요리 고기듬뿍.",false,11.00);
    addItem("나의 메뉴3","스페셜요리 고기왕창.",false,12.00);
}
public void addItem(String name,String description,boolean vegetarian,double price){
	MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
	menuItems.add(menuItem);
}
public Iterator createIterator(){
	return new pancakeIterator(menuItems);
}
}
