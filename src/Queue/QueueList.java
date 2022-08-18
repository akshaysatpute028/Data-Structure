package Queue;

import LinkedList.Node;

public class QueueList {
	Node front,rear;
	int count;
	QueueList(){
		front=rear=null;
		count=0;
	}
	
	@SuppressWarnings("unused")
	public void enqueue(int data) {
		Node t=null;
		t=new Node(data);
		if(t==null) {
			System.out.println("Queue is full !");
		}
		else {
			if(front==null) {
				front=t;
				rear=t;
			}
			else {
				rear.next=t;
				rear=t;
			}
			count++;
		}
	}
	public int dequeue() {
		int val=0;
		if(front==null) {
			System.out.println("Queue is empty !");
		}
		else {
			val=front.data;
			if(front==rear) {
				front=null;
				rear=null;
			}
			else {
				front=front.next;
				count--;
			}
		}
		return val;
	}
	public void display() {
		if(front==null) {
			System.out.println("Queue is empty !");
		}
		else {
			Node t=front;
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
		QueueList queue=new QueueList();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();
		int remove=queue.dequeue();
		System.out.println("Dequeue : "+remove);
		remove=queue.dequeue();
		System.out.println("Dequeue : "+remove);
		queue.display();
		remove=queue.dequeue();
		System.out.println("Dequeue : "+remove);
		queue.display();
		remove=queue.dequeue();
		System.out.println("Dequeue : "+remove);
		queue.display();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		remove=queue.dequeue();
		System.out.println("Dequeue : "+remove);
		queue.display();
	}

}
