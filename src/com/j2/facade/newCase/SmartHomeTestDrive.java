package com.j2.facade.newCase;

public class SmartHomeTestDrive {
public static void main(String ar[]){
	Tv tv=new Tv();
Light light=new Light();
Computer computer=new Computer();
SmartHomeFacade smartHome=new SmartHomeFacade(tv,computer,light);

smartHome.beginStudy();
smartHome.endStudy();
}
}
