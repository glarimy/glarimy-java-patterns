package com.glarimy;

public class ConcreteComponent extends Component {
	@Override
	public void service() {
		System.out.println("Component::service");
	}
}
