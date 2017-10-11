package com.glarimy;

public class PrevilegedHandler extends Component {
	private Component target;

	public PrevilegedHandler(Component component) {
		target = component;
	}

	public void service() {
		System.out.println("PrevilegedHandler::service - pre");
		target.service();
		System.out.println("PrevilegedHandler::service-post");
	}
}
