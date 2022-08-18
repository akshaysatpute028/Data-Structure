package Stack;

public class CharStack {
	char arr[];
	int top;
	int max;
	
	public CharStack(){
		max=10;
		arr=new char[max];
		top=-1;
	}
	public CharStack(int max){
		this.max=max;
		arr=new char[max];
		top=-1;
	}
	
	public void push(char data) {
		if(top==max-1) {
			System.out.println("Stack is full !");
		}
		else {
			top++;
			arr[top]=data;
		}
	}
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return 0;
		}
		else {
			char data=arr[top];
			arr[top]=0;
			top--;
			return data;
		}
	}
	public char peek() {
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
}
