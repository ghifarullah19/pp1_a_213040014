package case_stack;

public class AbstractStack 
{
	protected int[] arr;
	protected int capacity;
	protected int TOP;
	
	public final int MIN=-1;
		
	public AbstractStack(int capacity) {
		arr = new int[capacity];		
		this.capacity = capacity;
		TOP = MIN;
	}

	public void push(int data)
	{
		if (!isFull()) {
			TOP++;
			arr[TOP]=data;
		}
		else
			System.out.println("Stack Penuh ... ");
	}
	
	public int pop() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return -1;
        } else {
            int temp = arr[TOP];
    		TOP -= 1;
    		return temp;
        }
    }
	
	public boolean isFull()
	{
		return TOP == (capacity-1) ? true : false;
	}
	
	public boolean isEmpty()
	{
		return TOP == MIN;
	}

	public int size() 
	{
		return TOP+1;
	}

	public int top() 
	{
		return isEmpty() ? -1 : arr[TOP];
	}

	public String displayStack() {
		String elemen = "";
		for (int i = TOP; i > MIN; i--) {
			elemen=elemen+ arr[i]+ " ";
		}
		return elemen;
	}
}
