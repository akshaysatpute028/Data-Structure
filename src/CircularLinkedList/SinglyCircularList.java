package CircularLinkedList;

import java.util.Scanner;

import LinkedList.Node;

public class SinglyCircularList {
	CNode head;
	CNode last;
	int count;
	SinglyCircularList(){
		head=null;
		last=null;
		count=0;
	}
	
	public void createList(int size) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.print("Enter Element : ");
			int data=s.nextInt();
			CNode t=new CNode(data);
			if(head==null) {
				head=t;
				last=t;
				t.next=head;
			}
			else {
				last.next=t;
				last=t;
				t.next=head;
			}
			count++;
		}
	}
	public void showList() {
		CNode t=head;
		while(t.next != head) {
			System.out.print(" "+t.data);
			t=t.next;
		}
		System.out.print(" "+t.data);
	}
	public void insertAtEnd() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Element : ");
		int data=s.nextInt();
		CNode t=new CNode(data);
		if(head==null) {
			head=t;
		}
		else {
			last.next=t;
		}
		last=t;
		t.next=head;
		count++;
	}
	public void insertAtFirst() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Element : ");
		int data=s.nextInt();
		CNode t=new CNode(data);
		if(head==null) {
			head=t;
			last=t;
			t.next=head;
		}
		else {
			t.next=head;
			head=t;
			last.next=t;
		}
		count++;
	}
	public void size() {
		System.out.print("Size of List "+count);
	}

	public void insertInBetween(int data,int pos) {
		if(pos>=count || count<2) {
			System.out.println("Insertion not possible first insert nodes");
		}
		else {
			CNode t=new CNode(data); //connect node
			CNode r=head;
			for(int i=1;i<pos-1;i++) {
				r=r.next;
			}
			t.next=r.next;
			r.next=t;
			count++;
		}
		
	}
	public void removeNode(int pos) {
      	if(pos>count|| count<3)
      	{
      		System.out.println("deletion not possible");
      	}
      	else
      	{
      		CNode t=head;
      		CNode r=null;
      		for(int i=1;i<pos;i++)
      		{
      			r=t;
      			t=t.next;
      		}
      		r.next=t.next;
      		count--;
      	}
	}
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is empty nothing can be deleted");
		}
		else {
			head=head.next;
			last.next=head;
			count--;
		}
	}
	public void removeLast() {
  	  if(head==null)
  		{
  			System.out.println("List is empty nothing can be deleted");
  		}
  		else
  		{
  			CNode t=head;
  			while(t.next!=last)
  			{
  				t=t.next;
  			}
  			t.next=head;
  			last=t;
  			count--;
  		}
	}
}
