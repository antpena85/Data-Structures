package apena.dataStructures;

public class Main {
	public static void main(String[] args) {
		System.out.println("vvvvvvvvvvvvvvv");
//		SingleLinkedList list = new SingleLinkedList();
//		System.out.println(list.isEmpty());
//		list.add("first");
//		list.add("second");
//		list.add("third");
//		list.add("fourth");
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.toString());
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		list.addFirst("head");
//		list.addLast("last");
//		System.out.println(list.toString());
//		System.out.println(list.size());
//		list.delete("head");
//		System.out.println(list.toString());
		
		CircularLinkedList clist = new CircularLinkedList();
		System.out.println(clist.isEmpty());
		System.out.println(clist.first());
		clist.addLast("first");
		System.out.println(clist.last());
		clist.addLast("second");
		System.out.println(clist.size());
//		System.out.println(clist.toString());
		System.out.println(clist.first()+" "+clist.last());
	}
}
