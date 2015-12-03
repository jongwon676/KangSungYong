package com.j2.state.newCase;

public class PlayState implements State{
	 Player player;
	 public PlayState(Player player){
		 this.player=player;
	 }
public void turnOnScreen(){
		System.out.println("화면을 켰습니다.");
        player.setState(player.getOnScreenState());
}
	public void turnOffScreen(){
		System.out.println("재생중에는 화면을 끄실 수 었습니다.");
	}
	public void stop(){
		 System.out.println("재생중에는 종료 될 수 없습니다. 비디오가 끝 까지 재생된 후 종료해주세요.");
	}
	public void play(){
		System.out.println("이미 진행중입니다. ");
		
	}  
}
