package ee.ttu.stack;

/**
 * Created by Elinda on 08.11.2016.
 */
interface StackInterface<E> {
	E push(E item);

	E peek();

	boolean empty();

	E pop();
}
