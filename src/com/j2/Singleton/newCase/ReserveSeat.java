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
		
			System.out.println(num+"��° �ڸ��� ����Ǿ����ϴ�.");
			canReserve[num]=false;
		}
	else{
		System.out.println(num+"��° �ڸ��� �̹� ����� �ڸ��Դϴ�.");
	}
	
	
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(num+"��° �¼��� ���� ���� �ʽ��ϴ�.");
	}
}
public void displaySeat(){
	System.out.println();
	System.out.println("�����¼�");
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