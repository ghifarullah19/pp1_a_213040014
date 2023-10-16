package pertemuan08_List;

// Latihan 1
public class Matakuliah {
	private String kode;
	private String nama;
	private int sks;
	
	public Matakuliah(String kode, String nama, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}
}
