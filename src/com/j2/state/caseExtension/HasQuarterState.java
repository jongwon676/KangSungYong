package com.j2.state.caseExtension;

import java.util.Random;

public class HasQuarterState implements State{
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
public HasQuarterState(GumballMachine gumballMachine){
this.gumballMachine=gumballMachine;
}
public void insertQuarter(){
	System.out.println("동전은 하나만 넣어주세요");
	
}
public void ejectQuarter(){
	System.out.println("동전이 반환되었습니다");
	gumballMachine.setState(gumballMachine.getNoQuarterState());
}
public void turnCrank(){
	System.out.println("레버를 돌립니다.");
	int winner = randomWinner.nextInt(10);
	if ((winner == 0) && (gumballMachine.count > 1)) {
		
		gumballMachine.setState(gumballMachine.getWinnerState());
	} else {
		gumballMachine.setState(gumballMachine.getSoldState());
	}
}
public void dispense(){
	throw new UnsupportedOperationException();
}
@Override
public void insertwrongQuarter() {
	System.out.println("동전은 하나만 넣어주세요 ");
	
}
}