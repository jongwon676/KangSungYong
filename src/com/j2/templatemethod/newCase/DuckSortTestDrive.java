package com.j2.templatemethod.newCase;


import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		
		Duck[] ducks = { 
						new DuckAge("Daffy", 8,30), 
			
						new DuckAge("Dewey", 2,20),
						new DuckAge("Howard", 7,15),
						new DuckAge("Louie", 2,8),
						new DuckAge("Donald", 10,11), 
						new DuckAge("Huey", 2,13)
		 };
		Duck[] ducks1={
				new DuckWeight("Daffy", 8,30), 
				
				new DuckWeight("Dewey", 2,20),
				new DuckWeight("Howard", 7,15),
				new DuckWeight("Louie", 2,8),
				new DuckWeight("Donald", 10,11), 
				new DuckWeight("Huey", 2,13)
		};
        
		
		System.out.println("1.Before sorting:");
		System.out.println();
		display(ducks);
		System.out.println();
		
		System.out.println("2.Age sorting:");
		System.out.println();
		Arrays.sort(ducks);
		display(ducks);
		System.out.println();
		
		
		System.out.println("3.Weight sorting:");
		System.out.println();
		Arrays.sort(ducks1);
        display(ducks1);
        System.out.println();
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}