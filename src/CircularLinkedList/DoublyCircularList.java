package CircularLinkedList;

import java.util.Scanner;

public class DoublyCircularList {
CNode head;
CNode last;
int count;
public DoublyCircularList() {
	head=null;
	last=null;
	count=0;
}
public void createlist(int n)
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<n;i++)
{
	System.out.println("enter the data");
	int d=sc.nextInt();
	CNode t=new CNode(d);
	if(head==null)
	{
		head=t;
		last=t;
	}
	else
	{
		last.next=t;
		t.prev=last;
		last=t;
	}
	t.next=head;
	head.prev=last;
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
		CNode t=head;
		do
		{
			if(t.next==head)
				System.out.println(t.data);
			else
				System.out.print(t.data+" -> ");
			
			t=t.next;
		}while(t!=head);
	}
	
}
public int size()
{
	return count;
}
public void insertlast(int d)
{
	CNode t=new CNode(d);
	if(head==null)
	{
		head=t;
		last=t;
	}
	else
	{
		last.next=t;
		t.prev=last;
		last=t;
	}
	t.next=head;
	head.prev=last;
	count++;
}

public void insertfirst(int d)
{
	CNode t=new CNode(d);
	if(head==null)
	{
		head=t;
		last=t;
		t.next=head;
	}
	else
	{
		t.next=head;
		head.prev=t;
		head=t;
	}
	
	head.prev=last;
}}
