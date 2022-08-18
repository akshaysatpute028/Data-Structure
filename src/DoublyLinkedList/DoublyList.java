package DoublyLinkedList;

import java.util.Scanner;

public class DoublyList {
Dnode   head;
int count;


public DoublyList() {
	head=null;
	count=0;
}

public void createlist(int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("enter the node value");
			int d=sc.nextInt();
			Dnode t=new Dnode(d);//  allocate memory to node
			// connect node in list
			
			if(head==null)// list empty
			{
				head=t;   //first node
			}
			else
			{ 
				Dnode r=head;
				while(r.next!=null)
				{
					r=r.next;
				}
					r.next=t;
					t.prev=r;
			
			}
			count++;
		}
}
public void display()
{
	if(head==null)
	{
		System.out.println("list is empty");
	}
	else
	{
		Dnode r=head;
		while(r!=null)   // processing including last node
		{
			if(r.next==null)
				System.out.println(r.data);
			else
			System.out.print(r.data+" <=> ");
			
			r=r.next;
		}
	}
}

public int size()
{
	return count;
}
public void insertlast(int d)
{
	Dnode t=new Dnode(d);//  allocate memory to node
	// connect node in list
	
	if(head==null)// list empty
	{
		head=t;   //first node
	}
	else
	{ 
		Dnode r=head;
		while(r.next!=null)
		{
			r=r.next;
		}
			r.next=t;   // connect node in list
			t.prev=r;
	
	}
	count++;
}
 public void insertfirst(int d)
 {
	 Dnode t=new Dnode(d);//  allocate memory to node
		// connect node in list
		
		if(head==null)// list empty
		{
			head=t;   //first node
		}
		else
		{ 
			t.next=head;
			head.prev=t;
			head=t;
		}
		count++;
 }
 public void insertatpos(int d,int pos)
 {
	 if(pos>count ||count<2)
		 System.out.println("insertion not possible");
	 else
	 {
		 Dnode t=new Dnode(d);
		 
		 Dnode r=head;
		 for(int i=1;i<pos;i++)
		 {
			 r=r.next;
		 }
		 t.next=r.next;
		 t.prev=r;
		 t.next.prev=t;
		 r.next=t;
		 
		 count++;
	 }
 }
 public void removefirst()
 {
	 if(head==null)
		{
			System.out.println("deletion not possible as list is empty");
		}
		else
		{
			Dnode t=head;
			if(t.next==null)  //single node
			{
				head=null;
			}
			else
			{
				head=t.next;
				head.prev=null;
			}
			count--;
			}
 }
 public void removelast()
 {
	 if(head==null)
		{
			System.out.println("deletion not possible as list is empty");
		}
		else
		{
			Dnode t=head;
			if(t.next==null)  //single node
			{
				head=null;
			}
			else
			{
				while(t.next!=null)
				{
					t=t.next;
				}
				t.prev.next=null;
			}
			count--;
			}
			}
 public void removeatpos(int pos)
 {
	 if(pos>count|| count<3)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			Dnode t=head;
			Dnode r=null;
			for(int i=1;i<pos;i++)
			{
				r=t;
				t=t.next;
			}
			r.next=t.next;
			r.next.prev=r;
			count--;
			}
 }
}
