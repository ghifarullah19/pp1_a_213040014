package pertemuan08_List;

public class StrukturList {
    private Node head = null;
    
    public boolean isEmpty() {
    	return (head == null);
    }
    
    // Latihan 2
    void addHead(Matakuliah data) {
    	Node newNode = new Node(data);
    	
    	if (isEmpty()) {
    		head = newNode;    		
    	} else {
    		newNode.setNext(head);
    		head = newNode;    		
    	}
    }
    
    // Tugas 1
    void addTail(Matakuliah data) {
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
    
    // Tugas 1
    void addMiddle(Matakuliah data, int position) {
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
    
    // Tugas 2
	void removeHead() {
		if (isEmpty()) {
			System.out.println("Data masih kosong");
		} else {
			head = head.getNext();
		}
	}
	
	// Tugas 2
	void removeMiddle(String data) {
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
			while (delNode != null && !(ketemu)) {
				if (delNode.getData().getKode().equals(data)) {
					ketemu = true;
				} else {
					preNode = delNode;
					delNode = delNode.getNext();
					i++;
				}
			}
			
			if (ketemu == true) {
				if (i == 1) {
					head = delNode.getNext();
				} else {
					preNode.setNext(delNode.getNext());
				}
			}
		}
	}
	
	// Tugas 2
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
			int length = count();
			for (int i = 0; i < length; i++) {
				removeHead();
			}
			
			// Algoritma 2
			//while (!isEmpty()) {
			//	removeHead();
			//}
		}
	}
    
	// Tugas 3
	String find (String nrp) {
		Node curNode;
		boolean ketemu;
		
		curNode = head;
		ketemu = false;
		
		while (curNode != null && !(ketemu)) {
			if (curNode.getData().getKode().equals(nrp)) {
				ketemu = true;
			} else {
				curNode = curNode.getNext();
			}
		}
		
		return curNode.getData().getKode() + " " + curNode.getData().getNama() + " " + curNode.getData().getSks();
	}
	
	// Latihan 5
	int count() {
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
	
	// Latihan 3
    void displayElement() {
    	Node curNode = head;
    	if (isEmpty()) {
    		System.out.println("List Kosong");
    	} else {
    		while (curNode != null) {
    			System.out.println("Matakuliah: " + curNode.getData().getKode() + " " + 
    					curNode.getData().getNama() + " " + curNode.getData().getSks());
    			curNode = curNode.getNext();
    		}
    		System.out.println();
    	}
    }
    
}
