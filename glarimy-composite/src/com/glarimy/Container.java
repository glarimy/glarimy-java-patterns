package com.glarimy;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component {
	private List<Component> children = new ArrayList<>();

	public void add(Component child) {
		children.add(child);
	}

	public void close() {
		for (Component child : children)
			child.close();
		System.out.println("Container::close");
	}

	public void remove(Component child) {
		children.remove(child);
	}
}
