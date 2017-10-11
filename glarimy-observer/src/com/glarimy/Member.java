package com.glarimy;

public class Member {
	Observer mediator;

	public Member(Observer mediator) {
		this.mediator = mediator;
		mediator.register(this);
	}

	public void receive(String message) {
		System.out.println("Member::receive - message: " + message);
	}
}
