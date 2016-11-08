package ee.ttu.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
	private Stack stack;

	@Before
	public void setUp() {
		stack = new Stack();
	}

	@Test
	public void push() {
		assertEquals(2, stack.push(2));
	}

	@Test
	public void peek() {
		assertEquals(null, stack.peek());
		stack.push('A');
		assertEquals('A', stack.peek());
		stack.push("Hello");
		assertEquals("Hello", stack.peek());
	}

	@Test
	public void empty() {
		assertEquals(true, stack.empty());
		stack.push(22);
		assertEquals(false, stack.empty());
	}

	@Test
	public void pop() {
		stack.push(22);
		stack.push(33);
		assertEquals(33, stack.pop());
		assertEquals(22, stack.peek());
	}
}
