package LinkedList;

public class SinglyLinkedList {
	
	static Node head,second,third,four;

	void traverse() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			System.out.println(n);
			n=n.next;
			System.out.println(n);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList list= new SinglyLinkedList();
		head=new Node(10);
		second=new Node(20);
		third=new Node(30);
		four=new Node(40);
		
		head.next=second;
		second.next=third;
		third.next=four;
	
		list.traverse();

	}
}
