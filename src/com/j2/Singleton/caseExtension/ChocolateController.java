package com.j2.singleton.caseExtension;
 
public class ChocolateController extends Thread {
 public static void main(String args[]) {
	 ControllerThread thread=new ControllerThread();
	 ControllerThread1 thread1=new ControllerThread1();
	 ControllerThread2 thread2=new ControllerThread2();
	 
 SharedArea sArea=new SharedArea();
 sArea.isReady=false;
 thread.sharedArea=sArea;
 thread1.sharedArea=sArea;
 thread2.sharedArea=sArea;
 
 thread.start();
 thread1.start();
 thread2.start();
 }
}