package com.glarimy;

public class Client {
	public static void main(String[] args) {
		Container node = new Container();
		node.add(new Component());
		node.add(new Component());
		node.add(new Component());
		node.add(new Component());
		Container root = new Container();
		root.add(node);
		root.close();
	}
}
