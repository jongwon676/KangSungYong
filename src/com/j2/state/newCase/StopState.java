package com.j2.state.newCase;

public class StopState implements State{
	Player player;
	public StopState(Player player){
		this.player=player;
	}
	public void turnOnScreen(){
		System.out.println("화면을 키시기전에 전원부터 켜주세요 ");
	}
	public void turnOffScreen(){
		System.out.println("화면이 이미 꺼저 있습니다. ");
	
	}
	public void stop(){
		System.out.println("Player가 이미 종료되었습니다.");
	}
	public void play(){
		System.out.println("Player가 시작되었습니다. 비디오 재생시간은 5초입니다. ");
        System.out.println("화면이 켜졌습니다.");
		player.setState(player.getPlayState());
	for(int i=0;i<5;i++){
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("재생시간:"+(i+1)+"초 경과");
	}
	System.out.println("비디오 끝났습니다. 곧 화면도 꺼집니다.");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	player.setState(player.getOffScreenState());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("화면이 꺼졌습니다.");
	player.setState(player.getStopState());
}
}
