package com.j2.iterator.dinermerger.after;
public class DinerMenu {
static final int MAX_ITEM=6;
int numberOfItems;
MenuItem[] menuItems;

public DinerMenu(){
	menuItems=new MenuItem[MAX_ITEM];
	addItem("채식주의자용 BLT","통밀위에 베이컨,상추 토마토를 얹은메뉴",true,2.99);
	addItem("BLT","통밀위에 베이컨 상추 토마토를 언은 메뉴",false,2.99);
	addItem("오늘의 스프","감자샐러드를 곁들인 오늘의 스프",false,3.29);
	addItem("핫도그","샤워크라우트,갖은 양념,양파,치즈가 곁들여진 핫도그",false,3.05);
}
public void addItem(String name,String description,boolean vegetarian,double price){
	MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
	if(numberOfItems>=MAX_ITEM){
		System.err.println("죄송합니다. 꽉찻습니다. 더이상 추가 불가 ");
	}
	else{
		menuItems[numberOfItems]=menuItem;
		numberOfItems=numberOfItems+1;
	}
	
}
public Iterator createIterator(){
	return new DinerMenuIterator(menuItems);
}
}
