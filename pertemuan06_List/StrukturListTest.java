package pertemuan06_List;

public class StrukturListTest {
	public static void main(String[] args) {
		
		// Latihan 2
		//StrukturList listSatu = new StrukturList();
		//System.out.println("Latihan 3");
		//listSatu.addHead(2);
		//listSatu.addHead(9);
		//listSatu.addHead(7);
		//
		//listSatu.displayElement();
		//
		//listSatu.removeHead();
		//
		//listSatu.displayElement();
		//
		//listSatu.removeHead();
		//
		//listSatu.displayElement();
		//
		//listSatu.removeHead();
		//
		//listSatu.displayElement();

		//// Latihan 4
		//StrukturList listDua = new StrukturList();
		//System.out.println("Latihan 4");
		//listDua.addHead(2);
		//listDua.addTail(6);
		//listDua.addTail(3);
		//listDua.addTail(5);
		//listDua.addTail(1);
		//
		//listDua.removeTail();
		//
		//listDua.displayElement();
		//
		//listDua.removeHead();
		//
		//listDua.displayElement();
		//
		//listDua.removeTail();
		//
		//listDua.displayElement();

        
		//Latihan 5
		StrukturList listTiga = new StrukturList();
		System.out.println("Latihan 5-1");
		listTiga.addHead(4);
		listTiga.addTail(3);
		listTiga.addTail(7);
		listTiga.addTail(8);
		listTiga.addTail(1);
		listTiga.addTail(9);
		
		listTiga.displayElement();
		
		listTiga.removeMiddle(8);
		
		listTiga.displayElement();
		
		listTiga.removeMiddle(3);
		
		listTiga.displayElement();
		
		listTiga.removeTail();
		
		listTiga.displayElement();
		
		System.out.println("\nLatihan 5-2");
		StrukturList listEmpat = new StrukturList();
		listEmpat.addHead(2);
		listEmpat.addTail(3);
		listEmpat.addTail(4);
		listEmpat.addTail(8);
		listEmpat.addTail(1);
		listEmpat.addTail(9);
		
		listEmpat.displayElement();
		
		listEmpat.removeMiddle(8);
		
		listEmpat.displayElement();
		
		listEmpat.removeMiddle(3);
		
		listEmpat.displayElement();
		
		listEmpat.removeTail();
		
		listEmpat.displayElement();
		
    }
}