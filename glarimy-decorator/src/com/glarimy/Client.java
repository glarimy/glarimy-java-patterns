package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Component comp = new Component();
		comp.service();
		Decorator decor = new Decorator(comp);
		decor.service();
		decor.decoration();
	}
}
