package Stack;

public class StackLinkedList {
	StackNode top;
	int count;
	
	StackLinkedList(){
		top=null;
		count=0;
	}
	
	static public class StackNode{     //Stack Node
		StackNode next;
		int data;
		StackNode(){
			data=0;
			next=null;
		}
		StackNode(int data){
			this.data=data;
			next=null;
		}
	}
	
	@SuppressWarnings("unused")
	public void push(int data) {
		StackNode t=null;
		t=new StackNode(data);
		if(t==null) {
			System.out.println("Stack is full !");
		}
		else {
			if(top==null) {
				top=t;
			}
			else {
				t.next=top;
				top=t;
			}
			count++;
		}
	}
	
	public int pop() {
		if(top==null) {
			System.out.println("Stack is empty !");
			return 0;
		}
		else {
			int val = top.data;  // t is used to point  to that node which we want to delete
			top=top.next;
			count--;
			return val;
		}
	}
	public void peek() {
		if(top==null) {
			System.out.println("Stack is empty !");
		}
		else {
			System.out.println("Peek : "+top.data);
		}
	}
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty !");
		}
		else {
			StackNode t=top;
			System.out.print("[");
			while(t!=null) {
				System.out.print(" "+t.data);
				t=t.next;
			}
			System.out.print(" ]");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList s=new StackLinkedList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		int pop=s.pop();
		System.out.println("Pop : "+pop);
		s.display();
		s.peek();
	}

}
