package com.j2.state.newCase;

public interface State {
public void turnOnScreen();
public void turnOffScreen();
public void stop(); //화면 sleep  상태 
public void play(); //화면 wakeup 상태 

}
