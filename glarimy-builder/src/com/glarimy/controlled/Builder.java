package com.glarimy.controlled;

public class Builder {
	private Component component;

	public Builder() {
		component = new Component();
	}

	public Builder addX(int x) {
		component.x = x;
		return this;
	}

	public Builder addY(int y) {
		component.y = y;
		return this;
	}

	public Component build() {
		return component;
	}
}
