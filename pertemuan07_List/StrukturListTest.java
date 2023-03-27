package pertemuan07_List;

public class StrukturListTest {
	public static void main(String[] args) {
		// Latihan 4
		StrukturList listSatu = new StrukturList();				
		System.out.println("Latihan 4");
		listSatu.addHead(7);
		listSatu.addTail(6);
		listSatu.addTail(4);
		listSatu.addTail(2);
		listSatu.addTail(3);
		
		listSatu.displayElement();
		
		System.out.println(listSatu.size());

//		System.out.println("Latihan 2");
//		listSatu.addTail(5);
//		listSatu.addTail(4);
//		listSatu.addTail(6);
//		
//		listSatu.displayElement();
//		
//		System.out.println(listSatu.find(6));

//		System.out.println("Latihan 5");
//		listSatu.addHead(4);
//		listSatu.addTail(3);
//		listSatu.addTail(7);
//		listSatu.addTail(8);
//		listSatu.addTail(1);
//		listSatu.addTail(9);
//		listSatu.displayElement();
//		listSatu.removeAll();
//		listSatu.displayElement();
    }
}
