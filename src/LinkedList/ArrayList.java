package LinkedList;

import java.util.*;

public class ArrayList {
	static Node head;
	public static void main(String[] args) {
		
		Node[] t=new Node[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<t.length;i++) {
			
			System.out.print("Enter Element : ");
			int data=s.nextInt();
			t[i]=new Node(data);
			
			if(head==null) {
				head=t[i];
			}
			else {
				Node r=head;           //address to first node
				while(r.next!=null) {
					r=r.next;
					
				}
				r.next=t[i];            //address to next node
			}
		}
		//Arrays.sort(t);
		int j=0;
		while(t[j]!= null) {
			System.out.print(" "+t[j].data);
			t[j]=t[j].next;
		}
		
	}
}
