package com.glarimy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Component> comps = new ArrayList<>();
		comps.add(new ConcreteComponent());
		comps.add(new ConcreteComponent());
		comps.add(new ConcreteComponent());
		comps.add(new ConcreteComponent());
		Visitor visitor = new ConcreteVisitor();
		for (Component comp : comps)
			comp.accept(visitor);
	}
}
