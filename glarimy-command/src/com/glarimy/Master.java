package com.glarimy;

public class Master {
	public void registerWith(EventBus bus) {
		Listener listener = new Listener(this);
		bus.register(listener);
	}
}
