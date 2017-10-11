package com.glarimy;

public class Proxy extends Component {
	private Component target;

	public Proxy(Component component) {
		target = component;
	}

	public void service() {
		System.out.println("Proxy::service - pre");
		target.service();
		System.out.println("Proxy::service-post");
	}
}
