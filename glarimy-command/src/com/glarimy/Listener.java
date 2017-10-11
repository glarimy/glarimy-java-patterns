package com.glarimy;

public class Listener {
	Master master;

	public Listener(Master master) {
		this.master = master;
	}

	public void onMessage(String message) {
		System.out.println("Command::onMessage - received " + message);
	}
}
