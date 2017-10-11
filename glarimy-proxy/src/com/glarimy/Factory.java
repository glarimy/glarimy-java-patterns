package com.glarimy;

public class Factory {
	public static Component get() {
		Component comp = new Component();
		Proxy proxy = new Proxy(comp);
		return proxy;
	}
}
