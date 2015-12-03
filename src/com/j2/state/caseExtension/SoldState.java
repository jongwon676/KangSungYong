package com.j2.state.caseExtension;
public class SoldState implements State{
GumballMachine gumballMachine;
public SoldState(GumballMachine gumballMachine){
this.gumballMachine=gumballMachine;
}
public void insertQuarter(){
	System.out.println("판매중입니다. 잠시후에  시도해주세요");
	
}
public void ejectQuarter(){
	System.out.println("알맹이가 나가고 있습니다. 환불 받으 실수 없습니다.");
}
public void turnCrank(){
	System.out.println("레버는 한번만 돌려주세요");
}
public void dispense(){
	System.out.println("알맹이 반환");
	gumballMachine.releaseBall(); 
	if(gumballMachine.count>0){
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	else{
		System.out.println("헐 알맹이 다떨어짐");
		gumballMachine.setState(gumballMachine.getSoldOutState());
	}
}
@Override
public void insertwrongQuarter() {
	System.out.println("판매중입니다. 잠시후에 시도해주세요 ");
}
}
