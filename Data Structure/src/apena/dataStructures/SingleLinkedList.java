package apena.dataStructures;

class SingleLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size=0;
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public E first(){
		if(isEmpty())
			return null;
		return head.getVal();
	}
	public E last(){
		if(isEmpty())
			return null;
		return tail.getVal();
	}
	public void addFirst(E value){
		head = new Node<>(value,head);
		if (size==0) 
			tail=head;
		size++;
	}
	public void addLast(E value){
		Node<E> last = new Node<>(value,null);
		if(isEmpty())
			head = last;
		else
			tail.setNext(last);
		tail = last;
		size++;
	}
	public E removeFirst(){
		if(isEmpty()) return null;
		E delete = head.getVal();
		head = head.getNext();
		size--;
		if(size==0)
			tail = null;
		return delete;
	}
}
