package com.glarimy;

public class Member {
	Mediator mediator;

	public Member(Mediator mediator) {
		this.mediator = mediator;
		mediator.register(this);
	}

	public void receive(String message) {
		System.out.println("Member::receive - message: " + message);
	}

	public void perform() {
		mediator.notify("Member Notification");
	}
}
