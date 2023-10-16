package pertemuan04_List;

public class StrukturListTest {
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
