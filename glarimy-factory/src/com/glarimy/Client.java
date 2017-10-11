package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Component comp = Factory.get();
		comp.service();
	}
}
