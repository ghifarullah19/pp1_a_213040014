package case_stack;

import case_stack.AbstractStack;

public class MyStack extends AbstractStack	{

	public MyStack (int capacity) {
		super(capacity);
	}
	
	// Latihan 1
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bottom-->Top): ");
		for (int i = 0; i < size(); i++) {
			System.out.print(peekN(i));
			System.out.print(' ');
		}
		System.out.println("");
	}
	
	// Latihan 1
	public int peekN(int n) {
		return arr[n];
	}
}
