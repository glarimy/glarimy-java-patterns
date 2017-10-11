package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Component comp = new Component();
		PrevilegedHandler second = new PrevilegedHandler(comp);
		Handler first = new Handler(second);
		first.service();
	}
}
