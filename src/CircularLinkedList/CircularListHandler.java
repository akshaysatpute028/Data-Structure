package CircularLinkedList;

import java.util.Scanner;

public class CircularListHandler {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SinglyCircularList scl=new SinglyCircularList();
		System.out.println("1. Create Linked List \n2. Show List \n3. Size \n4. Insert At End \n5. Insert At Front"
				+ "\n6. Insert In Between \n7. Remove First \n8. Remove Last \n9. Remove By Position \n10. Exit" );
		
		int choice=0;
		while(choice!=10) {
			System.out.println("\nEnter Choice : ");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Create List :");
				scl.createList(5);
			}
			else if(choice==2) {
				System.out.println("Circular List :");
				scl.showList();
			}
			else if(choice==3) {
				scl.size();
			}
			else if(choice==4) {
				System.out.println("Insertion at end :");
				scl.insertAtEnd();;
			}
			else if(choice==5) {
				System.out.println("Insertion at front :");
				scl.insertAtFirst();
			}
			else if(choice==6) {
				System.out.println("Insertion in between :");
				System.out.print("Enter Position :");
				int pos=s.nextInt();
				System.out.print("Enter Element :");
				int data=s.nextInt();
				scl.insertInBetween(data,pos);
			}
			else if(choice==7) {
				System.out.println("Removing First");
				scl.removeFirst();
			}
			else if(choice==8) {
				System.out.println("Removing Last");
				scl.removeFirst();
			}
			else if(choice==9) {
				System.out.println("Enter Position :");
				int pos=s.nextInt();
				scl.removeNode(pos);
				System.out.println("Node Removed");
			}
			else System.out.println("Incorrect choice !");
		}

	}

}
