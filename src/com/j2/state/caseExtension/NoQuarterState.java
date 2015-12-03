package com.j2.state.caseExtension;
public class NoQuarterState implements State{
GumballMachine gumballMachine;
public NoQuarterState(GumballMachine gumballMachine){
	this.gumballMachine=gumballMachine;
}
public void insertQuarter(){
	System.out.println("동전을 넣었습니다.");
	gumballMachine.setState(gumballMachine.getHasQuarterState());
}
public void ejectQuarter(){
	System.out.println("동전도 안 넣어놓고 달라하나요. 동전넣어주세요");
}
public void turnCrank(){
System.out.println("동전을 넣어주세요");	
}
public void dispense(){
 throw new UnsupportedOperationException();
}
@Override
public void insertwrongQuarter() {
	System.out.println("문제가 있는 동전을 넣으셔서 기계가 고장났습니다.");
	this.gumballMachine.setState(gumballMachine.getBreakDownState());
}

}