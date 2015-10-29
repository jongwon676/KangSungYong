package com.j2.singleton.newCase;
public class ReserveController {
public static void main(String ar[]){
	ReserveSeat r1=ReserveSeat.getInstance();
	ReserveSeat r2=ReserveSeat.getInstance();
	r1.reserve(100);
	r2.reserve(50);
	r1.reserve(50);
	r2.reserve(10);
	r1.reserve(64);
	r1.reserve(70);
	r1.reserve(88);
	r1.displaySeat();
}
}
