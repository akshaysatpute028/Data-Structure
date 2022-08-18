package LinkedList;

import java.util.Scanner;

public class ListHandler {
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LinkedList li=new LinkedList();
		
		System.out.println("1. Create Linked List \n2. Show List \n3. Insert Node At End "
				+ " \n4. Insert Node At Start \n5. Insert Node In Between \n6. Remove "
				+ "First Node \n7. Remove Last Node \n8. Remove By Position \n9. Remove By Data"
				+ "  \n10. Search By Data \n11. Reverse List \n12. Size Of List \n13. Reverse LinkedList \n14. Exit");
		
		System.out.println("\nIntial Size :");
		li.size();
		
		int choice=0;
		while(choice!=13) {
			System.out.println("\nEnter Choice : ");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Create List :");
				li.create(5);
			}
			else if(choice==2) {
				System.out.println("Linked List :");
				li.showList();
			}
			else if(choice==3) {
				System.out.println("Insertion at end :");
				li.insertAtEnd();
			}
			else if(choice==4) {
				System.out.println("Insertion at start :");
				li.insertAtStart();
			}
			else if(choice==5) {
				System.out.println("Insertion in between :");
				int data,pos;
				System.out.println("Enter element :");
				data=s.nextInt();
				System.out.println("Enter position :");
				pos=s.nextInt();
				li.insertInBetween(data,pos);
			}
			else if(choice==6) {
				li.deleteFirstNode();
				System.out.println("Removed First Node");
			}
			else if(choice==7) {
				li.deleteLasttNode();
				System.out.println("Removed Last Node");
			}
			else if(choice==8) {
				System.out.println("Enter position :");
				int pos=s.nextInt();
				li.removeFromPos(pos);
			}
			else if(choice==9) {
				System.out.println("Enter Data :");
				int data=s.nextInt();
				li.removeByData(data);
			}
			else if(choice==10) {
				System.out.println("Enter Data :");
				int data=s.nextInt();
				li.searching(data);;
			}
			else if(choice==11) {
				li.reverse();
			}
			else if(choice==12) {
				System.out.println("Size :");
				li.size();
			}
			else if(choice==13) {
				head.next=li.recursivereverse(head.next);
			}
			else System.out.println("Incorrect choice !");
		}
		
	}

}
