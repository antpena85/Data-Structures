package apena.dataStructures;

public class CircularLinkedList<E> {
	private Node<E> tail = null;
	private int size = 0;

	public CircularLinkedList() {
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Object first() {
		if (isEmpty())
			return null;
		return tail.getNext().getVal();
	}

	public E last() {
		if (isEmpty())
			return null;
		return tail.getVal();
	}

	public void rotate() {
		if (tail != null)
			tail = tail.getNext();
	}

	public void addFirst(E value) {
		if (size == 0) {
			tail = new Node<E>(value, null);
			tail.setNext(tail);
		} else {
			Node<E> newest = new Node<E>(value, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}

	public void addLast(E value) {
		addFirst(value);
		tail = tail.getNext();
	}

	public Object removeFirst() {
		if (isEmpty())
			return null;
		Node<E> head = tail.getNext();
		if (head == tail)
			tail = null;
		else
			tail.setNext(head.getNext());
		size--;
		return head.getVal();
	}
}
