package com.j2.state.newCase;

public class OnScreenState implements State{
	Player player;
	public OnScreenState(Player player){
		this.player=player;
	}
public void turnOnScreen(){
	System.out.println("이미 화면이 켜져 있습니다.");
	}
	public void turnOffScreen(){
		System.out.println("화면이 꺼졌습니다.");
	}
	public void stop(){
		System.out.println("Player가 종료됩니다. ");
		player.setState(player.getStopState());
	}
	public void play(){
		System.out.println("이미 player가 재생중입니다.");
	
	}
}
