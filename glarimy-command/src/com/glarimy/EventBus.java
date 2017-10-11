package com.glarimy;

import java.util.ArrayList;
import java.util.List;

public class EventBus {
	private List<Listener> listeners = new ArrayList<>();

	public void register(Listener listener) {
		listeners.add(listener);
	}

	public void notify(String message) {
		for (Listener listener : listeners)
			listener.onMessage(message);
	}

	public void unregister(Listener listener) {
		listeners.remove(listener);
	}
}
