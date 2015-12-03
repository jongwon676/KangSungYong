package com.j2.state.caseExtension;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = 
			new GumballMachine(4);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertWrongQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		

		
	}
}