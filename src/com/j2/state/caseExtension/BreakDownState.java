package com.j2.state.caseExtension;
public class BreakDownState implements State{
GumballMachine gumballMachine;
public BreakDownState(GumballMachine gumballMachine){
	this.gumballMachine=gumballMachine;
}
public void insertQuarter(){
	System.out.println("기계가 고장 났습니다.");
}
public void ejectQuarter(){
	 throw new UnsupportedOperationException();
}
public void turnCrank(){
System.out.println("기계가 고장났습니다. 레버를 돌리실수 없습니다.");
}
public void dispense(){
System.out.println("기계가 고장났습니다");
}
@Override
public void insertwrongQuarter() {
	throw new UnsupportedOperationException();
	
}

}