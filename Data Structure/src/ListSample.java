import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSample {
	
	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		System.out.println("Array list Created");
		
		if (myArrayList.isEmpty()){
			myArrayList.add("Lianna");
			myArrayList.add("Annali");
			myArrayList.add("Charlina");
			myArrayList.add("Antonio");
			myArrayList.add("delete");
		}
		
		System.out.println("Array list populated");
		
		print(myArrayList);
		
		System.out.println("Array list size is " + myArrayList.size());
		
		myArrayList.remove(4);
		
		System.out.println("Index 4 has been removed.");
		
		print(myArrayList);
		
		System.out.println("Element at index 1 is " + myArrayList.get(1));
		System.out.println("Adding another element in a specific location");
		myArrayList.add(2, "Third-child");
		
		print(myArrayList);
		
		System.out.println("replace index 2 with \"not happening\"");
		myArrayList.set(2, "not happening");
		
		print(myArrayList);
		
		System.out.print("This are mom and dad: ");
	
		
		for (String s : myArrayList.subList(3, 5)){
			System.out.print(s + " ");
		}
		System.out.println();
		print(myArrayList);
		myArrayList.remove(2);
		
		myArrayList.sort(null);
		
		print(myArrayList);
		myArrayList.clear();
		System.out.println("The array list has now been clear");
		System.out.println("Is the array list empty: "+ myArrayList.isEmpty());
	
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		LinkedList<String> myLinkedList = new LinkedList<String>();
		System.out.println("Linked list created");
		if (myLinkedList.isEmpty()){
			myLinkedList.add("Lianna");
			myLinkedList.add("Annali");
			myLinkedList.add("delete");
			myLinkedList.add("Charlina");
			myLinkedList.add("Antonio");
			
		}
		System.out.println("Linked list populated");
		print(myLinkedList);
		System.out.println("Linked list size is "+myLinkedList.size());
			
		myLinkedList.set(2, "Edited");
		
		System.out.println("Edit an element in index 2");
		
		print(myLinkedList);
		
		myLinkedList.remove(2);
		
		System.out.println("Index 4 removed from linked list");
		
		print(myLinkedList);
		
		System.out.println("Inserting an element");
		
		myLinkedList.add(2, "inserted");
		
		print(myLinkedList);
		
		System.out.println("Element at index 3 is " + myLinkedList.get(3));
		System.out.println("adding and element to the start");
		myLinkedList.push("first"); // this method is not available in array list
		
		print(myLinkedList);
		
		System.out.println("Getting the first and last value of the linked list: " + myLinkedList.getFirst()+ " " + myLinkedList.getLast() );
		
		System.out.println(myLinkedList.element());
		
		myLinkedList.pop();
		
		print(myLinkedList);
		
		
		/////////////////////
		
		Vector<Character> myVector = new Vector<Character>();
		
		if (myVector.isEmpty()){
			myVector.add('a');
			myVector.add('b');
			myVector.add('c');
		}
		
		for (char x : myVector)
			System.out.print(x);
		System.out.println();
		
		System.out.println(myVector.capacity());
		
		
	}

	private static void print(List<String> myArrayList) {
		System.out.print('|');
		for (String s : myArrayList)
			System.out.print(s + "|");
		System.out.println();
	}
	
}
