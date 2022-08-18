package LinkedList;

public class SingelyLinkedListThree {
	
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
		Node n=head;
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
		
		head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		
		printList();
	}

}
