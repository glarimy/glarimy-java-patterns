package com.glarimy;

public class Decorator extends Component {
	private Component target;

	public Decorator(Component component) {
		target = component;
	}

	public void service() {
		System.out.println("Decorator::decoration-pre");
		target.service();
		System.out.println("Decorator::decoration-post");
	}

	public void decoration() {
		System.out.println("Decorator::decoration");
	}
}
