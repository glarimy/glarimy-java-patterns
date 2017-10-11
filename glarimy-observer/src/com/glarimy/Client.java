package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Observer observer = new Observer();
		new Member(observer);
		new Member(observer);
		new Member(observer);
		observer.observe();
	}
}
