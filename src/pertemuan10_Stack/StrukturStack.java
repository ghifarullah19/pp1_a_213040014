package pertemuan10_Stack;

public class StrukturStack {

    // Latihan 2
    private int[] array;
    private int capacity;
    private int TOP;
    
    public final int MIN = -1;

    public boolean isFull() {
    	return TOP == capacity - 1;
    }
    
    // Latihan 2
    public StrukturStack(int capacity) {
    	super();
    	array = new int[capacity];
    	this.capacity = capacity;
    	TOP = MIN;
    }
    
    // Latihan 3
    public boolean isEmpty() {
        return TOP == MIN;
    }

    // Latihan 1
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
            System.out.print("push " + data + " ");
        }
    }

    // Tugas
    public void pop() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            int temp = array[TOP];
    		TOP -= 1;
        }
    }

    // Latihan 4
    public int size() {
    	return TOP == -1 ? 0 : TOP + 1;
    }

    // Latihan 4
    public int top() {
        return TOP != -1 ? array[TOP] : -1;
    }

    // Latihan 4
    public void displayElement() {
        System.out.print("Elemen Stack: ");
        if (isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
