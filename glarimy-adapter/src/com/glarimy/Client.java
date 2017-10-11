package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		adapter.service();
	}
}
