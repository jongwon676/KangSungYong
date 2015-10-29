package com.j2.singleton.newCase;
public class ReserveSeat {
private static boolean canReserve[];
private static ReserveSeat reserveSeat;
private ReserveSeat(){}
public static  synchronized ReserveSeat  getInstance(){
	   if(reserveSeat==null){
	     
	     reserveSeat=new ReserveSeat();
	     canReserve=new boolean[100];	  
	     for(int i=0;i<100;i++){
	    	 canReserve[i]=true;
	     }
	   }
	  
	   return reserveSeat;
	 }
public synchronized void reserve(int num){
	try{
	if(canReserve[num]==true){
		
			System.out.println(num+"번째 자리가 예약되었습니다.");
			canReserve[num]=false;
		}
	else{
		System.out.println(num+"번째 자리는 이미 예약된 자리입니다.");
	}
	
	
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(num+"번째 좌석은 존재 하지 않습니다.");
	}
}
public void displaySeat(){
	System.out.println();
	System.out.println("남은좌석");
	int count=0;
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
		if(canReserve[count]==true){
			System.out.print(count+"\t");
			
		}
		else
		{
			System.out.print("X"+"\t");
		}
		count++;
		
		}
		System.out.println();
	}
}

}