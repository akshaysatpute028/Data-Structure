package Array;

import java.util.Scanner;

public class ArrayExample {
	Scanner s=new Scanner(System.in);
	int arr[];
	int capacity;
	int size;
	ArrayExample(){
		capacity=10;
		arr=new int[capacity];
		size=0;
	}
	
	ArrayExample(int capacity){
		this.capacity=capacity;
		arr=new int[this.capacity];
		size=0;
	}
	
	void createArray(int n) {
		System.out.println("Enter Elements to Array : ");
		if(n>=capacity) {
			System.out.print("Array size exceeds the limit");
		}
		else {
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			size=n;
		}
	}
	void insert(int pos) {
		System.out.println("Enter element data = ");
		int data=s.nextInt();
		if(pos>size || size==capacity|| pos>capacity)
		{
			System.out.println("invalid position, cannot insert");
		}
		else
		{
			if(pos==size)
			{
				arr[pos]=data;
			}
			else
			{
				for(int i=size;i>pos;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[pos]=data;
			}
			size++;
			
		}
	}
	public void deletion(int pos)
	{
	    if(pos>=size||pos>=capacity)
	    {
	        System.out.println("invalid position cannot delete");
	    }
	    else
	    {
	        for(int i=pos;i<size;i++)
	            arr[i]=arr[i+1];

	        size--;
	    }
	}
	void displayArray() {
		
		if(size==0) {
			
		}
		else {
			for(int i=0;i<size;i++) {
				System.out.print(" "+arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayExample a=new ArrayExample(10);
		a.createArray(5);
		a.displayArray();
		a.insert(2);
		a.displayArray();
	}
}
