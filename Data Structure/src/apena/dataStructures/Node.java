package apena.dataStructures;

class Node<E> {
	private E val;
	private Node<E> next;	
	public Node(E value, Node<E> node){
		val = value;
		next = node;
	}
	public E getVal() {
		return val;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> n) {
		this.next = n;
	}
}
