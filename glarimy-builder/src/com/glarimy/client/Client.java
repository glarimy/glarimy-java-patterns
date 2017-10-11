package com.glarimy.client;

import com.glarimy.controlled.Builder;
import com.glarimy.controlled.Component;

public class Client {
	public static void main(String[] args) {
		Component comp = new Builder().addX(10).addY(35).addX(25).build();
		comp.print();
	}
}
