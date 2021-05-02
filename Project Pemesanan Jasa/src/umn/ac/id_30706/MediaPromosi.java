package umn.ac.id_30706;

public class MediaPromosi {
	protected String name;
	private int harga;
	public MediaPromosi() {}
	
	public MediaPromosi(String name, int harga) {
		this.name = name;
		this.harga = harga;
	}
	
	public String getNama() {
		return name;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setNama(String name) {
		this.name = name;
	}
}
