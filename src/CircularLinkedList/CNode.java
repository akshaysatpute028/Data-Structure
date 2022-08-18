package CircularLinkedList;

public class CNode {
	int data;
	CNode prev;
	CNode next;
	CNode(){
		this.data=0;
		prev=null;
		next=null;
	}
	
	CNode(int data){
		this.data=data;
		prev=null;
		next=null;
	}
}
