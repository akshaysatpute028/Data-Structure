package DoublyLinkedList;

public class DoublyListHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyList dlist=new DoublyList();
		System.out.println(" size of list   "+dlist.size());
		dlist.createlist(5);
		dlist.display();
		System.out.println("after creation size of list   "+dlist.size());
		System.out.println("list after insertion at the end");
		dlist.insertlast(100);
		dlist.display();
		System.out.println("after insertion size of list   "+dlist.size());
		System.out.println("list after insertion at the beg");
		dlist.insertfirst(5);
		dlist.display();
		System.out.println("after insertion size of list   "+dlist.size());
		System.out.println("list after insertion at the pos");
		dlist.insertatpos(34,3);
		dlist.display();
		System.out.println("after insertion size of list   "+dlist.size());
		System.out.println("list after deletion at the beg");
		dlist.removefirst();
		dlist.display();
		System.out.println("after deletion size of list   "+dlist.size());
		System.out.println("list after deletion at the last");
		dlist.removelast();
		dlist.display();
		System.out.println("after deletion size of list   "+dlist.size());
		System.out.println("list after deletion at the pos");
		dlist.removeatpos(3);
		dlist.display();
		System.out.println("after deletion size of list   "+dlist.size());
	}

}