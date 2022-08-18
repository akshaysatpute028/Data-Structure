package LinkedList;

public class SingelyLinkedListFour {
	
	static Node head,two,three,four,five;
	
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			Node next=null;
		}
	}
	static void printList() {
		Node n=five;
		System.out.println("Reverse Linked List :");
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		
		head=new Node(11);
		two=new Node(12);
		three=new Node(13);
		four=new Node(14);
		five=new Node(15);
		
		head.next=five;
		five.next=four;
		four.next=three;
		three.next=two;
		two.next=head;
		head.next=null; // required
		
		printList();
	}

}

