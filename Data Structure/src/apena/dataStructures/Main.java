package apena.dataStructures;

public class Main {
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<>();
		System.out.println("Is the list empty: "+list.isEmpty());
		list.addFirst("first entry");
		list.addLast("second entry");
		System.out.println("is the list empty now: "+list.isEmpty());
		System.out.println("first element in list is "+list.first());
		System.out.println("last element in list is "+list.last());
		System.out.println("the size of the list is: "+list.size());
		System.out.println("Lest consume the list: ");
		while(list.first()!=null)
			System.out.println("- "+ list.removeFirst());
		
		System.out.println("--------------------------------------------------");
		
		CircularLinkedList<String> clist = new CircularLinkedList<>();
		System.out.println("Is the list empty: "+clist.isEmpty());
		clist.addFirst("first entry");
		clist.addLast("second entry");
		clist.addLast("third entry");
		System.out.println("is the list empty now: "+clist.isEmpty());
		System.out.println("first element in list is "+clist.first());
		System.out.println("last element in list is "+clist.last());
		System.out.println("the size of the list is: "+clist.size());
		clist.rotate();
		System.out.println("lets return last again after rotate: "+clist.last());
		System.out.println("Lest consume the list: ");
		while(clist.first()!=null)
			System.out.println("- "+clist.removeFirst());
	}
}
