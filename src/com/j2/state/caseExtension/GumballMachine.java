package com.j2.state.caseExtension;
public class GumballMachine{
State soldOutState;
State noQuarterState;
State hasQuarterState;
State soldState;
State breakDownState;
State winnerState;
State state=soldOutState;

int count=0;
public GumballMachine(int count){
	this.count=count;
	winnerState=new WinnerState(this);
	breakDownState=new BreakDownState(this);
	soldOutState=new SoldOutState(this);
	noQuarterState=new NoQuarterState(this);
	hasQuarterState=new HasQuarterState(this);
	soldState=new SoldState(this);
	if(count>0){
		state=noQuarterState;
	}
}
public void setState(State state){
	this.state=state;
}
public State getState(){
	return this.state;
}
public void insertQuarter(){
state.insertQuarter();	
}
public void dispense(){
	state.dispense();
}
public void turnCrank(){
	state.turnCrank();
	state.dispense();
}
public void ejectQuarter(){
	state.ejectQuarter();
}
public void insertWrongQuarter(){
	state.insertwrongQuarter();
}
public State getNoQuarterState(){
	return noQuarterState;
}
public State getSoldState(){
	return soldState;
	
}
public State getSoldOutState(){
return soldOutState;
}
public State getHasQuarterState(){
	return hasQuarterState;
}
public State getWinnerState(){
	return winnerState;
}
public void releaseBall(){
	System.out.println("공 나갑니다.");
	if(this.count>0){
		this.count-=1;
	}
	
}
public State getBreakDownState(){
	return breakDownState;
}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n 강성용 gumball, Inc.");
		
		result.append("\n볼의갯수: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		
		return result.toString();
	}
	
}

	
	
