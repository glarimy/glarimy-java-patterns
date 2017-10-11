package com.glarimy;

public class Factory {
	public static ComponentImpl get() {
		return new ComponentImpl();
	}
}
