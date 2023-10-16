package pertemuan08_List;

//Latihan 1
public class Node {
    private Matakuliah data;
    private Node next;
    
    public Node(Matakuliah data) {
        this.data = data;
    }
    
    public void setData(Matakuliah data) {
        this.data = data;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Matakuliah getData() {
        return this.data;
    }
    
    public Node getNext() {
        return this.next;
    }
}
