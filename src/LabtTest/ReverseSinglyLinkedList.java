package LabtTest;

import java.util.Scanner;

class Node {
	public int data;
	public Node next;
	
	public Node() {
		this.data=0; 
		next=null;
	}
	
	public Node(int data){
		this.data=data;
		next=null;
	}

}
public class ReverseSinglyLinkedList {
	Node head;
	int count;
	int data;
	void create(int n) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.print("Enter element : ");
			data=s.nextInt();
			Node t=new Node(data);
			
			if(head==null) {
				head=t;
			}
			else {
				Node r=head;
				while(r.next!=null) {
					r=r.next;
				}
				r.next=t;
			}
			count ++;
		}
	
	}
	void showList() {
		Node t=head;
		Scanner s=new Scanner(System.in);

		while(t!= null) {
			System.out.print(" "+t.data);
			t=t.next;
		}
	
	}
	public void reverse() {
		Node t,r,s;
		r=null ;
		t=head;
		while(t!=null) {
			s=r;
			r=t;
			t=t.next;
			r.next=s;
		}
		head=r;
	}
	public static void main(String[] args) {
		ReverseSinglyLinkedList rsll=new ReverseSinglyLinkedList();
		rsll.create(5);
		System.out.println("Linked List : ");
		rsll.showList();
		
		rsll.reverse();
		System.out.println("\nReverse Linked List : ");
		rsll.showList();
	}

}
