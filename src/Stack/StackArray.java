package Stack;

public class StackArray {
	int arr[];
	int top;
	int max;
	
	public StackArray(){
		max=10;
		arr=new int[max];
		top=-1;
	}
	public StackArray(int max){
		this.max=max;
		arr=new int[max];
		top=-1;
	}
	
	public void push(int data) {
		if(top==max-1) {
			System.out.println("Stack is full !");
		}
		else {
			top++;
			arr[top]=data;
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return 0;
		}
		else {
			int data=arr[top];
			arr[top]=0;
			top--;
			return data;
		}
	}
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return 0;
		}
		else {
			return arr[top];
		}
	}
	public boolean isEmpty() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return true;
		}
		else {
			return false;
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty !");
		}
		else {
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.print(" ]");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StackArray s =new StackArray(); 
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		int pop=s.pop();
		System.out.println("Pop : "+pop);
		s.display();
		int peek=s.peek();
		System.out.println("Peek : "+peek);
	}

}
