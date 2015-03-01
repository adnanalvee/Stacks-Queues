
public class SimpleStack {

	private int maxSize;         //size of stack array
	private long[] stackArray;	 
	private int top;             //top of the stack
	
	public SimpleStack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long j) {
		stackArray[++top] = j;
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	
	
	public static void main(String[] args) {
		
		SimpleStack theStack = new SimpleStack(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.println(" ");
		}
		
		System.out.println("");
		
		
		

	}

}
