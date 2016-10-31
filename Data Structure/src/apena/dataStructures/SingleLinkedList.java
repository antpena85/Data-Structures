package apena.dataStructures;

class SingleLinkedList {
	Node<String> head;
	Node<String> tail;
	int capacity=0;
	
	public int size(){
		return capacity;
	}
	
	public boolean isEmpty(){
		return capacity == 0;
	}
	
	public String getFirst(){
		return head.getVal();
	}
	
	public String getLast(){
		return tail.getVal();
	}
	
	public void addFirst(String value){
		Node<String> first = new Node<String>(value);
		first.setNext(head);
		head = first;
		capacity++;
	}
	
	public void addLast(String value){
		Node<String> last = new Node<String>(value);
		if(isEmpty())
			head = last;
		else
			tail.setNext(last);
		tail = last;
		capacity++;
	}
	
	public void add(String value){
		if (head==null){
			head = new Node<String>(value);
			capacity++;
		}
		else{
			Node<String> end = head;
			while (end.getNext()!=null)
				end.setNext(end);
			Node<String> next = new Node<String>(value);
			end.getNext().setNext(next); 
			tail = next;
			capacity++;
		}
	}
	
	public void delete(String value){
		Node<String> node = head;
		while(node!=null){
			if(node.getVal().equals(value)){
				node.setVal(node.next.val);
				node.next=node.next.next;
				capacity--;
			}
			node = node.next;
		}
	}
	
	@Override
	public String toString() {
		Node<String> node = head;
		String toString="";
		while(node!=null){
			toString+=node.getVal()+", ";
			node = node.next;
		}
		return toString;
	}

}
