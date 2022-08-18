package LinkedList;

public class SingleLinkedListTwo {
	
	static void listReader(Node[] NodeArray) {
		System.out.println("Linked List :");
		for(int i=0;i<NodeArray.length;i++)
			System.out.print(" "+NodeArray[i].data);

		System.out.println("\nReverse Linked List :");
		for(int i=NodeArray.length-1;i>=0;i--)
			System.out.print(" "+NodeArray[i].data);
	}

	public static void main(String[] args) {
		try {
			Node head=new Node(100);
			Node two=new Node(200);
			Node three=new Node(300);
			Node four=new Node(400);
			head.next=two;
			two.next=three;
			three.next=four;
			four.next=null;   //not necessary
			
			Node NodeArray[]= {head,two,three,four};
			listReader(NodeArray);
		}
		catch(Exception e) {    // Null pointer exception 
			System.out.print(e);// when default constructor is called
		}
	}

}
