package com.glarimy;

public class Handler extends Component {
	private Component target;

	public Handler(Component component) {
		target = component;
	}

	public void service() {
		System.out.println("Handler::service - pre");
		target.service();
		System.out.println("Handler::service-post");
	}
}
