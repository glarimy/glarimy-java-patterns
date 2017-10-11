package com.glarimy;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(Component component) {
		component.service();
		System.out.println("ConcreteVisitor::visit - additional work");
	}

}
