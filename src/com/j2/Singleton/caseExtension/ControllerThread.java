package com.j2.singleton.caseExtension;
public class ControllerThread extends Thread{
SharedArea sharedArea;
public void run(){
	 
		 ChocolateBoiler boiler = ChocolateBoiler.getInstance();
	  boiler.fill();
	  boiler.boil();
	  boiler.drain();
		synchronized(sharedArea){
			sharedArea.notify();
}
}
}
