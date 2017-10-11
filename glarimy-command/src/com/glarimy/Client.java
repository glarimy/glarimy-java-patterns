package com.glarimy;

public class Client {
	public static void main(String[] args) {
		EventBus bus = new EventBus();
		new Master().registerWith(bus);
		new Master().registerWith(bus);
		new Master().registerWith(bus);
		bus.notify("New Alert");
	}
}
