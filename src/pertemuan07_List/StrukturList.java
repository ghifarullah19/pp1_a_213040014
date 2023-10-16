package pertemuan07_List;

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
    
	void removeHead() {
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			head = head.getNext();
		}
	}
	
	void removeMiddle(int data) {
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			Node preNode = null;
			Node delNode = null;
			int i;
			boolean ketemu;
			
			ketemu = false;
			i = 1;
			delNode = head;
			while (delNode.getNext() != null && !(ketemu)) {
				if (delNode.getData() == data) {
					ketemu = true;
				} else {
					preNode = delNode;
					delNode = delNode.getNext();
					i++;
				}
			}
			
			if (ketemu == true) {
				if (i == 1) {
					head = null;
				} else {
					preNode.setNext(delNode.getNext());
				}
			}
		}
	}
	
	void removeTail() {
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			Node preNode = null;
			Node lastNode = null;
			if (head.getNext() == null) {
				head = null;
			} else {
				lastNode = head;
				while (lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();
				}
				preNode.setNext(null);
			}
		}
	}
	
	void removeAll() {
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			// Algoritma 1
			int length = size();
			for (int i = 0; i < length; i++) {
				removeHead();
			}
			
			// Algoritma 2
			//while (!isEmpty()) {
			//	removeHead();
			//}
		}
	}
    
	boolean find(int x) {
		Node curNode;
		boolean ketemu;
		
		curNode = head;
		ketemu = false;
		
		while (curNode != null && !(ketemu)) {
			if (curNode.getData() == x) {
				ketemu = true;
			} else {
				curNode = curNode.getNext();
			}
		}
		
		return ketemu;
	}
	
	int size() {
		Node curNode;
		int jumlah;
		
		curNode = head;
		jumlah = 0;
		
		while (curNode != null) {
			jumlah++;
			curNode = curNode.getNext();
		}
		
		return jumlah;
	}
	
    void displayElement() {
    	Node curNode = head;
    	if (isEmpty()) {
    		System.out.println("List Kosong");
    	} else {
    		while (curNode != null) {
    			System.out.printf("%.0f ", curNode.getData());
    			curNode = curNode.getNext();
    		}
    		System.out.println();
    	}
    }
    
}
