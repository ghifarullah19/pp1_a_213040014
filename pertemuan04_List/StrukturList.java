package pertemuan04_List;

public class StrukturList {
    private Node head = null;
    
    public boolean isEmpty() {
    	return (head == null);
    }
    
    void addHead(double data) {
    	Node newNode = new Node(data);
    	
    	if (isEmpty()) {
    		head = newNode;    		
    	} else {
    		newNode.setNext(head);
    		head = newNode;    		
    	}
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
    
    void addMiddle(double data, int position) {
    	Node newNode = new Node(data);
    	Node curNode = null;
    	Node posNode = null;
    	int i;
    	
    	if (isEmpty()) {
    		head = newNode;
    	} else {
    		curNode = head;
    		if (position == 1) {
    			newNode.setNext(curNode);
    			head = newNode;
    		} else {
    			i = 1;
    			while (curNode != null && i < position) {
    				posNode = curNode;
    				curNode = curNode.getNext();
    				i++;
    			}
    			posNode.setNext(newNode);
    			newNode.setNext(curNode);
    		}
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
        LL.addTail(4);
        LL.addMiddle(7, 2);
        LL.addMiddle(8, 2);
        LL.addHead(5);
        
        LL.displayElement();
    }
}
