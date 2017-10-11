package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Member first = new Member(mediator);
		new Member(mediator);
		new Member(mediator);
		first.perform();
	}
}
