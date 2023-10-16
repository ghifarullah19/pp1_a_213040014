package pertemuan08_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Latihan 4
public class StrukturListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StrukturList list;
		
		//System.out.println("Latihan 6");
		list = new StrukturList();
		list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
		list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
		list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
		list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
		//list.displayElement();
		
		// Latihan 6
		//System.out.println("Jumlah Matakuliah: " + list.count());
		
		// Tugas 3
		/* System.out.print("\nMasukan kode yang akan dicari: ");
		String input = sc.next();
		System.out.println(list.find(input)); */
		
		System.out.println("===== LIST MATAKULIAH =====");
		int inputMenu;
		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Tambah Matakuliah di awal");
			System.out.println("2. Tambah Matakuliah di tengah");	
			System.out.println("3. Tambah Matakuliah di akhir");
			System.out.println("4. Hapus Matakuliah di awal");
			System.out.println("5. Hapus Matakuliah di tengah");
			System.out.println("6. Hapus Matakuliah di akhir");
			System.out.println("7. Cari Matakuliah");
			System.out.println("8. Hitung Matakuliah");
			System.out.println("9. Tampilkan seluruh Matakuliah");
			System.out.println("0. Kembali");
			
			System.out.print("=> " );
			inputMenu = sc.nextInt();
			switch (inputMenu) {
				case 1:
					System.out.println("\n== Tambah Matakuliah di depan ==");
					String kodeMatakuliah = "";
					String namaMatakuliah = "";
					
					try {
						System.out.print("Kode Matakuliah: ");
						kodeMatakuliah = br.readLine();
						System.out.print("Nama Matakuliah: ");
						namaMatakuliah = br.readLine();
					} catch (Exception e) {
						System.err.println("Terjadi ERROR");
					}
					
					System.out.print("SKS: ");
					int sksMatakuliah = sc.nextInt();
					
					list.addHead(new Matakuliah(kodeMatakuliah, namaMatakuliah, sksMatakuliah));
					System.out.println("Data berhasil ditambahkan.");
					break;
				case 2:
					System.out.println("\n== Tambah Matakuliah di tengah ==");
					kodeMatakuliah = "";
					namaMatakuliah = "";
					
					try {
						System.out.print("Kode Matakuliah: ");
						kodeMatakuliah = br.readLine();
						System.out.print("Nama Matakuliah: ");
						namaMatakuliah = br.readLine();
					} catch (Exception e) {
						System.err.println("Terjadi ERROR");
					}
					
					System.out.print("SKS: ");
					sksMatakuliah = sc.nextInt();
					System.out.print("Posisi Matakuliah: ");
					int posisi = sc.nextInt();
					
					list.addMiddle(new Matakuliah(kodeMatakuliah, namaMatakuliah, sksMatakuliah), posisi);
					System.out.println("Data berhasil ditambahkan.");
					break;
				case 3:
					System.out.println("\n== Tambah Matakuliah di akhir ==");
					kodeMatakuliah = "";
					namaMatakuliah = "";
					
					try {
						System.out.print("Kode Matakuliah: ");
						kodeMatakuliah = br.readLine();
						System.out.print("Nama Matakuliah: ");
						namaMatakuliah = br.readLine();
					} catch (Exception e) {
						System.err.println("Terjadi ERROR");
					}
					
					System.out.print("SKS: ");
					sksMatakuliah = sc.nextInt();
					
					list.addTail(new Matakuliah(kodeMatakuliah, namaMatakuliah, sksMatakuliah));
					System.out.println("Data berhasil ditambahkan.");
					break;
				case 4:
					System.out.println("\n== Hapus Matakuliah di awal ==");
					list.removeHead();
					System.out.println("Data berhasil dihapus.");
					break;
				case 5:
					System.out.println("\n== Hapus Matakuliah di tengah ==");
					kodeMatakuliah = "";
					
					try {
						System.out.print("Kode Matakuliah: ");
						kodeMatakuliah = br.readLine();
					} catch (Exception e) {
						System.err.println("Terjadi ERROR");
					}
					
					list.removeMiddle(kodeMatakuliah);
					System.out.println("Data berhasil dihapus.");
					break;
				case 6:
					System.out.println("\n== Hapus Matakuliah di akhir ==");
					list.removeTail();
					System.out.println("Data berhasil dihapus.");
					break;
				case 7:
					System.out.println("\n== Cari Matakuliah ==");
					kodeMatakuliah = "";
					
					try {
						System.out.print("Kode Matakuliah: ");
						kodeMatakuliah = br.readLine();
					} catch (Exception e) {
						System.err.println("Terjadi ERROR");
					}
					
					System.out.println(list.find(kodeMatakuliah));
					break;
				case 8:
					System.out.println("\n== Hitung Jumlah Matakuliah ==");
					System.out.println(list.count());
					break;
				case 9:
					System.out.println("\n== Tampilkan Semua Matakuliah ==");
					list.displayElement();
					break;
				case 0:
					System.out.println("\n== Anda telah keluar ==");
					break;
			}
			
		} while (inputMenu != 0);
    }
}
