package apena.dataStructures;

class Node<E> {
	
	E val;
	Node<E> next;
	
	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public E getVal() {
		return val;
	}

	public Node(){
		setVal(null);
		next = null;
//		previous = null;
	}
	
	public Node(E value) {
		setVal(value);
		next = null;
//		previous = null;
	}
	
	public Node(E value, Node<E> node){
		setVal(value);
		next = node;
	}

	void setVal(E val) {
		this.val = val;
	}
	
}
