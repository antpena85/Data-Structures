package apena.dataStructures;

public class Main {
	
	public static String repeat1(char c, int n){
		String answer ="";
		for (int j = 0; j < n; j++)
			answer+=c;
		return answer;
	}
	public static String repeat2(char c, int n){
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < n; j++)
			sb.append(c);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int n = 500000;
		long startTime = System.currentTimeMillis();
		repeat1('*', n);
		long endTime = System.currentTimeMillis();
		long elapsed = endTime-startTime;
		System.out.println("Time of repeat1: "+elapsed);
		
		startTime = System.currentTimeMillis();
		repeat2('c', n);
		endTime = System.currentTimeMillis();
		elapsed = endTime-startTime;
		System.out.println("Time of repeat2: "+elapsed);
		
		
//		SingleLinkedList<String> list = new SingleLinkedList<>();
//		System.out.println("Is the list empty: "+list.isEmpty());
//		list.addFirst("first entry");
//		list.addLast("second entry");
//		System.out.println("is the list empty now: "+list.isEmpty());
//		System.out.println("first element in list is "+list.first());
//		System.out.println("last element in list is "+list.last());
//		System.out.println("the size of the list is: "+list.size());
//		System.out.println("Lest consume the list: ");
//		while(list.first()!=null)
//			System.out.println("- "+ list.removeFirst());
//		
//		System.out.println("--------------------------------------------------");
//		
//		CircularLinkedList<String> clist = new CircularLinkedList<>();
//		System.out.println("Is the list empty: "+clist.isEmpty());
//		clist.addFirst("first entry");
//		clist.addLast("second entry");
//		clist.addLast("third entry");
//		System.out.println("is the list empty now: "+clist.isEmpty());
//		System.out.println("first element in list is "+clist.first());
//		System.out.println("last element in list is "+clist.last());
//		System.out.println("the size of the list is: "+clist.size());
//		clist.rotate();
//		System.out.println("lets return last again after rotate: "+clist.last());
//		System.out.println("Lest consume the list: ");
//		while(clist.first()!=null)
//			System.out.println("- "+clist.removeFirst());
//		
//		System.out.println("--------------------------------------------------");
//		
//		DoublyLinkedList<Integer> dlink = new DoublyLinkedList<Integer>();
//		for (int i = 1; i < 10; i++)
//			dlink.addFirst(i);
//		System.out.println("The list is empty: "+dlink.isEmpty());
//		System.out.printf("First integer is: %d \nLast integer is: %d \n", dlink.first(), dlink.last());
//		
//		
	}
}
