package com.glarimy;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Singleton::cons");
	}

	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	public void service() {
		System.out.println("Singleton::service");
	}
}
