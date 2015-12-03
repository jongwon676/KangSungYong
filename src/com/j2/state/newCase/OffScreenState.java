package com.j2.state.newCase;

public class OffScreenState implements State{
	Player player;
	public OffScreenState(Player player){
		this.player=player;
	}
	
	public void turnOnScreen(){
		System.out.println("화면이 켜졌습니다.");
		player.setState(player.getOnScreenState());
	}
	public void turnOffScreen(){
		System.out.println("이미 화면이 꺼저있습니다.");
	}
	public void stop(){
		 System.out.println("player가 종료되었습니다.");
		 player.setState(player.getStopState());
	}
	public void play(){
		System.out.println("Player를 실행합니다.");
		player.setState(player.getPlayState());
	}
}
