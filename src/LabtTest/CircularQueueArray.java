package LabtTest;

public class CircularQueueArray {
	int arr[];
	int front; 
	int rear;  
	int max;
	
	CircularQueueArray(){
		max=10;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	CircularQueueArray(int max){
		this.max=max;
		arr=new int[max];
		front=-1;
		rear=-1;
	}
	public void enqueue(int data) {
		if((front==0 && rear==max-1) || front==rear+1) {
			System.out.println("Queue is full !");
		}
		else {
			if(rear==max-1)
				rear=0;
			else 
				rear++;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
		}
	}

	public void display() {
		if(front==-1) {
			System.out.println("Queue is empty !");
		}
		else {
			if(rear>=front) {
				System.out.print("[");
				for(int i=front;i<=rear;i++) {
					System.out.print(" "+arr[i]);
				}
				System.out.println(" ]");
			}
			else {
				System.out.print("[");
				for(int i=front;i<=max;i++) {
					System.out.print(" "+arr[i]);
				}
				for(int i=0;i<=rear;i++) {
					System.out.print(" "+arr[i]);
				}
				System.out.println(" ]");
			}
		}
	}

	public static void main(String[] args) {
		CircularQueueArray queue=new CircularQueueArray();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();

	}

}