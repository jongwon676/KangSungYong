package com.j2.state.newCase;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Player extends Frame implements ActionListener{
private TextArea textScreen=new TextArea(10,60);
private Button buttonPlay=new Button("재생");
private Button buttonStop=new Button("중지");
private Button buttonOn=new Button("Screen On");
private Button buttonOff=new Button("Screen Off");
State state;
OffScreenState offScreenState;
OnScreenState onScreenState;
StopState stopState;
PlayState playState;
public Player(String title){
	super(title);
	setBackground(Color.lightGray);
	setLayout(new BorderLayout());
	add(textScreen,BorderLayout.CENTER);
	textScreen.setEditable(false);
	Panel panel=new Panel();
	panel.add(buttonPlay);
	panel.add(buttonStop);
	panel.add(buttonOn);
	panel.add(buttonOff);
	add(panel,BorderLayout.SOUTH);
	pack();
	show();
	buttonPlay.addActionListener(this);
	buttonStop.addActionListener(this);
	buttonOn.addActionListener(this);
	buttonOff.addActionListener(this);
	
	offScreenState=new OffScreenState(this);
	onScreenState=new OnScreenState(this);
	stopState=new StopState(this);
	playState=new PlayState(this);
	state=stopState;
}
public void turnOnScreen(){
	state.turnOnScreen();
}
public void turnOffScreen(){
	state.turnOffScreen();
	state.stop();
}
public void stop(){
	state.stop();
	
}
public void play(){
	state.play();
}
public void setState(State state){
	this.state=state;
}
public State getOffScreenState(){
	return offScreenState;
}
public State getOnScreenState(){
	return onScreenState;
}
public State getStopState(){
	return stopState;
}
public State getPlayState(){
	return playState;
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==buttonPlay){
		state.play();
	}
	else if(e.getSource()==buttonStop){
		state.stop();
	}
	else if(e.getSource()==buttonOn){
		state.turnOnScreen();
	}
	else if(e.getSource()==buttonOff){
		state.turnOffScreen();
	}
	else{
		System.out.println("error");
	}
	
}
}
