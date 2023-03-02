package pertemuan03_List;

public class StrukturList {
    private Node head = null;
    
    public boolean isEmpty() {
    	return (head == null);
    }
    
    
    void addTail(double data) {
        Node newNode = new Node(data);
        Node posNode = null;
        Node curNode = null;
        
        if (isEmpty()) {
            head = newNode;
        } else {
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
    
    
    void displayElement() {
    	Node curNode = head;
    	while (curNode != null) {
    		System.out.printf("%.0f ", curNode.getData());
    		curNode = curNode.getNext();
    	}
    }
    
    public static void main(String[] args) {
        StrukturList LL = new StrukturList();
        
        LL.addTail(3);
        LL.addTail(2);
        LL.addTail(1);
        LL.addTail(7);
        
        LL.displayElement();
    }
}
