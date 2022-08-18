package Queue;

public class QueueArray {
	int arr[];
	int front;   //first
	int rear;    //last
	int max;
	
	// Construct QueueArray
	QueueArray(){
		max=10;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	QueueArray(int max){
		this.max=max;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	public void enqueue(int data) {
		if(rear==max-1) {
			System.out.println("Queue is full !");
		}
		else {
			rear++;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
		}
	}
	public int dequeue() {
		int val=0;
		if(front==-1) {
			System.out.println("Queue is empty !");
			return val;
		}
		else {

			if(front==rear) {
				val=arr[front];
				front=-1;
				rear=-1;
				return val;
			}
			else {
				val=arr[front];
				arr[front]=0;
				front++;
				return val;
			}
		}
	}
	public void display() {
		if(front==-1) {
			System.out.println("Queue is empty !");
		}
		else {
			System.out.print("[");
			for(int i=front;i<=rear;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println(" ]");
		}
	}
	
	public static void main(String[] args) {
		QueueArray queue=new QueueArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();
		int remove=queue.dequeue();
		System.out.println(remove);
		remove=queue.dequeue();
		System.out.println(remove);
		queue.display();
		remove=queue.dequeue();
		System.out.println(remove);
		queue.display();
		remove=queue.dequeue();
		System.out.println(remove);
		queue.display();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		remove=queue.dequeue();
		System.out.println(remove);
		queue.display();
	}

}
