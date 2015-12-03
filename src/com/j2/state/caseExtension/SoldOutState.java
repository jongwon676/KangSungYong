package com.j2.state.caseExtension;
public class SoldOutState implements State{
GumballMachine gumballMachine;
public SoldOutState(GumballMachine gumballMachine){
	this.gumballMachine=gumballMachine;
}
public void insertQuarter(){
	System.out.println("매진됫습니다.");
}
public void ejectQuarter(){
	System.out.println("매진되엇습니다.");
}
public void turnCrank(){
System.out.println("매진되었습니다.");	
}
public void dispense(){
System.out.println("매진되었습니다.");
}
@Override
public void insertwrongQuarter() {
	System.out.println("매진되었습니다.");
	
}

}