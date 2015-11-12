package com.j2.facade.newCase;
public class SmartHomeFacade {
	
	private Tv tv;
	private Computer computer;
	private Light light;
	
	public SmartHomeFacade(Tv tv,Computer computer,Light light){
		this.tv=tv;
		this.computer=computer;
		this.light=light;
	}
public void beginStudy(){
	System.out.println("Study mode id ready");
    light.on();
    light.dim(100);
	tv.off();
	computer.on();
	System.out.println();
}
public void endStudy(){
	System.out.println("Study mode is end");
	light.dim(50);
	tv.on();
	computer.off();
	System.out.println();
	
}
}
