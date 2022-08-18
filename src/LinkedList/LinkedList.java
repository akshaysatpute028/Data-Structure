package LinkedList;

import java.util.Scanner;

public class LinkedList {
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
	void insertAtEnd() {
		Scanner s=new Scanner(System.in);
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
	void insertAtStart() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter element : ");
		data=s.nextInt();
		Node t=new Node(data);
		
		if(head==null) {
			head=t;
		}
		else {
			t.next=head;
			head=t;
		}
		count ++;
		
	}
	void insertInBetween(int data, int pos) {
		if(pos>=count || count<2) {
			System.out.println("Insertion not possible first insert nodes");
		}
		else {
			Node t=new Node(data);
			//connect node
			Node r=head;
			for(int i=1;i<pos-1;i++) {
				r=r.next;
			}
			t.next=r.next;
			r.next=t;
			count++;
		}
		
	}
	public void deleteFirstNode() {
		// create a refrence to point the node which we want to delete
		if(head==null) {
			System.out.println("List is empty , nothing to delete !");
		}
		else {
			Node t=head;
			head =t.next;
			count--;
			t=null; // removing node
		}
		
	}
	public void deleteLasttNode() {
		if(head==null) {
			System.out.println("List is empty , nothing to delete !");
		}
		else {
			Node t=head;
			Node r=null;
			if(t.next==null) {
				head=null;
			}
			else {
				while(t.next != null) {
					r=t;
					t=t.next;
				}
				r.next=null;
			}
			count--;
		}
		
	}
	public void removeFromPos(int pos)
	{
		if(pos>count || count<3)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			Node t=head;
			Node r=null;
			for(int i=1;i<pos;i++)
			{
				r=t;
				t=t.next;
			}
			r.next=t.next;
			count--;
		}
	}
	public void removeByData(int val)
	{
		if(head==null)
		{
			System.out.println("list is empty nothing can be deleted");
		}
		else
		{
			Node t=head;
			Node r=null;
			boolean flag=false;
			while(t!=null)
			{
				if(t.data==val)
				{
					if(t==head)  //first node
					{
						head=t.next;
					}
					else   // last and between deletion
					{
						r.next=t.next;
					}
					flag=true;
					count--;
					break;
				}
				else
				{
					r=t;
					t=t.next;
				}
			}
			if(!flag)
			{
				System.out.println("node with given value not exist in the list.");
			}
		}
	}
	public void searching(int val)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			boolean flag=false;
			Node r=head;
			int j=1;
			while(r!=null)   // processing including last node
			{ 
				if(r.data==val)
				{
					System.out.println("data found at position "+j );
					flag=true;
					break;
				}
					
				else
				{
				j++;
				r=r.next;
				}
			}
			if(!flag)  // flag==false
			{
				System.out.println("data not found");
			}
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
	public Node recursivereverse(Node t )
	{
	    if(t==null|| t.next==null)  // base case for no node or single node
	        return t;       //  last node case
	    Node revHead=recursivereverse(t.next);   // recursive
	    t.next.next=t;
	    t.next=null;
	    return revHead;
	}
	void size() {
		System.out.println(count);
	}
	
}
