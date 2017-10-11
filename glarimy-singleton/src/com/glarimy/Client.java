package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Singleton first = Singleton.getInstance();
		Singleton second = Singleton.getInstance();
		first.service();
		second.service();
	}
}
