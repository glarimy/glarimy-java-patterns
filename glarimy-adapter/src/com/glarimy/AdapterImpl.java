package com.glarimy;

public class AdapterImpl implements Adapter {
	private Component target;

	public AdapterImpl() {
		target = new Component();
	}

	public void service() {
		target.execute();
	}
}
