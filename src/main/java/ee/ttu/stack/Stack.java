package ee.ttu.stack;

import java.util.ArrayList;

/**
 * Created by Elinda on 08.11.2016.
 */
public class Stack implements StackInterface {
	private final ArrayList<Object> objects = new ArrayList<Object>();

	public Object push(Object item) {
		objects.add(item);
		return item;
	}

	public Object peek() {
		if (objects != null && !empty()) {
			return objects.get(objects.size() - 1);
		}
		return null;
	}

	public boolean empty() {
		return objects.size() <= 0;
	}

	public Object pop() {
		Object item = peek();
		objects.remove(item);
		return item;
	}
}
