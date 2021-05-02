package umn.ac.id_30706;

import umn.ac.id_30706.MediaPromosi;

public class Baliho extends MediaPromosi {
	private int luas;
	private String letak;
	private String id;
	public Baliho() {}
	
	public Baliho(String id,String name, int luas, String letak) {
		this.id = id;
		this.name = name;
		this.luas = luas;
		this.letak = letak;
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
	
}
