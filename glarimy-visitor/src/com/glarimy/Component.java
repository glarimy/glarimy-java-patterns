package com.glarimy;

public abstract class Component {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public abstract void service();

}