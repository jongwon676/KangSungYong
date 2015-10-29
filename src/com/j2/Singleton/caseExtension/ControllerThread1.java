package com.j2.singleton.caseExtension;
public class ControllerThread1 extends Thread{
SharedArea sharedArea;
public void run(){
	 if(sharedArea.isReady!=true){
	 synchronized(sharedArea){
		 try{
			 sharedArea.wait();
		 }
		 catch(InterruptedException e){
			 System.out.println(e.getMessage());
		 }
		 
	 }
	 
		 
	 } 
	 ChocolateBoiler boiler = ChocolateBoiler.getInstance();
	 boiler.fill();
	 boiler.boil();
	 boiler.drain();
	synchronized(sharedArea){
	sharedArea.notify();	
	}
}
}
