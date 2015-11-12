package com.j2.facade.newCase;

public class Light {
int level;
	public Light() {
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}
	public void dim(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Light is dimmed to " + level + "%");
		}
	}
}