package apena.dataStructures;

public class CircularLinkedList {
	private Node<String> tail = null;
	private int capacity = 0;
	public CircularLinkedList() {}
	
	public int size(){
		return capacity;
	}
	
	public boolean isEmpty(){
		return capacity==0;	
	}
	
	public Object first(){
		if(isEmpty()) return null;
		return tail.next.val;
	}
	
	public String last(){
		if(isEmpty()) return null;
		return tail.getVal();
	}
	
	public void rotate(){
		if(tail!=null)
			tail = tail.next;
	}
	
	public void addFirst(String value){
		if(capacity==0){
			tail = new Node<String>(value,null);
			tail.next = tail;
		}else{
			Node<String> newest = new Node<String>(value);
			tail.next=newest;
		}
		capacity++;
	}
	
	public void addLast(String value){
		addFirst(value);
		tail = tail.next;
	}
	public Object removeFirst(){
		if(isEmpty()) return null;
		Node<String> head = tail.next;
		if (head == tail) tail = null;
		else tail.next=head.next;
		capacity--;
		return head.getVal();
	}
	
//	@Override
//	public String toString() {
//		if (isEmpty())return "Empty";
//		Node node = tail.next;
//		String toString="";
//		while(node!=tail){
//			toString=node.val+", ";
//		}
//		return toString;
//	}
	
}
