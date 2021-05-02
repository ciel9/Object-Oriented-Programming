package umn.ac.id_30706;

import umn.ac.id_30706.MediaPromosi;

public class Majalah extends MediaPromosi{
	private int luas;
	private String letak;
	private String bidang;
	private String id;
	
	public Majalah() {}
	
	public Majalah(String id, String name, int luas, String letak, String bidang) {
		this.id = id;
		this.name = name;
		this.luas = luas;
		this.letak = letak;
		this.bidang = bidang;
	}
	
	public String getID() {
		return id;
	}
	
	public int getLuas() {
		return luas;
	}
	
	public String getLetak() {
		return letak;
	}
	
	public String getBidang() {
		return bidang;
	}
}
