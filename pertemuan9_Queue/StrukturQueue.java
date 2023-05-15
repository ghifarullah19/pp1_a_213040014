package pertemuan9_Queue;

public class StrukturQueue {

    // Latihan 2
    private Node FRONT = null;
    private Node REAR = null;

    // Latihan 2
    public boolean isEmpty() {
        return (FRONT == null && REAR == null);
    }

    // Latihan 1
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    // Tugas
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            Node tempFRONT = FRONT;
            FRONT = FRONT.getNext();
            REAR = null;
            tempFRONT = null;
        }
    }

    // Latihan 3
    public int size() {
        Node curNode = FRONT;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }

        return jumlah;
    }

    // Latihan 3
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    // Latihan 5
    public void displayElement() {
        Node curNode = FRONT;
        System.out.print("Elemen Queue: ");
        if (isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
}
